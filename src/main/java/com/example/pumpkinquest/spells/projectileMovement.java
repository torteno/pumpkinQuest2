package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;
import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.manageAssets;
import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.UUID;

public class projectileMovement {

    private final frame myFrame;


    public projectileMovement(frame myFrame) {
        this.myFrame = myFrame; // gets the frame of the spell
    }






    public Point projectileMovementCalc(double x, double y, int orbSpeed, Point target, double maxDistance) { // calculates the movement of the projectile
    double distancex = target.x - x; // calculates the distance between the projectile and the target
    double distancey = target.y - y; // calculates the distance between the projectile and the target
    double dist = Math.sqrt(Math.pow(distancex, 2) + Math.pow(distancey, 2)); // calculates the distance between the projectile and the target

    // stop if reached destination
    if (dist < orbSpeed) {
        return new Point((int)x, (int)y);
    }

    int newX = (int)(x + (distancex / dist) * orbSpeed); // calculates the new x position of the projectile
    int newY = (int)(y + (distancey / dist) * orbSpeed); // calculates the new y position of the projectile
    return new Point(newX, newY); // returns the new position of the projectile
}
    // returns the new position of the mob as a Point object


    public JLabel checkForMobCollision(JLabel label) {
        // Check the new abstract-mob registry first so e.g. skeletons/zombies/spiders/slimes from
        // worldObjects can take damage. The keys here are the visible JLabels.
        for (JLabel mobLabel : manageAssets.mobs.keySet()) { // iterates through the mob hashmap
            if (mobLabel != null && label.getBounds().intersects(mobLabel.getBounds())) { // checks if the projectile intersects with the mob
                return mobLabel; // returns the mob
            }
        }
        // Legacy mob map fallback (older mobs created via mobCreation that aren't in manageAssets.mobs).
        for (Map.Entry<UUID, JLabel> entry : myFrame.mob.entrySet()) { // iterates through the mob hashmap
            if (label.getBounds().intersects(entry.getValue().getBounds())) { // checks if the projectile intersects with the mob
                return entry.getValue();
            }
        }
        return null;
    }

    public boolean checkForObjectCollision(JLabel label) { // checks if the projectile intersects with an object
        for (JLabel obstacles : myFrame.obstacles) { // code similar to geek by geeks post - https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/
            // checks if the upAttack JLabel intersects with the mob JLabel, if it does, it deals damage to the mob
            if (label.getBounds().intersects(obstacles.getBounds())) {
                return true;
            }
        }
        return false;
    }



}



