package com.example.pumpkinquest.miningSystsem;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public abstract class ore extends JLabel {

    private int hits;
    private int numOfDrops;
    private JLabel label;
    protected frame Frame;

    public ore(JLabel label, int hits, int numOfDrops, frame Frame) {
        this.label = label;
        this.hits = hits;
        this.numOfDrops = numOfDrops;
        this.Frame = Frame;
    }

    public abstract void oreDrops();

    public void mine() {
        hits--;
        System.out.println("HIT!");
        if(hits <= 0) {
            oreDrops();
            label.getParent().remove(label);
            label.getParent().repaint();
            repaint();
        }
    }


    public JLabel getLabel() {
        return label;
    }

    public int getHealth() {
        return hits;
    }




}
