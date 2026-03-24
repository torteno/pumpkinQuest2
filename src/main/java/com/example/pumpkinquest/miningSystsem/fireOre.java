package com.example.pumpkinquest.miningSystsem;

import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public class fireOre extends ore {

    public fireOre(JLabel label, frame Frame) {
        super(label, 5, 3, Frame);
    }

    @Override
    public void oreDrops() {
        frame.setFlameShards(frame.getFlameShards() + 1);
        System.out.println("Flame Shard obtained! Total: " + frame.getFlameShards());

    }

}
