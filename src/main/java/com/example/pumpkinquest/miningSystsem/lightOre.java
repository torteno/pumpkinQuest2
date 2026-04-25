package com.example.pumpkinquest.miningSystsem;

import com.example.pumpkinquest.frame;

import javax.swing.*;

public class lightOre extends ore {

    public lightOre(JLabel label, frame Myframe) { // calls the constructor of the parent class
        super(label, 5, 3, Myframe);
    }

    @Override
    public void oreDrops() { // drops the ore
        frame.setLightShards(frame.getLightShards() + 1); // increases the number of light shards
        System.out.println("Light Shard obtained! Total: " + frame.getLightShards()); // prints the number of light shards
    }

}
