package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;
import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.manageAssets;
import com.example.pumpkinquest.mobs.mob;

import javax.swing.*;
import java.awt.*;

public class lightningSpell extends spells {

    private final frame myFrame;
    private JLabel lightningLabel; // the label for the spell
    private Point destination; // the destination of the spell
    private final projectileMovement movement; // the movement of the spell
    private boolean isMoving = false; // checks if the spell is moving


    private static final String ID = "lightning "; // SCREAMING SNAKE CASE :D Its been so long since I have gotten to use them correctly
    private static final int MANA_COST = 25; // the mana cost of the spell
    private static final int DAMAGE = 25; // the damage of the spell
    private static final int ORB_SPEED = 3; // the speed of the spell
    private static final String SPRITE_PATH = "images/magic/lightingOrb.png"; // the path to the sprite of the spell
    private static final double MAX_RANGE = 1000; // the max range of the spell

    public lightningSpell(JLabel label, frame myFrame) { // gets the label, ID, mana cost, damage, speed, sprite path, and max range of the spell
        super(label, ID, MANA_COST, DAMAGE, ORB_SPEED, SPRITE_PATH, MAX_RANGE);
        this.myFrame = myFrame;
        this.movement = new projectileMovement(myFrame);
    }

    @Override
    public void cast(spellContext context) { // casts the spell
        Point spawnWorld = context.getOrbWorldPosition(); // gets the position of the spell
        lightningLabel = myFrame.assets(spawnWorld.x, spawnWorld.y, 100, 100, false, SPRITE_PATH, false, 1, true); // creates the spell
        destination = context.getOrbWorldDestination(MAX_RANGE); // sets the destination of the spell
        isMoving = true; // sets the spell to moving
    }

    @Override
    public void update() { // updates the spell
        if(!isMoving || lightningLabel == null) { // checks if the spell is moving or if the spell is null
            return;
        }

        if(movement.checkForObjectCollision(lightningLabel)) { // checks for object collision
            isMoving = false; // sets the spell to not moving
            lightningLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(lightningLabel); // removes the spell from the frame
            return;
        }

        JLabel hitMob = movement.checkForMobCollision(lightningLabel); // checks for mob collision
        if(hitMob != null) { // checks if the mob is not null
            mob targetMob = manageAssets.mobs.get(hitMob); // gets the mob

            if (targetMob != null) { // checks if the mob is not null
                effect(targetMob); // applies the effect of the spell to the mob
            }

            isMoving = false; // sets the spell to not moving
            lightningLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(lightningLabel); // removes the spell from the frame
            return;
        }

        Point currentWorld = frame.AssetPoint.get(lightningLabel); // gets the position of the spell
        if (currentWorld == null) { // checks if the spell is null
            isMoving = false; // sets the spell to not moving
            return;
        }
        Point newPosition = movement.projectileMovementCalc(currentWorld.x, currentWorld.y, ORB_SPEED, destination, MAX_RANGE); // calculates the new position of the spell
        frame.AssetPoint.put(lightningLabel, newPosition); // sets the new position of the spell

        if (newPosition.equals(destination) || (Math.abs(newPosition.x - destination.x) < ORB_SPEED && Math.abs(newPosition.y - destination.y) < ORB_SPEED)) {
            isMoving = false; // sets the spell to not moving
            lightningLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(lightningLabel); // removes the spell from the frame
        }
    }

    @Override
    public boolean isMoving() { // returns if the spell is moving
        return isMoving;
    }


    @Override
    public void effect(mob target) {
        // apply this spell's damage to the specific mob that got hit
        target.takeDamage(DAMAGE);
    }
}
