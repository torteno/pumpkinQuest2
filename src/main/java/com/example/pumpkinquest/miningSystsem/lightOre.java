package com.example.pumpkinquest.miningSystsem;

import com.example.pumpkinquest.frame;

import javax.swing.*;

public class lightOre extends ore {

    public lightOre(JLabel label, frame Myframe) {
        super(label, 5, 3, Myframe);
    }

    @Override
    public void oreDrops() {
        frame.setLightShards(frame.getLightShards() + 1);
        System.out.println("Light Shard obtained! Total: " + frame.getLightShards());
    }

}
