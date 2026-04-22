package com.example.pumpkinquest;

import javax.swing.*;

public class mobAttack {

    private frame myFrame;

    double distance = 0;

    public mobAttack(frame myFrame) {

        this.myFrame = myFrame;

    }


    public void attack() {
        for(mob mobs: manageAssets.mobs.values()) {
            distance = Math.sqrt(Math.pow(((frame.playerWorldPos.x - 40) - mobs.getX()), 2) + Math.pow(((frame.playerWorldPos.y - 50) - mobs.getY()), 2));
            if(mobs.isCloseAttack() && distance <= mobs.getCloseAttackRange()) {
                mobs.attackClose();
            } else if(mobs.isRangedAttack() && distance <= mobs.getRangedAttackRange() && distance > mobs.getCloseAttackRange()) {
                mobs.attackRanged();
            }
        }
    }
}
