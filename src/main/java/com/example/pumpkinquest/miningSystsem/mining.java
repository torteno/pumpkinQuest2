package com.example.pumpkinquest.miningSystsem;

import com.example.pumpkinquest.frame;

import javax.swing.JLabel;

public class mining {

    private final frame mainFrame;

    public mining(frame gameFrame) { // creates the mining system from the main frame to get the correct data

        this.mainFrame = gameFrame;
    }

    public void mining() { // initializes the mining system
        System.out.println("Mine initialized"); // prints that the mining system is initialized
        JLabel basic_pickaxe = mainFrame.GUIassets(mainFrame.getWidth()/2 - 100, mainFrame.getHeight()/2 - 100, 200, 200, false, "images/equipment/pickaxes/basic_pickaxe.png", false, 1, true); // creates the basic pickaxe
        basic_pickaxe.setVisible(false); // sets the basic pickaxe to be invisible
        JLabel activePickaxe = basic_pickaxe; // sets the active pickaxe to be the basic pickaxe




    }


    public String getListOfOres() { // gets the list of ores
        return "Coal, Iron, Gold, Diamond, Emerald, Redstone, Lapis Lazuli";
    }


    
}

 



    


    

