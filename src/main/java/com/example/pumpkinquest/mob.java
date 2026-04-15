package com.example.pumpkinquest;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public abstract class mob extends JLabel {

    private final int width, height;
    private final int health;
    private final int damage;
    private final int speed;
    private final Point positon;
    private final String icon;
    private final int followRange;
    private final boolean closeAttack;
    private final boolean rangedAttack;


    private JLabel label;
    protected frame Frame;

    public mob(JLabel label, frame myframe, int width , int height, int health, int damage, int speed, Point position, String icon, int followRange, boolean closeAttack, boolean rangedAttack) {
        this.label = label;
        this.width = width;
        this.height = height;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.positon = position;
        this.icon = icon;
        this.followRange = followRange;
        this.closeAttack = closeAttack;
        this.rangedAttack = rangedAttack;
    }


    public abstract void attackClose();
    public abstract void attackRanged();
}
