package com.example.pumpkinquest.miningSystsem;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;

public abstract class ore extends JLabel {

    private int hits; // mutated in mine() — not final
    private final int numOfDrops; // configured per ore type, never reassigned
    private final JLabel label; // the visible JLabel — set once in constructor
    protected final frame Frame;

    public ore(JLabel label, int hits, int numOfDrops, frame Frame) {
        this.label = label; // label of the ore
        this.hits = hits; // health of the ore
        this.numOfDrops = numOfDrops; // number of drops
        this.Frame = Frame; // frame of the ore
    }

    public int getNumOfDrops() { // gets the number of drops
        return numOfDrops;
    }

    public abstract void oreDrops(); // abstract method for ore drops

    public void mine() { // mines the ore
        hits--; // decreases the health of the ore
        System.out.println("debug mining: hit"); // prints that the ore was hit
        if(hits <= 0) { // if the health of the ore is less than or equal to 0
            oreDrops(); // calls the ore drops method
            Frame.obstacles.remove(label); // removes the ore from the obstacles list
            label.getParent().remove(label); // removes the ore from the frame
            label.getParent().repaint(); // repaints the frame
            repaint(); // repaints the ore
        }
    }


    public JLabel getLabel() { // gets the label of the ore
        return label;
    }

    public int getHealth() { // gets the health of the ore
        return hits;
    }




}
