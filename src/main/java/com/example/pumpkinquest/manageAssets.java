package com.example.pumpkinquest;

import com.example.pumpkinquest.miningSystsem.fireOre;
import com.example.pumpkinquest.miningSystsem.lightOre;
import com.example.pumpkinquest.miningSystsem.ore;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class manageAssets {

    private frame MyFrame;

    HashMap<JLabel, String> assetMap = new HashMap<>();

    HashMap<JLabel, ore> ores = new HashMap<>();

    public manageAssets(frame myFrame) {
        this.MyFrame = myFrame;
    }

    private void handleOreClick(JLabel clickedLabel) {

        ore oreCore = ores.get(clickedLabel);

        if (oreCore != null && activeTool.pickaxe) {
            oreCore.mine();

            if (oreCore.getHealth() <= 0) {
                oreCore.remove(clickedLabel);
            }
        }
    }

    public void loadAssets(String assetType, int x, int y, int width, int height, String image, boolean obstacle, boolean opaque, int zOrder, boolean visible, boolean isOre) {

        JLabel label = MyFrame.assets(x, y, width, height, obstacle, image, opaque, zOrder, visible);

        if (isOre == true) {
            ore type;
            if (assetType.equalsIgnoreCase("light")) {
                type = new lightOre(label, MyFrame);
                ores.put(label, type);
            } else if (assetType.equalsIgnoreCase("fire")) {
                type = new fireOre(label, MyFrame);
                ores.put(label, type);
            }


            if (isOre) {
                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        handleOreClick((JLabel) e.getSource());
                    }
                });


            }
        }




    }
}
