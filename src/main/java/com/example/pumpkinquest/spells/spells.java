package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.mob;

import javax.swing.*;

public abstract class spells {

    String ID;
    int manaCost;
    int damage;
    int orbSpeed;
    String spritePath;
    JLabel label;

    public spells(JLabel label, String ID, int manaCost, int damage, int orbSpeed, String spritePath) {
        this.label = label;
        this.ID = ID;
        this.manaCost = manaCost;
        this.damage = damage;
        this.orbSpeed = orbSpeed;
        this.spritePath = spritePath;
    }



    public abstract void cast(spellContext context);



    public abstract void effect(mob target);

    public int getManaCost() {
        return manaCost;
    }



}
