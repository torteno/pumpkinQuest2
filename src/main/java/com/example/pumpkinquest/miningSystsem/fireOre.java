package com.example.pumpkinquest.miningSystsem;

import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public class fireOre extends ore { // creates the fire ore

    public fireOre(JLabel label, frame Frame) { // calls the constructor of the parent class
        super(label, 5, 3, Frame);
    }

    @Override
    public void oreDrops() { // drops the ore
        frame.setFlameShards(frame.getFlameShards() + 1); // increases the number of flame shards
        System.out.println("Flame Shard obtained! Total: " + frame.getFlameShards()); // prints the number of flame shards

    }

}
