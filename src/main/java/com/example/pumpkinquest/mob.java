package com.example.pumpkinquest;

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



    private final int width, height;
    private int health;
    private final int damage;
    private final int speed;
    private Point position;
    private ImageIcon icon;
    private final int followRange;
    private final boolean closeAttack;
    private final boolean rangedAttack;
    private LocalDateTime lastAttackTime;
    private final long cooldown;
    private int nodeX;
    private int nodeY;
    private double closeAttackRange = 100;

    public double getRangedAttackRange() {
        return rangedAttackRange;
    }

    public void setRangedAttackRange(double rangedAttackRange) {
        this.rangedAttackRange = rangedAttackRange;
    }

    public double getCloseAttackRange() {
        return closeAttackRange;
    }

    public void setCloseAttackRange(double closeAttackRange) {
        this.closeAttackRange = closeAttackRange;
    }

    private  double rangedAttackRange = 500;


    public ArrayList<nodes> currentPath = new ArrayList<>();

    public int pathNum = 0;
    public int tick = 0;


    public int getNodeX() {
        return nodeX;
    }

    public void setNodeX(int nodeX) {
        this.nodeX = nodeX;
    }

    public int getNodeY() {
        return nodeY;
    }

    public void setNodeY(int nodeY) {
        this.nodeY = nodeY;
    }


    public Point getMobSpawnPoint() {
        return mobSpawnPoint;
    }

    public void setMobSpawnPoint(Point mobSpawnPoint) {
        this.mobSpawnPoint = mobSpawnPoint;
    }

    private Point mobSpawnPoint;

    private JLabel label;
    protected frame Frame;

    public mob(JLabel label, frame myframe, int width , int height, int health, int damage, int speed, Point position, String icon, int followRange, boolean closeAttack, boolean rangedAttack, LocalDateTime lastAttackTime, long cooldown) {
        this.label = label;
        this.width = width;
        this.height = height;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.position = position;
        nodeX = position.x/mobMovement.nodeSize;
        nodeY = position.y/mobMovement.nodeSize;
        this.icon = new ImageIcon(new ImageIcon(icon).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        this.followRange = followRange;
        this.closeAttack = closeAttack;
        this.rangedAttack = rangedAttack;
        this.lastAttackTime = lastAttackTime;
        this.cooldown = cooldown;
        this.mobSpawnPoint = position;
        this.Frame = myframe;
    }


    public abstract void attackClose();
    public abstract void attackRanged();

    public void closeAttackDeafult(int cooldown, int damage, double range, boolean musicEffect) {


            int mobAttackCooldown = cooldown; // gets the mob's attack cooldown from the MobAttackCooldown map, if it doesn't exist, it defaults to 0
            double mobReach = range; // gets the mob's reach from the MobReach map, if it doesn't exist, it defaults to 0
            double mobDamage = damage; // gets the mob's damage from the MobDamage map, if it doesn't exist, it defaults to 0.0
            long mobCooldown = cooldown; // gets the mob's current attack cooldown from the MobAttackCurrentCoolDown map, if it doesn't exist, it defaults to 0L
            Duration timeSinceAttack = Duration.between(lastAttackTime, LocalDateTime.now()); // gets the time since the mob attacked from the TimeMobAttacked map, if it doesn't exist, it defaults to LocalDateTime.MIN
           // double mobDistance = MobDistance.getOrDefault(mobID, Double.MAX_VALUE); // gets the distance between the player and the mob from the MobDistance map, if it doesn't exist, it defaults to Double.MAX_VALUE
          //  Duration durationMobAttack = TimeSinceMobAttacked.getOrDefault(mobID, Duration.ZERO); // gets the duration since the mob was attacked from the TimeSinceMobAttacked map, if it doesn't exist, it defaults to Duration.ZERO

            Point mobWorldPos = position; // gets the world position of the mob from the mobPoint map, which maps JLabels to Point objects
            double distance = Math.sqrt(Math.pow(((Frame.getPlayerWorldPos().x - 40) - mobWorldPos.getX()), 2) + Math.pow(((Frame.getPlayerWorldPos().y - 50) - mobWorldPos.getY()), 2)); // calculates the distance between the player and the mob using the distance formula



         //   mobDistance = distance; // updates the mobDistance variable with the calculated distance
          //  MobDistance.put(mobID, mobDistance); // updates the MobDistance map with the new distance value for the mob
            //System.out.println("Mob Distance: " + mobDistance + "Mob Cooldown: " + mobCooldown);
            //  System.out.println("Mob Distance: " + mobDistance + "Mob Cooldown: " + mobCooldown);


           Duration durationMobAttack = Duration.between(lastAttackTime, LocalDateTime.now()); // calculates the duration since the mob was last attacked by subtracting the time since the last attack from the current time
        lastAttackTime = LocalDateTime.now();




        mobCooldown = (Math.abs(timeSinceAttack.get(ChronoUnit.SECONDS))); // calculates the mob's current cooldown by getting the absolute value of the duration in seconds since the last attack

           // MobAttackCurrentCoolDown.put(mobID, mobCooldown); // updates the MobAttackCurrentCoolDown map with the new cooldown value for the mob


            if (distance <= mobReach) { // checks if the distance between the player and the mob is less than or equal to the mob's reach
                timeSinceAttack = Duration.between(lastAttackTime, LocalDateTime.now()); // calculates the duration since the mob was last attacked by subtracting the time since the last attack from the current time
                mobCooldown = (Math.abs(durationMobAttack.get(ChronoUnit.SECONDS))); // calculates the mob's current cooldown by getting the absolute value of the duration in seconds since the last attack
                if (mobCooldown >= (long) mobAttackCooldown) { // checks if the mob's current cooldown is greater than or equal to the mob's attack cooldown
                    if (musicEffect) {
                        try {
                            music.playClip("music" + File.separator + "swipe.wav", 0); // plays the mob's attack sound effect
                        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException j) {
                            j.printStackTrace(); // Handle exceptions
                        }
                    }
                    Frame.healthChange(damage); // reduces the player's health by the mob's damage
                   // TimeMobAttacked.put(mobID, LocalDateTime.now()); // updates the time since the mob was attacked to the current time
                    lastAttackTime = LocalDateTime.now(); // updates the time since the mob was attacked to the current time

                }
            }
        }


    public void rangedAttackDefault(String projectileFilePath, int projectileSpeed, double range) {







    }


    public boolean isRangedAttack() {
        return rangedAttack;
    }

    public boolean isCloseAttack() {
        return closeAttack;
    }

    public int getFollowRange() {
        return followRange;
    }

    @Override
    public Icon getIcon() {
        return icon;
    }

    @Override
    public void setIcon(Icon icon) {
        this.icon = (ImageIcon) icon;
        super.setIcon(icon);
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public LocalDateTime getLastAttackTime() {
        return lastAttackTime;
    }

    public Point getPosition() {
        return position;
    }




}


