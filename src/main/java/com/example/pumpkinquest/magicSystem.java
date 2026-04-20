package com.example.pumpkinquest;

import com.example.pumpkinquest.spells.fireballSpell;
import com.example.pumpkinquest.spells.spellContext;
import  com.example.pumpkinquest.spells.spells;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import javax.swing.*;

public class magicSystem {


    static HashMap<String, String> spellSprite = new HashMap<>();
    static HashMap<String, Integer> spellSpeed = new HashMap<>();
    static HashMap<String, Integer> spellDamage = new HashMap<>();
    static HashMap<String, Integer> spellCast = new HashMap<>();
    static HashMap<String, Runnable> spellsHashmap = new HashMap<>();

    public static ArrayList<spells> getActiveSpells() {
        return activeSpells;
    }

    public static void addActiveSpells(spells spell) {
        magicSystem.activeSpells.add(spell);
    }

    //static HashMap<String, JLabel> activeSpells = new HashMap<>();
    static ArrayList<spells> activeSpells = new ArrayList<spells>();
    static HashMap<JLabel, Point> spellTargetPosition = new HashMap<>();




    private static frame mainFrame;
    public static JLabel magicOrb;

    private static Point mousePoint = new Point();

    static int playerCenterX;
    static int playerCenterY;
    static int radius = 100;
    static double mouseAndOrbSlope;

    static int mana = 100;
    static int manaRegeneration = 1;

    static int range = 1000;

    static int activeSpell = frame.activeSpell;

    public magicSystem(frame gameFrame) {
        this.mainFrame = gameFrame;
    }

    public magicSystem() {

    }


    //public component

    public void addSpell(String sprite, String name, int speed, int damage, int cost, String effect) {
        spellSprite.put(name, sprite);
        spellSpeed.put(name, speed);
        spellDamage.put(name, damage);
        spellCast.put(name, cost);
    }






    public static void magicSystem() {

        orbPositioning();
    }


    public static void switchActiveSpell() {
        switch(activeSpell) {
            case 0:
                magicOrb.setIcon(new ImageIcon("/images/magic/fireOrb.png"));
            case 1:
                magicOrb.setIcon(new ImageIcon("/images/magic/lightningOrb.png"));
                break;
            case 2:
                magicOrb.setIcon(new ImageIcon("/images/magic/lightOrb.png"));
                break;
        }




    }


    public static void spellList() {
        spellsHashmap.put("Fireball", () -> {
            cast("Fireball");
        });
        spellsHashmap.put("Lightning", () -> {
            cast("Lightning");
        });
        spellsHashmap.put("light", () -> {
            cast("light");
        });
    }




    public static void cast(String name) {

        JLabel orb = mainFrame.assets(magicOrb.getX(), magicOrb.getY(), magicOrb.getWidth(), magicOrb.getHeight(), false, "images/magic/" + name + ".png", false, 2, true);

        spells spell = null;

        switch(name) {
            case("fireball") -> {
                spell = new fireballSpell(orb);
                activeSpells.add(spell);
            }
            case("lightning") -> {



            }
        }



        if(activeTool.staff) {


            if (mana >= spell.getManaCost()) {
                mana -= spell.getManaCost();

                spellContext context = new spellContext();

                spell.cast(context);


            } else {
                System.out.println("Not enough mana to cast " + name);
            }
        }

    }







    public static void projectile(String name, int damage, int speed, String sprite) {

        UUID projectileUUID = UUID.randomUUID();

     //   activeSpells.put(name, projectileUUID);

        String projectileSprite = sprite;
        int projectileDamage = damage;
        int projectileSpeed = speed;

        JLabel projectile = mainFrame.assets(magicOrb.getX(), magicOrb.getY(), magicOrb.getWidth(), magicOrb.getHeight(), false, spellSprite.get(name), true, 1, true);

        double orbToMouseAngle = Math.atan(mouseAndOrbSlope);

        double locationX = (magicOrb.getX() + magicOrb.getWidth() / 2) + range * Math.cos(orbToMouseAngle);
        double locationY = (magicOrb.getY() + magicOrb.getHeight() / 2) + range * Math.sin(orbToMouseAngle);

        Point targetPosition = new Point((int)locationX, (int)locationY);
        //spellTargetPosition.put(projectileUUID, targetPosition);
    }









