package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;

import java.awt.*;

public class spellContext {

    Point mousePos = magicSystem.getMousePoint();

    Point orbPosition = new Point(magicSystem.magicOrb.getX(), magicSystem.magicOrb.getY());

    Point finalOrbLocation = magicSystem.getShotLocation();



    public spellContext() {


    }


}
