package com.example.pumpkinquest;//package com.example.pumpkinquest.frame;

import com.example.pumpkinquest.frame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class activeTool implements KeyListener {

    static boolean sword; // checks if the sword is active
    static boolean staff; // checks if the staff is active
    static boolean pickaxe; // checks if the pickaxe is active

    private final frame myFrame; // gets the frame class with its live data

    JLabel pickaxeSelect; // the label that represents the pickaxe selection
    JLabel pickaxeTool; // the label that represents the pickaxe tool
    JLabel swordSelect; // the label that represents the sword selection
    JLabel wandSelect; // the label that represents the wand selection


    public activeTool(frame gameFrame) { // gets the frame class with its live data
        this.myFrame = gameFrame;
    }



    public void toolTracker() { // tracks the active tool
        swordSelect = myFrame.GUIassets(190, myFrame.getHeight() - 150, 75,75, false, "images/equipment/sword_selection.png", false, 2, false); // creates the sword selection label
        wandSelect = myFrame.GUIassets(100, myFrame.getHeight() - 150, 75,75, false, "images/magic/wand_selection.png", false, 2, false); // creates the wand selection label
        swordSelect.setVisible(true); // makes the sword selection visible
        wandSelect.setVisible(true); // makes the wand selection visible

        pickaxeSelect = myFrame.GUIassets(10, myFrame.getHeight() - 150, 75,75, false, "images/mining/pickaxe_selection.png", false, 2, false); // creates the pickaxe selection label
        pickaxeSelect.setVisible(true); // makes the pickaxe selection visible
        System.out.println("activeTool: Loaded!"); // prints that the active tool has been loaded

        pickaxeTool = myFrame.GUIassets(myFrame.player.getX() + 50 , myFrame.getY() + 200, 100,100, false, "images/equipment/pickaxes/basic_pickaxe.png", false, 1, false); // creates the pickaxe tool label







    }







    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) { // checks for key presses
        switch(e.getKeyCode()) { // checks which key was pressed

            case KeyEvent.VK_Z -> { // if the z key is pressed
                pickaxe = true; // sets the pickaxe to be active
                sword = false; // sets the sword to be inactive
                staff = false; // sets the staff to be inactive
                System.out.println("Pickaxe active"); // prints that the pickaxe is active
//                pickaxeSelect.setVisible(true);
                pickaxeTool.setVisible(true); // makes the pickaxe tool visible
                if (magicSystem.magicOrb != null) { // checks if the magic orb is not null
                    magicSystem.magicOrb.setVisible(false); // makes the magic orb invisible
                }

            }

            case KeyEvent.VK_X -> {
                if (staff) { // checks if the staff is active
                    magicSystem.activeSpell++; // increments the active spell
                    if (magicSystem.activeSpell > 2) { // checks if the active spell is greater than 2
                        magicSystem.activeSpell = 0; // sets the active spell to 0
                    }
                } else { // if the staff is not active
                    pickaxe = false; // sets the pickaxe to be inactive
                    sword = false; // sets the sword to be inactive
                    staff = true; // sets the staff to be active
                    pickaxeTool.setVisible(false); // makes the pickaxe tool invisible
                    if (magicSystem.magicOrb != null) { // checks if the magic orb is not null
                        magicSystem.magicOrb.setVisible(true); // makes the magic orb visible
                    }
                    System.out.println("Magic Orb activated!"); // prints that the magic orb is active
                }
            }

            case KeyEvent.VK_C -> { // if the c key is pressed
                pickaxe = false; // sets the pickaxe to be inactive
                sword = true; // sets the sword to be active
                staff = false; // sets the staff to be inactive
                pickaxeTool.setVisible(false); // makes the pickaxe tool invisible
                if (magicSystem.magicOrb != null) { // checks if the magic orb is not null
                    magicSystem.magicOrb.setVisible(false); // makes the magic orb invisible
                }
            }

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
