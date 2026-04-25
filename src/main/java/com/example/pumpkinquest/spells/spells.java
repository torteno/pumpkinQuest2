package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.mobs.mob;

import javax.swing.*;

public abstract class spells {

    private final String ID; // The ID of the spell
    private final int manaCost; // The mana cost of the spell
    private final int damage; // The damage of the spell
    private final int orbSpeed; // The speed of the spell

    public String getSpritePath() {
        return spritePath;
    }

    public String getID() {
        return ID;
    }

    public int getDamage() {
        return damage;
    }

    public int getOrbSpeed() {
        return orbSpeed;
    }

    public JLabel getLabel() {
        return label;
    }

    private final String spritePath; // The path to the sprite of the spell
    private final JLabel label; // The label that displays the spell

    public spells(JLabel label, String ID, int manaCost, int damage, int orbSpeed, String spritePath, double maxRange) { // gets the label, ID, mana cost, damage, speed, sprite path, and max range of the spell
        this.label = label; // sets the label of the spell
        this.ID = ID; // sets the ID of the spell
        this.manaCost = manaCost; // sets the mana cost of the spell
        this.damage = damage; // sets the damage of the spell
        this.orbSpeed = orbSpeed; // sets the speed of the spell
        this.spritePath = spritePath; // sets the path to the sprite of the spell
    }



    public abstract void cast(spellContext context); // casts the spell



    public abstract void effect(mob target); // applies the effect of the spell

    public abstract void update(); // updates the spell

    public abstract boolean isMoving(); // checks if the spell is moving




    public int getManaCost() { // gets the mana cost of the spell
        return manaCost; // returns the mana cost of the spell
    }



}
