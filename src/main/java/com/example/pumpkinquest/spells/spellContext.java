package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.magicSystem;

import java.awt.*;

public class spellContext {

    private Point mousePos = magicSystem.getMousePoint();

    Point orbPosition = new Point(magicSystem.magicOrb.getX(), magicSystem.magicOrb.getY());

    Point finalOrbLocation = magicSystem.getShotLocation();

    private frame myFrame;






    public spellContext() {



    }

    public Point getMousePos() {
        return mousePos;
    }

    public Point getOrbPosition() {
        return orbPosition;
    }

    public Point getOrbDestination() {
        return finalOrbLocation;
    }


}
