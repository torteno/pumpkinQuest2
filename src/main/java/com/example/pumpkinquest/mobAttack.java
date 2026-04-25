package com.example.pumpkinquest;

import com.example.pumpkinquest.mobs.mob;

public class mobAttack {

    private final frame myFrame;

    public mobAttack(frame myFrame) { //gets the frame class with its live data

        this.myFrame = myFrame;

    }


    public void attack() {
        for(mob mobs: manageAssets.mobs.values()) {
            // distance is local — there's no reason for it to be a field, since each mob's
            // distance is independent.
            double distance = Math.sqrt(Math.pow(((frame.playerWorldPos.x) - mobs.getPosition().x), 2) + Math.pow(((frame.playerWorldPos.y) - mobs.getPosition().y), 2)); // Calculates the distance between the mob and the player
            if(mobs.isCloseAttack() && distance <= mobs.getCloseAttackRange()) { // Checks if the mob is close enough to attack
                mobs.attackClose(); // Attacks the mob
            } else if(mobs.isRangedAttack() && distance <= mobs.getRangedAttackRange() && distance > mobs.getCloseAttackRange()) { // Checks if the mob is close enough to attack
                mobs.attackRanged(); // Attacks the mob
            }
        }
    }
}