    public static void landEffects(String name) {

        switch(name) {
            case "Fireball":
                System.out.println("Fireball landed, dealing " + spellDamage.get(name) + " damage.");
                break;
            case "lightning":
                System.out.println("Lightning landed, dealing " + spellDamage.get(name) + " damage.");
                break;
            default:
                System.out.println("No landing effect for " + name);
                break;
        }

    }





    public static void orbPositioning() {

        playerCenterX = mainFrame.player.getX() + mainFrame.player.getWidth() / 2;
        playerCenterY = mainFrame.player.getY() + mainFrame.player.getHeight() / 2;

        magicOrb = mainFrame.GUIassets(playerCenterX + radius, playerCenterY + radius, 100, 100, false, "images/magic/Magic_Orb.png", false, 1, true);


        mainFrame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                handleMouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                mousePoint = e.getPoint();

            }

        });

        double angle = Math.atan2(mousePoint.getY() - playerCenterY, mousePoint.getX() - playerCenterY);

        int radiusOfOrbToPlayer = 60;
        double orbLocationX = playerCenterX + Math.cos(angle) * radius;
        double orbLocationY = playerCenterY + Math.sin(angle) * radius;

        magicOrb.setLocation((int) (orbLocationX - (double) magicOrb.getX() /2),(int) (orbLocationX - (double) magicOrb.getY() /2) );


        mainFrame.getContentPane().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleMouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public static Point getShotLocation() {

        Point orbPoint = new Point();
        double orbX = magicOrb.getX();
        double orbY = magicOrb.getY();

        double distanceX = orbX - mousePoint.getX();
        double distanceY = orbY - mousePoint.getY();

        double hypDistance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);

        double maxOrbDistance = 1000;
        int finalPointOrSmthX;
        int finalPointOrSmthY;

    if(hypDistance != 0) {
        finalPointOrSmthX = (int) (orbX + (distanceX/hypDistance) * maxOrbDistance);
        finalPointOrSmthY = (int) (orbY + (distanceY/hypDistance) * maxOrbDistance);

    } else {
        finalPointOrSmthX = (int) orbX;
        finalPointOrSmthY = (int) orbY;
    }

    orbPoint.x = finalPointOrSmthX;
    orbPoint.y = finalPointOrSmthY;



        return orbPoint;
    }



    public static void handleMouseDragged(MouseEvent e) {
        if (magicOrb != null) {
         //   magicOrb.setLocation(e.getX() - magicOrb.getWidth() / 2, e.getY() - magicOrb.getHeight() / 2);
        }
    }

    public static void handleMouseClicked(MouseEvent e) {
        switch (activeSpell) {
            case 0:
                spellsHashmap.get("Fireball").run();
                break;
            case 1:
                spellsHashmap.get("Lightning").run();
                break;
            case 2:
                spellsHashmap.get("light").run();
                break;
            default:
                System.out.println("No spell selected");
                break;
        }
    }

    public static void magicSpellLoop() {
        switchActiveSpell();
        mouseAndOrbSlope = (double) ((int) mousePoint.getX() - playerCenterX) /((int) mousePoint.getY() - playerCenterY);

        magicOrb.setLocation(
                (int)(playerCenterX + (mousePoint.getX() - playerCenterX) * radius / Math.max(1,Math.hypot(mousePoint.getX() - playerCenterX, mousePoint.getY() - playerCenterY)) - magicOrb.getWidth()/2),
                (int)(playerCenterY + (mousePoint.getY() - playerCenterY) * radius / Math.max(1,Math.hypot(mousePoint.getX() - playerCenterX, mousePoint.getY() - playerCenterY)) - magicOrb.getHeight()/2)
        );

    }

    public static Point getMousePoint() {
        return mousePoint;
    }



}
