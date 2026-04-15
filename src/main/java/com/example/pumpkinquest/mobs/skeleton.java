package com.example.pumpkinquest.mobs;

import com.example.pumpkinquest.mob;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public class skeleton extends mob {


    public skeleton(JLabel label, frame myFrame) {
        super(label, myFrame, 50, 50, 20, 5, 2000, new Point(1000, 1000), "mob/skeleton.png", 1000, true , true);
    }

    @Override
    public void attackClose() {
        frame.mobAttack(mob, )
    }

    @Override
    public void attackRanged() {

    }


}
