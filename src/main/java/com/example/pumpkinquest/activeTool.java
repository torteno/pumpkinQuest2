package com.example.pumpkinquest;//package com.example.pumpkinquest.frame;

import com.example.pumpkinquest.frame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class activeTool implements KeyListener {

    static boolean sword;
    static boolean staff;
    static boolean pickaxe;

    private final frame myFrame;

    JLabel pickaxeSelect;
    JLabel pickaxeTool;
    JLabel swordSelect;
    JLabel wandSelect;


    public activeTool(frame gameFrame) {
        this.myFrame = gameFrame;
    }



    public void toolTracker() {
        swordSelect = myFrame.GUIassets(190, myFrame.getHeight() - 150, 75,75, false, "images/equipment/sword_selection.png", false, 1, false);
        wandSelect = myFrame.GUIassets(100, myFrame.getHeight() - 150, 75,75, false, "images/magic/wand_selection.png", false, 1, false);
        swordSelect.setVisible(true);
        wandSelect.setVisible(true);

        pickaxeSelect = myFrame.GUIassets(10, myFrame.getHeight() - 150, 75,75, false, "images/mining/pickaxe_selection.png", false, 1, false);
        pickaxeSelect.setVisible(true);
        System.out.println("activeTool: Loaded!");

        pickaxeTool = myFrame.GUIassets(myFrame.player.getX() + 50 , myFrame.getY() + 200, 100,100, false, "images/equipment/pickaxes/basic_pickaxe.png", false, 1, false);







    }







    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {

            case KeyEvent.VK_Z -> {
                pickaxe = true;
                sword = false;
                staff = false;
                System.out.println("Pickaxe active");
//                pickaxeSelect.setVisible(true);
                pickaxeTool.setVisible(true);




            }

            case KeyEvent.VK_X -> {
                pickaxe = false;
                sword = false;
                staff = true;
                pickaxeTool.setVisible(false);

            }

            case KeyEvent.VK_C -> {
                pickaxe = false;
                sword = true;
                staff = false;
                pickaxeTool.setVisible(false);
            }

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
