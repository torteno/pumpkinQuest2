package com.example.pumpkinquest.spells;

import com.example.pumpkinquest.magicSystem;
import com.example.pumpkinquest.frame;
import com.example.pumpkinquest.mob;

import javax.swing.*;

public class fireballSpell extends spells {

    private frame myFrame;

    public fireballSpell(JLabel label) {
        super(label, "fireball", 25, 25, 3, "images/magic/fire_orb.png");

    }


    @Override
    public void cast(spellContext ctx) {

        JLabel fireball = myFrame.assets(myFrame.getPlayerWorldPos().x, myFrame.getPlayerWorldPos().y, 100, 100, false, "images/magic/fire_orb.png", false, 1, true);

        magicSystem.set

    }

    @Override
    public void effect(mob target) {


        mob.setHealth(mob.getHealth() - 10);



    }

}
