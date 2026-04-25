package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;
import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.manageAssets;
import com.example.pumpkinquest.mobs.mob;

import javax.swing.*;
import java.awt.*;

public class fireballSpell extends spells {

    private final frame myFrame; 
    private JLabel fireballLabel;       // mutated each cast — not final
    private Point destination;          // mutated each cast — not final
    private final projectileMovement movement; // collision helper — set once in constructor
    private boolean isMoving = false;   


    private static final String ID = "fireball"; // id of the spell
    private static final int MANA_COST = 25; // mana cost of the spell
    private static final int DAMAGE = 25; // damage of the spell
    private static final int ORB_SPEED = 3; // speed of the spell
    private static final String SPRITE_PATH = "images/magic/fireOrb.png"; // sprite of the spell
    private static final double MAX_RANGE = 1000; // range of the spell

    public fireballSpell(JLabel label, frame myFrame) { // constructor
        super(label, ID, MANA_COST, DAMAGE, ORB_SPEED, SPRITE_PATH, MAX_RANGE); // calls the constructor of the parent class
        this.myFrame = myFrame; // sets the main frame of the game
        this.movement = new projectileMovement(myFrame); // creates the projectile movement
    }

    @Override
    public void cast(spellContext context) { // casts the spell
        Point spawnWorld = context.getOrbWorldPosition(); // gets the position of the spell
        fireballLabel = myFrame.assets(spawnWorld.x, spawnWorld.y, 100, 100, false, SPRITE_PATH, false, 1, true); // creates the spell
        destination = context.getOrbWorldDestination(MAX_RANGE); // sets the destination of the spell
        isMoving = true; // sets the spell to moving
    }

    @Override
    public void update() { // updates the spell
        if(!isMoving || fireballLabel == null) { // checks if the spell is moving or if the spell label is null
            return; // returns if the spell is not moving or if the spell label is null
        }

        if(movement.checkForObjectCollision(fireballLabel)) { // checks if the spell has collided with an object
            isMoving = false; // sets the spell to not moving
            fireballLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(fireballLabel); // removes the spell from the frame
            return; // returns if the spell has collided with an object
        }

        JLabel hitMob = movement.checkForMobCollision(fireballLabel); // checks if the spell has collided with a mob
        if(hitMob != null) { // checks if the spell has collided with a mob
            mob targetMob = manageAssets.mobs.get(hitMob); // gets the mob that the spell has collided with

            if (targetMob != null) { // checks if the mob is not null
                effect(targetMob); // applies the effect of the spell to the mob
            }

            isMoving = false; // sets the spell to not moving
            fireballLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(fireballLabel); // removes the spell from the frame
            return; // returns if the spell has collided with a mob
        }

        Point currentWorld = frame.AssetPoint.get(fireballLabel); // gets the current position of the spell
        if (currentWorld == null) { // checks if the current position of the spell is null
            isMoving = false; // sets the spell to not moving
            return; // returns if the current position of the spell is null
        }
        Point newPosition = movement.projectileMovementCalc(currentWorld.x, currentWorld.y, ORB_SPEED, destination, MAX_RANGE); // calculates the new position of the spell
        frame.AssetPoint.put(fireballLabel, newPosition); // sets the new position of the spell

        if (newPosition.equals(destination) || (Math.abs(newPosition.x - destination.x) < ORB_SPEED && Math.abs(newPosition.y - destination.y) < ORB_SPEED)) { // checks if the new position of the spell is equal to the destination or if the new position of the spell is close to the destination
            isMoving = false; // sets the spell to not moving
            fireballLabel.setVisible(false); // sets the spell to not visible
            frame.AssetPoint.remove(fireballLabel); // removes the spell from the frame
        }
    }

    @Override // overrides the isMoving method
    public boolean isMoving() { // returns if the spell is moving
        return isMoving;
    }


    @Override
    public void effect(mob target) {
        // apply this spell's damage to the specific mob that got hit
        target.takeDamage(DAMAGE);
    }
}
