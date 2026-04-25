package com.example.pumpkinquest;

public class worldObjects {


    private final frame myFrame;

    public worldObjects(frame myFrame) { // creates the world object from the main frame to get the correct data

        this.myFrame = myFrame;

    }


    public void loadWorldObjects() {


        manageAssets manager = new manageAssets(myFrame); // creates the asset manager to load the assets


        int[][] lightPositions = {{50, 50}, {100, 200}, {300, 450}, {10, 80}, {1500, -650}}; // sets the positions of the lights

        for (int[] pos : lightPositions) { // loops through the positions of the lights and loads the assets
            manager.loadAssets("light", pos[0], pos[1], 100, 100, "images/mining/light_shard.png", true, false, 3, true, true, false);
        }


        int[][] skeletonPositions = {{1500, -650}, {0,0}, {1000, -1600}}; // sets the positions of the skeletons
        for(int[] pos : skeletonPositions) { // loops through the positions of the skeletons and loads the assets
            manager.loadAssets("skeleton", pos[0], pos[1], 100, 200, "images/mob/zombie.png", false, false, 3, true, false, true);
        }

        int[][] zombiePositions = {{1200, 800}, {1400, 900}, {2000, -500}}; // sets the positions of the zombies
        for(int[] pos : zombiePositions) { // loops through the positions of the zombies and loads the assets
            manager.loadAssets("zombie", pos[0], pos[1], 100, 150, "images/mob/zombie.png", false, false, 4, true, false, true);
        }

        int[][] spiderPositions = {{2500, 1200}, {2800, 1100}}; // sets the positions of the spiders
        for(int[] pos : spiderPositions) { // loops through the positions of the spiders and loads the assets
            manager.loadAssets("spider", pos[0], pos[1], 150, 80, "images/mob/spider.png", false, false, 4, true, false, true);
        }


    }


}
