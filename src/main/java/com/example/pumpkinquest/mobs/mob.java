package com.example.pumpkinquest.mobs;

import com.example.pumpkinquest.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class mob extends JLabel {



    private final int width, height; // width and height of the mob
    private int health; // health of the mob
    private final int damage; // damage of the mob
    private final int speed; // speed of the mob
    private Point position; // position of the mob
    private ImageIcon icon; // icon of the mob
    private final int followRange; // range in which the mob follows the player
    private final boolean closeAttack; // whether the mob can attack closely
    private final boolean rangedAttack; // whether the mob can attack from a distance
    private LocalDateTime lastAttackTime; // time since the mob last attacked
    private final long cooldown; // cooldown between attacks
    private int nodeX; // x coordinate of the node the mob is currently at
    private int nodeY; // y coordinate of the node the mob is currently at
    private double closeAttackRange = 100; // range in which the mob can attack closely
    //private int mobTick = 0; // tick of the mob
    

    public double getRangedAttackRange() { // gets the ranged attack range of the mob
        return rangedAttackRange;
    }

    public void setRangedAttackRange(double rangedAttackRange) { // sets the ranged attack range of the mob
        this.rangedAttackRange = rangedAttackRange;
    }

    public double getCloseAttackRange() { // gets the close attack range of the mob
        return closeAttackRange;
    }

    public void setCloseAttackRange(double closeAttackRange) { // sets the close attack range of the mob
        this.closeAttackRange = closeAttackRange;
    }

    private  double rangedAttackRange = 500; // range in which the mob can attack from a distance


    private ArrayList<nodes> currentPath = new ArrayList<>(); // current path of the mob

    private int pathNum = 0; // current path number of the mob
    private int tick = 0; // tick of the mob


    public int getNodeX() { // gets the x coordinate of the node the mob is currently at
        return nodeX;
    }

    public void setNodeX(int nodeX) { // sets the x coordinate of the node the mob is currently at
        this.nodeX = nodeX;
    }

    public int getNodeY() { // gets the y coordinate of the node the mob is currently at
        return nodeY;
    }

    public void setNodeY(int nodeY) { // sets the y coordinate of the node the mob is currently at
        this.nodeY = nodeY;
    }


    public Point getMobSpawnPoint() { // gets the spawn point of the mob
        return mobSpawnPoint;
    }

    public void setMobSpawnPoint(Point mobSpawnPoint) { // sets the spawn point of the mob
        this.mobSpawnPoint = mobSpawnPoint;
    }

    private Point mobSpawnPoint; // spawn point of the mob

    private final JLabel label; // label of the mob
    protected final frame Frame; // frame of the mob

    public mob(JLabel label, frame myframe, int width , int height, int health, int damage, int speed, Point position, String icon, int followRange, boolean closeAttack, boolean rangedAttack, LocalDateTime lastAttackTime, long cooldown) {
        this.label = label; // label of the mob
        this.width = width; // width of the mob
        this.height = height; // height of the mob
        this.health = health; // health of the mob
        this.damage = damage; // damage of the mob
        this.speed = speed; // speed of the mob
        this.position = position; // position of the mob
        nodeX = (position.x + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // x coordinate of the node the mob is currently at
        nodeY = (position.y + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // y coordinate of the node the mob is currently at
        this.icon = new ImageIcon(new ImageIcon(icon).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT)); // icon of the mob
        this.followRange = followRange; // range in which the mob follows the player
        this.closeAttack = closeAttack; // whether the mob can attack closely
        this.rangedAttack = rangedAttack; // whether the mob can attack from a distance
        this.lastAttackTime = lastAttackTime; // time since the mob last attacked
        this.cooldown = cooldown; // cooldown between attacks
        this.mobSpawnPoint = position; // spawn point of the mob
        this.Frame = myframe; // frame of the mob
    }


    public abstract void attackClose(); // abstract method for close attack
    public abstract void attackRanged(); // abstract method for ranged attack

    public void closeAttackDeafult(int cooldown, int damage, double range, boolean musicEffect) { // default close attack method
        int mobAttackCooldown = cooldown; // cooldown of the mob attack
        double mobReach = range; // range of the mob attack
        double mobDamage = damage; // damage of the mob attack

        Point mobWorldPos = position; // position of the mob
        double distance = Math.sqrt( // distance between the mob and the player
                Math.pow(((Frame.getPlayerWorldPos().x - 40) - mobWorldPos.getX()), 2) // difference in x coordinates
                        + Math.pow(((Frame.getPlayerWorldPos().y - 50) - mobWorldPos.getY()), 2)); // difference in y coordinates

        Duration durationMobAttack = Duration.between(lastAttackTime, LocalDateTime.now()); // duration since the mob last attacked
        if (distance <= mobReach && durationMobAttack.getSeconds() >= mobAttackCooldown) { // if the mob is in range and the cooldown has passed
            lastAttackTime = LocalDateTime.now(); // sets the last attack time to the current time
            Frame.healthChange(-mobDamage); // negative = damage the player
            if (musicEffect) { // if the music effect should be played
                try {
                    music.playClip("music/sword_hit.wav", 0); // plays the music effect
                } catch (Exception e) {
                    // swallow - sound failure shouldn't break attack
                }
            }
        }
    }



    public void rangedAttackDefault(String projectileFilePath, int projectileSpeed, double range) {







    }

    public void takeDamage(int damage) { // takes damage
        this.health -= damage; // reduces the health of the mob
        if (health <= 0) { // checks if the health is less than or equal to 0
            health = 0; // sets the health to 0
        }
    }


    public boolean isRangedAttack() {
        return rangedAttack; // returns true if the mob can attack from a distance
    }

    public boolean isCloseAttack() {
        return closeAttack; // returns true if the mob can attack closely
    }

    public int getFollowRange() { // gets the follow range of the mob
        return followRange;
    }

    @Override
    public Icon getIcon() { // gets the icon of the mob
        return icon;
    }

    @Override
    public void setIcon(Icon icon) { // sets the icon of the mob
        this.icon = (ImageIcon) icon; // sets the icon of the mob
        super.setIcon(icon); // sets the icon of the mob
    }

    public void setPosition(Point position) { // sets the position of the mob
        this.position = position; // sets the position of the mob

        this.nodeX = (position.x + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // sets the node coordinates of the mob
        this.nodeY = (position.y + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // sets the node coordinates of the mob
    }

    public int getSpeed() { // gets the speed of the mob
        return speed;
    }

    public int getDamage() { // gets the damage of the mob
        return damage;
    }

    public void setHealth(int health) { // sets the health of the mob
        this.health = health; // sets the health of the mob
    }

    public int getHealth() { // gets the health of the mob
        return health;
    }

    @Override
    public int getHeight() { // gets the height of the mob
        return height;
    }

    @Override
    public int getWidth() { // gets the width of the mob
        return width;
    }

    public LocalDateTime getLastAttackTime() { // gets the time since the mob last attacked
        return lastAttackTime;
    }

    public Point getPosition() { // gets the position of the mob
        return position;
    }

    public JLabel getLabel() { // gets the label of the mob
        return label;
    }

    public boolean isDead() { // checks if the mob is dead
        return health <= 0;
    }


    public int getPathNum() {
        return pathNum;
    }

    public void setPathNum(int pathNum) {
        this.pathNum = pathNum;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public ArrayList<nodes> getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(ArrayList<nodes> currentPath) {
        this.currentPath = currentPath;
    }
}


