package com.example.pumpkinquest;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class mobMovement extends frame {

    static int nodeSize = 32;

    private frame myFrame;
    int playerGridX = myFrame.playerWorldPos.x/nodeSize;
    int playerGridY = myFrame.playerWorldPos.y/nodeSize;

    HashMap<UUID, Integer> mobGridX = new HashMap<>();
    HashMap<UUID, Integer> mobGridY = new HashMap<>();

    int worldSizeX = 20000/nodeSize;
    int worldSizeY = 20000/nodeSize;

    nodes[][] grid = new nodes[worldSizeX][worldSizeY];









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

    public void grid() {



        JLabel checker =  myFrame.assets(startingPositionX, startingPositionY, nodeSize, nodeSize, false, "", false, 1, false);


        nodes node = new nodes(nodeSize, nodeSize, -20000, -20000);

        for(int i = 0; i < worldSizeX; i++) {
            for(int j = 0; j < worldSizeY; j++) {

                grid[i][j] = new nodes(nodeSize, nodeSize, i*nodeSize, j*nodeSize);



                for(JLabel obstacle : myFrame.obstacles) {

                    


                }



            }



        }







    }





}
