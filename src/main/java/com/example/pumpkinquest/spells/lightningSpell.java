package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.util.UUID;

public class lightningSpell extends spells {

    frame myFrame = new frame();

    public lightningSpell(JLabel label) {

        super(label, "lightning", 10, 10, 8, "images/magic/lightning_orb.png");

    }

    @Override
    public void cast(spellContext ctx) {

    }

    @Override
    public void effect(JLabel target) {
        UUID mobID = myFrame.reverseMobMap.get(target);

        int mobHealth = myFrame.MobHealth.get(mobID); // gets the health of the mob from the MobHealth map

        mobHealth -= 10;  // subtracts the playerDamage from the mob's health

        myFrame.MobHealth.put(mobID, mobHealth); // updates the mob's health in the MobHealth map

        if (mobHealth <= 0) { // checks if the mob's health is less than or equal to 0, if it is, it removes the mob from the game
            myFrame.mobRemove(mobID); // calls the mobRemove method to remove the mob from the game

        }
    }
}
