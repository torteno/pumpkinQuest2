package com.example.pumpkinquest;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import javax.swing.JLabel;

public class magicSystem {


    static HashMap<String, String> spellSprite = new HashMap<>();
    static HashMap<String, Integer> spellSpeed = new HashMap<>();
    static HashMap<String, Integer> spellDamage = new HashMap<>();
    static HashMap<String, Integer> spellCast = new HashMap<>();
    static HashMap<String, Runnable> spells = new HashMap<>();
    static HashMap<String, JLabel> activeSpells = new HashMap<>();
    static HashMap<JLabel, Point> spellTargetPosition = new HashMap<>();




    private static frame mainFrame;
    private static JLabel magicOrb;

    private static Point mousePoint = new Point();

    static int playerCenterX;
    static int playerCenterY;
    static int radius = 100;
    static double mouseAndOrbSlope;

    static int mana = 100;
    static int manaRegeneration = 1;

    static int range = 1000;

    public magicSystem(frame gameFrame) {
        this.mainFrame = gameFrame;
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


    public static void spells() {
        spells.put("Fireball", () -> {
            cast("Fireball");
        });




    }




    public static void cast(String name) {
        int damage = spellDamage.get(name);
        int cost = spellCast.get(name);
        int speed = spellSpeed.get(name);
        String sprite = spellSprite.get(name);

        if(mana >= cost) {
            mana -= cost;
            projectile(name, damage, speed, sprite);
        } else {
            System.out.println("Not enough mana to cast " + name);
        }

    }

    public static void projectile(String name, int damage, int speed, String sprite) {

        UUID projectileUUID = UUID.randomUUID();

     //   activeSpells.put(name, projectileUUID);

        String projectileSprite = sprite;
        int projectileDamage = damage;
        int projectileSpeed = speed;

        JLabel projectileID = mainFrame.assets(magicOrb.getX(), magicOrb.getY(), magicOrb.getWidth(), magicOrb.getHeight(), false, spellSprite.get(name), true, 1, true);

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

    }

    public static void handleMouseDragged(MouseEvent e) {
        if (magicOrb != null) {
         //   magicOrb.setLocation(e.getX() - magicOrb.getWidth() / 2, e.getY() - magicOrb.getHeight() / 2);
        }
    }

    public static void magicSpellLoop() {

        mouseAndOrbSlope = (double) ((int) mousePoint.getX() - playerCenterX) /((int) mousePoint.getY() - playerCenterY);

        magicOrb.setLocation(
                (int)(playerCenterX + (mousePoint.getX() - playerCenterX) * radius / Math.max(1,Math.hypot(mousePoint.getX() - playerCenterX, mousePoint.getY() - playerCenterY)) - magicOrb.getWidth()/2),
                (int)(playerCenterY + (mousePoint.getY() - playerCenterY) * radius / Math.max(1,Math.hypot(mousePoint.getX() - playerCenterX, mousePoint.getY() - playerCenterY)) - magicOrb.getHeight()/2)
        );








    }



}
