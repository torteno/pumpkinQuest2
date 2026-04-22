package com.example.pumpkinquest;

public class worldObjects {


    private frame myFrame;

    public void worldObjects(frame myFrame) {

        this.myFrame = myFrame;

    }


    public void loadWorldObjects() {


        manageAssets manager = new manageAssets(myFrame);


        int[][] lightPositions = {{50, 50}, {100, 200}, {300, 450}, {10, 80}, {1500, -650}};

        for (int[] pos : lightPositions) {
            manager.loadAssets("light", pos[0], pos[1], 100, 100, "images/mining/light_shard.png", true, false, 3, true, true, false);
        }


        int[][] skeletonPositions = {{1500, -650}, {0,0}};

        for(int[] pos : skeletonPositions) {

            manager.loadAssets("skeleton", pos[0], pos[1], 100, 200, "images/mob/zombie.png", false, false, 3, true, false, true);


        }


    }


}
