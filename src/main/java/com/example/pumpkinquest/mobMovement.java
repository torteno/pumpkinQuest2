package com.example.pumpkinquest;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class mobMovement extends frame {

    private frame myFrame;

    public mobMovement(frame Frame) {
        this.myFrame = Frame;
    }

    ArrayList<Integer> blockedX = new ArrayList<>();
    ArrayList<Integer> blockedY = new ArrayList<>();


    public final int nodeSize = 8;

    ArrayList<Integer> pathX = new ArrayList<>();
    ArrayList<Integer> pathY = new ArrayList<>();

    public void check() {
       JLabel checker =  myFrame.assets(-10000, -10000, nodeSize, nodeSize, false, "", false, 1, false);

        for(int i = 0; i < 20000/nodeSize; i++) {
            for(int j = 0; j < 20000/nodeSize; j++) {
                if(true) {
                    if(myFrame.getComponentAt(i*nodeSize, j*nodeSize).getName() == "obstacle") {
                        blockedX.add(i);
                        blockedY.add(j);
                    }
                }
            }
        }




    }







}
