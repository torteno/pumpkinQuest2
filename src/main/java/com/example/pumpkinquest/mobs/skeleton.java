package com.example.pumpkinquest.mobs;

import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class skeleton extends mob {


    public skeleton(JLabel label, frame myFrame) { // constructor
        super(label, myFrame, 50, 50, 20, 5, 5, new Point(1000, 1000), "mob/skeleton.png", 1000, true , true, LocalDateTime.now(), 100); // calls the constructor of the parent class

    }

    @Override
    public void attackClose() {

        closeAttackDeafult(100, 3, 10000, true); // calls the default close attack method



    }

    @Override
    public void attackRanged() {



    }


}
