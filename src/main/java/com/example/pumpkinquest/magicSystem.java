package com.example.pumpkinquest;

import com.example.pumpkinquest.spells.fireballSpell;
import com.example.pumpkinquest.spells.lightningSpell;
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


    static HashMap<String, String> spellSprite = new HashMap<>(); // Stores the sprite of the spell
    static HashMap<String, Integer> spellSpeed = new HashMap<>(); // Stores the speed of the spell
    static HashMap<String, Integer> spellDamage = new HashMap<>(); // Stores the damage of the spell
    static HashMap<String, Integer> spellCast = new HashMap<>(); // Stores the mana cost of the spell
    static HashMap<String, Runnable> spellsHashmap = new HashMap<>(); // Stores the spell effect

    public static ArrayList<spells> getActiveSpells() { // Returns the active spells
        return activeSpells;
    }

    public static void addActiveSpells(spells spell) { // Adds a spell to the active spells
        magicSystem.activeSpells.add(spell);
    }

    //static HashMap<String, JLabel> activeSpells = new HashMap<>();
    static ArrayList<spells> activeSpells = new ArrayList<spells>(); // Stores the active spells
    static HashMap<JLabel, Point> spellTargetPosition = new HashMap<>(); // Stores the target position of the spell




    private static frame mainFrame; // The main frame of the game
    public static JLabel magicOrb; // The magic orb that is displayed on the screen

    private static Point mousePoint = new Point(); // The position of the mouse

    static int playerCenterX; // The center x position of the player
    static int playerCenterY; // The center y position of the player
    static final int radius = 80; // The radius of the magic orb to the player
    static double mouseAndOrbSlope; // The slope of the mouse and the magic orb

    static int mana = 100; // The mana of the player
    static int manaRegeneration = 1; // The mana regeneration of the player

    static int range = 1000; // The range of the spell

    static int activeSpell = frame.activeSpell; // The active spell

    public magicSystem(frame gameFrame) {

        this.mainFrame = gameFrame; // Sets the main frame of the game
        spellList(); // Adds the spells to the hashmap

    }

   /*  public magicSystem() {

    } */


    //public component

    public void addSpell(String sprite, String name, int speed, int damage, int cost, String effect) { // Adds a spell to the hashmap
        spellSprite.put(name, sprite); // Adds the sprite of the spell
        spellSpeed.put(name, speed); // Adds the speed of the spell
        spellDamage.put(name, damage); // Adds the damage of the spell
        spellCast.put(name, cost); // Adds the mana cost of the spell
    }






    public static void magicSystem() { // Calls the orb positioning method

        orbPositioning(); // Calls the orb positioning method
    }


    public static void switchActiveSpell() { // Switches the active spell
        if (mainFrame != null && mainFrame.activeSpellText != null) { // Checks if the main frame and the active spell text are not null
            String spellName = switch (activeSpell) { // Checks the active spell and returns the name of the spell
                case 0 -> "Fireball"; // Sets the active spell to fireball
                case 1 -> "Lightning"; // Sets the active spell to lightning
                case 2 -> "Light"; // Sets the active spell to light
                default -> "None"; // Sets the active spell to none
            };
            mainFrame.activeSpellText.setText("Active Spell: " + spellName); // Sets the active spell text in the box in the bottom right(which hopefully is working by the time you read this Mr. Nucci)
        }
    }


    public static void spellList() { // Adds the spells to the hashmap
        spellsHashmap.put("Fireball", () -> {
            cast("Fireball"); // adds fireball to the hashmap
        });
        spellsHashmap.put("Lightning", () -> {
            cast("Lightning"); // adds lightning to the hashmap
        });
        spellsHashmap.put("light", () -> {
            cast("light"); // adds light to the hashmap
        });
    }




    public static void cast(String name) {
        
        spells spell = null; // Creates a spell object

        switch(name.toLowerCase()) {

            //Lambda functions :D they are so useful, learnt them last year for the game project

            case "fireball" -> spell = new fireballSpell(null, mainFrame); // Creates a fireball spell object
            case "lightning" -> spell = new lightningSpell(null, mainFrame); // Creates a lightning spell object
        }

        if(activeTool.staff && spell != null) { // Checks if the active tool is a staff and if the spell object is not null
            System.out.println("Mana: " + mana + " Cost: " + spell.getManaCost()); // Prints the mana and the mana cost of the spell
            if (mana >= spell.getManaCost()) { // Checks if the mana is greater than or equal to the mana cost of the spell
                mana -= spell.getManaCost(); // Subtracts the mana cost of the spell from the mana
                spellContext context = new spellContext(mainFrame); // Creates a spell context object
                spell.cast(context); // Casts the spell
                activeSpells.add(spell); // Adds the spell to the active spells
            } else {
                System.out.println("Not enough mana to cast " + name);
            }
        }
    }







    public static void projectile(String name, int damage, int speed, String sprite) { // Creates a projectile and its final target

        UUID projectileUUID = UUID.randomUUID(); // Creates a unique identifier for the projectile

     //   activeSpells.put(name, projectileUUID);

        String projectileSprite = sprite; // Stores the sprite of the projectile
        int projectileDamage = damage; // Stores the damage of the projectile
        int projectileSpeed = speed; // Stores the speed of the projectile

        JLabel projectile = mainFrame.assets(magicOrb.getX(), magicOrb.getY(), magicOrb.getWidth(), magicOrb.getHeight(), false, spellSprite.get(name), true, 1, true); // Creates the projectile

        double orbToMouseAngle = Math.atan(mouseAndOrbSlope); // Calculates the angle of the mouse and the magic orb

        double locationX = (magicOrb.getX() + magicOrb.getWidth() / 2) + range * Math.cos(orbToMouseAngle); // Calculates the x position of the projectile
        double locationY = (magicOrb.getY() + magicOrb.getHeight() / 2) + range * Math.sin(orbToMouseAngle); // Calculates the y position of the projectile

        Point targetPosition = new Point((int)locationX, (int)locationY); // Creates a point with the target position of the projectile
        //spellTargetPosition.put(projectileUUID, targetPosition);
    }









    public static void landEffects(String name) { // Creates the landing effects of the spell, not currently being used

        switch(name) { // Checks the name of the spell
            case "Fireball": // If the spell is a fireball
                System.out.println("Fireball landed, dealing " + spellDamage.get(name) + " damage."); 
                break;
            case "lightning": // If the spell is a lightning
                System.out.println("Lightning landed, dealing " + spellDamage.get(name) + " damage."); 
        }

    }





    public static void orbPositioning() { // Positions the magic orb around the player

        playerCenterX = mainFrame.player.getX() + mainFrame.player.getWidth() / 2; // Gets the x position of the player
        playerCenterY = mainFrame.player.getY() + mainFrame.player.getHeight() / 2; // Gets the y position of the player

        magicOrb = mainFrame.GUIassets(playerCenterX + radius, playerCenterY + radius, 100, 100, false, "images/magic/Magic_Orb.png", false, 1, true); // Creates the magic orb JLabel with the GUI assets method so it doesnt get affected by player movement in terms of positioning


        mainFrame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() { // Adds a mouse motion listener to the main frame
            @Override // Overrides the mouseDragged method
            public void mouseDragged(MouseEvent e) { // Handles the mouse dragged event
                handleMouseDragged(e); // Calls the handleMouseDragged method
            }

            @Override // Overrides the mouseMoved method
            public void mouseMoved(MouseEvent e) { // Handles the mouse moved event
                super.mouseMoved(e); // Calls the mouseMoved method
                mousePoint = e.getPoint(); // Gets the mouse point

            }

        });

        double angle = Math.atan2(mousePoint.getY() - playerCenterY, mousePoint.getX() - playerCenterY); // Calculates the angle of the mouse and the magic orb

        int radiusOfOrbToPlayer = 60; // Sets the radius of the magic orb to the player
        double orbLocationX = playerCenterX + Math.cos(angle) * radius; // Calculates the x position of the magic orb
        double orbLocationY = playerCenterY + Math.sin(angle) * radius; // Calculates the y position of the magic orb

        magicOrb.setLocation((int) (orbLocationX - (double) magicOrb.getX() /2),(int) (orbLocationY - (double) magicOrb.getY() /2) ); // Sets the location of the magic orb


        mainFrame.getContentPane().addMouseListener(new MouseListener() { // Adds a mouse listener to the main frame
            @Override // Overrides the mouseClicked method
            public void mouseClicked(MouseEvent e) { // Handles the mouse clicked event
                handleMouseClicked(e); // Calls the handleMouseClicked method
            }

            @Override // Overrides the mousePressed method
            public void mousePressed(MouseEvent e) { // Handles the mouse pressed event

            }

            @Override // Overrides the mouseReleased method
            public void mouseReleased(MouseEvent e) { // Handles the mouse released event

            }

            @Override // Overrides the mouseEntered method
            public void mouseEntered(MouseEvent e) { // Handles the mouse entered event

            }

            @Override // Overrides the mouseExited method
            public void mouseExited(MouseEvent e) { // Handles the mouse exited event

            }
        });

    }

    public static Point getShotLocation(double maxDistance) { // Gets the shot location of the projectile

        Point orbPoint = new Point(); // Creates a point for the orb
        double orbX = magicOrb.getX(); // Gets the x position of the orb
        double orbY = magicOrb.getY(); // Gets the y position of the orb

        double distanceX = mousePoint.getX() - orbX; // Calculates the distance between the mouse and the orb
        double distanceY = mousePoint.getY() - orbY; // Calculates the distance between the mouse and the orb

        double hypDistance = Math.sqrt(distanceX * distanceX + distanceY * distanceY); // Calculates the hypotenuse of the distance between the mouse and the orb

        double maxOrbDistance = maxDistance; // Sets the maximum distance of the orb
        int finalPointOrSmthX; // Stores the final x position of the orb
        int finalPointOrSmthY; // Stores the final y position of the orb

    if(hypDistance != 0) { // Checks if the distance between the mouse and the orb is not 0
        finalPointOrSmthX = (int) (orbX + (distanceX/hypDistance) * maxOrbDistance); // Calculates the final x position of the orb
        finalPointOrSmthY = (int) (orbY + (distanceY/hypDistance) * maxOrbDistance); // Calculates the final y position of the orb

    } else {
        finalPointOrSmthX = (int) orbX; // Sets the final x position of the orb to the x position of the orb
        finalPointOrSmthY = (int) orbY; // Sets the final y position of the orb to the y position of the orb
    }

    orbPoint.x = finalPointOrSmthX; // Sets the x position of the orb
    orbPoint.y = finalPointOrSmthY; // Sets the y position of the orb



        return orbPoint; // Returns the orb point
    }



    public static void handleMouseDragged(MouseEvent e) { // unused method that basically just checks for when you are moving your mouse while your left mouse button is down
        if (magicOrb != null) {
         //   magicOrb.setLocation(e.getX() - magicOrb.getWidth() / 2, e.getY() - magicOrb.getHeight() / 2);
        }
    }

    public static void handleMouseClicked(MouseEvent e) { // Handles the mouse clicked event
        if (!activeTool.staff) return; // Checks if the staff is active
        switch (activeSpell) { // Checks the active spell
            case 0: // If the active spell is fireball
                if (spellsHashmap.containsKey("Fireball")) {   
                spellsHashmap.get("Fireball").run();
                } // Runs the fireball spell
                break; 
            case 1: // If the active spell is lightning
                if (spellsHashmap.containsKey("Lightning")) {
                    spellsHashmap.get("Lightning").run();
                }
                break; 
            case 2: // If the active spell is light
                if (spellsHashmap.containsKey("light")) 
                    {
                        spellsHashmap.get("light").run();
                    }
                break;
            default:
                System.out.println("No spell selected");
                break;
        }
    }

    public static void magicSpellLoop() { // Main loop for the magic system, which is called every frame and updates the magic orb's position and visibility
        switchActiveSpell(); // Update display even if staff not held

        if (magicOrb == null) {
            return;
        }
        magicOrb.setVisible(activeTool.staff); // stes the visibility of the magic orb to if the staff is out or not. 

        if (!activeTool.staff || mousePoint == null) { // Checks if the staff is active or if the mouse point is null
            return;
        }


        playerCenterX = mainFrame.player.getX() + mainFrame.player.getWidth() / 2; // gets the center x position of the player
        playerCenterY = mainFrame.player.getY() + mainFrame.player.getHeight() / 2; // gets the center y position of the player

        double distanceX = mousePoint.getX() - playerCenterX; // gets the distance between the mouse and the player
        double distancey = mousePoint.getY() - playerCenterY; // gets the distance between the mouse and the player
        double distance = Math.max(1, Math.hypot(distanceX, distancey)); // gets the distance between the mouse and the player

        if(distanceX == 0) {
            mouseAndOrbSlope = distancey/0.0001; // avoids division by zero
        } else {
            mouseAndOrbSlope = distancey/distanceX; // gets the slope of the mouse and the player
        }


        magicOrb.setLocation( (int)(playerCenterX + (distanceX * radius / distance) - magicOrb.getWidth()/2.0), (int)(playerCenterY + (distancey * radius / distance) - magicOrb.getHeight()/2.0)); // sets the location of the magic orb
    }

    public static Point getMousePoint() { // returns the mouse point
        return mousePoint;
    }
}
