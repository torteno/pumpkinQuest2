package com.example.pumpkinquest;

import javax.swing.JLabel;

public class mining {

    private frame mainFrame;

    public mining(frame gameFrame) {
        this.mainFrame = gameFrame;
    }

    public void mining() {
        System.out.println("Mine initialized");
        JLabel basic_pickaxe = mainFrame.GUIassets(mainFrame.getWidth()/2 - 100, mainFrame.getHeight()/2 - 100, 200, 200, false, "images/equipment/pickaxes/basic_pickaxe.png", false, 1, true);
        basic_pickaxe.setVisible(false);
        JLabel activePickaxe = basic_pickaxe;




    }


    public String getListOfOres() {
        return "Coal, Iron, Gold, Diamond, Emerald, Redstone, Lapis Lazuli";

    }

    
}

 



    


    

