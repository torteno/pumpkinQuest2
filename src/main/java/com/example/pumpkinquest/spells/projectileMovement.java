package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;
import com.example.pumpkinquest.frame;
import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.UUID;

public class projectileMovement {

    magicSystem magic = new magicSystem();
    frame myFrame = new frame();





    public Point projectileMovement(int x, int y, int orbSpeed, Point spawnPoint, int maxDistance) {
        int distance = (int) Math.sqrt(Math.pow((x - magicSystem.magicOrb.getWidth()) - spawnPoint.getX(), 2) + Math.pow(((y - magicSystem.magicOrb.getHeight()) - spawnPoint.getY()), 2)); // calculates the distance between the player and the mob using the distance formula


        double distanceX = spawnPoint.x - x; // calculates the distance between the player and the mob in the x direction
        double distanceY = spawnPoint.y - y; // calculates the distance between the player and the mob in the y direction

        double slope = (double) (spawnPoint.y - y) / (spawnPoint.x - x); // calculates the slope of the line between the player and the mob

        double b = spawnPoint.y - slope * spawnPoint.x; // calculates the y-intercept of the line between the player and the mob


        if (distanceX != 0) { // if the distance between the player and the mob in the x direction is not equal to 0, the mob will move towards the player

            slope = distanceY / distanceX; // calculates the slope of the line between the player and the mob in the x direction
            b = spawnPoint.y - slope * spawnPoint.x; // calculates the y-intercept of the line between the player and the mob in the x direction


            if (Math.abs(distanceX) > Math.abs(distanceY)) { // if the absolute value of the distance between the player and the mob in the x direction is greater than the absolute value of the distance between the player and the mob in the y direction, the mob will move towards the player in the x direction
                if (spawnPoint.x > x) { // if the player's x position is greater than the mob's x position, the mob will move towards the player in the x direction
                    x += orbSpeed; // increments the mob's x position by the mob's speed

                } else {
                    x -= orbSpeed; // decrements the mob's x position by the mob's speed
                }

                y = (int) (slope * x + b); // calculates the mob's y position based on the slope and the mob's x position
            } else {

                if (spawnPoint.y > y) { // if the player's y position is greater than the mob's y position, the mob will move towards the player in the y direction
                    y += orbSpeed;
                } else {
                    y -= orbSpeed;
                }

                x = (int) ((y - b) / slope); // calculates the mob's x position based on the slope and the mob's y position

            }

        } else {

            if (spawnPoint.y > y) { // if the player's y position is greater than the mob's y position, the mob will move towards the player in the y direction
                y += orbSpeed;
            } else {
                y -= orbSpeed;
            }
        }
        return new Point(x, y);
    }
    // returns the new position of the mob as a Point object


    public JLabel checkForCollision(JLabel label) {


        for (Map.Entry<UUID, JLabel> entry : myFrame.mob.entrySet()) { // code similar to geek by geeks post - https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/
            // checks if the upAttack JLabel intersects with the mob JLabel, if it does, it deals damage to the mob
            if (label.getBounds().intersects(entry.getValue().getBounds())) {

                UUID mobID = entry.getKey(); // gets the UUID of the mob from the entry set
                JLabel mobLabel = entry.getValue(); // gets the JLabel of the mob from the entry set

                return mobLabel;
            }
        }
        return null;
    }
}



