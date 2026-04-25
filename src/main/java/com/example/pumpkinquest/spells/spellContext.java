package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.magicSystem;

import java.awt.*;

public class spellContext {

    private final Point mousePos; // The position of the mouse
    private final Point orbPosition; // The position of the orb
    private Point finalOrbLocation; // The final position of the orb
    private final frame myFrame; // The frame of the spell






    public spellContext(frame myFrame) { // gets the frame of the spell
        this.myFrame = myFrame; // sets the frame of the spell
        this.mousePos = magicSystem.getMousePoint(); // gets the position of the mouse
          if (magicSystem.magicOrb != null) { // checks if the magic orb is not null
            this.orbPosition = new Point(magicSystem.magicOrb.getX(), magicSystem.magicOrb.getY()); // gets the position of the orb
        } else { // if the magic orb is null
            this.orbPosition = new Point(0, 0); // sets the position of the orb to 0, 0
        }

    }

    public Point getMousePos() { // gets the position of the mouse
        return magicSystem.getMousePoint(); // returns the position of the mouse
    }

    public Point getOrbPosition() { // gets the position of the orb

        if(magicSystem.magicOrb == null) { // checks if the magic orb is null
            return new Point(0,0); // returns 0, 0
        }

        return new Point(magicSystem.magicOrb.getX(), magicSystem.magicOrb.getY()); // returns the position of the orb
    }

    public Point getOrbDestination(double maxDistance) { // gets the destination of the orb

        if(magicSystem.magicOrb == null) { // checks if the magic orb is null
            return new Point(0,0); // returns 0, 0
        }
        finalOrbLocation = magicSystem.getShotLocation(maxDistance); // gets the destination of the orb

        return finalOrbLocation; // returns the destination of the orb
    }

    public Point getOrbWorldPosition() { // gets the world position of the orb
        if (magicSystem.magicOrb == null) { // checks if the magic orb is null
            return new Point(0, 0); // returns 0, 0
        }
        Point orbScreen = new Point(magicSystem.magicOrb.getX(), magicSystem.magicOrb.getY()); // gets the screen position of the orb
        return myFrame.CameraInstance.screenToWorld(orbScreen); // returns the world position of the orb
    }

    public Point getOrbWorldDestination(double maxDistance) { // gets the world destination of the orb
        if (magicSystem.magicOrb == null) { // checks if the magic orb is null
            return new Point(0, 0); // returns 0, 0
        }
        Point destScreen = magicSystem.getShotLocation(maxDistance); // gets the destination of the orb
        return myFrame.CameraInstance.screenToWorld(destScreen); // returns the world destination of the orb
    }

    public frame getMyFrame() {
        return myFrame; // returns the frame of the spell
    }


}
