package com.example.pumpkinquest;

import com.example.pumpkinquest.miningSystsem.fireOre;
import com.example.pumpkinquest.miningSystsem.lightOre;
import com.example.pumpkinquest.miningSystsem.ore;
import com.example.pumpkinquest.mobs.mob;
import com.example.pumpkinquest.mobs.skeleton;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class manageAssets {

    private final frame MyFrame;

    private final HashMap<JLabel, String> assetMap = new HashMap<>(); // A hashmap to store all the assets

    private final HashMap<JLabel, ore> ores = new HashMap<>(); // A hashmap to store all the ores

    // public so other systems (mob attack, projectiles) can iterate the live mob registry.
    // The reference itself never changes — only its contents — so it can be final.
    public static final HashMap<JLabel, mob> mobs = new HashMap<>(); // A hashmap to store all the mobs



    public manageAssets(frame myFrame) { //gets the frame class with its live data
        this.MyFrame = myFrame;
    }

    private void handleOreClick(JLabel clickedLabel) { // Handles the clicking of the ores

        ore oreCore = ores.get(clickedLabel); // Gets the ore from the hashmap

        if (oreCore != null && activeTool.pickaxe) { // Checks if the ore is not null and the player is using a pickaxe
            oreCore.mine(); // Mines the ore

            if (oreCore.getHealth() <= 0) { // Checks if the ore has no health left
                oreCore.remove(clickedLabel); // Removes the ore
            }
        }
    }

    public void loadAssets(String assetType, int x, int y, int width, int height, String image, boolean obstacle, boolean opaque, int zOrder, boolean visible, boolean isOre, boolean isMob) { // Loads the assets into the game

        JLabel label = MyFrame.assets(x, y, width, height, obstacle, image, opaque, zOrder, visible); // Creates the asset

        if (isOre == true) { // Checks if the asset is an ore
            ore type;
            if (assetType.equalsIgnoreCase("light")) { // Checks if the asset is a light ore
                type = new lightOre(label, MyFrame); // Creates the light ore
                ores.put(label, type); // Puts the light ore in the hashmap
            } else if (assetType.equalsIgnoreCase("fire")) { // Checks if the asset is a fire ore
                type = new fireOre(label, MyFrame); // Creates the fire ore
                ores.put(label, type); // Puts the fire ore in the hashmap
            }

            label.addMouseListener(new MouseAdapter() { // Adds a mouse listener to the ore
                @Override
                    public void mouseClicked(MouseEvent e) { // Handles the clicking of the ore
                        handleOreClick((JLabel) e.getSource()); // Handles the clicking of the ore

                }
                });
        }

        if(isMob) { // Checks if the asset is a mob
            mob type = null; // Sets the type of the mob to null
            if (assetType.equalsIgnoreCase("skeleton")) { // Checks if the asset is a skeleton
                type = new skeleton(label, MyFrame); // Creates the skeleton
            } else if (assetType.equalsIgnoreCase("ghost")) { // Checks if the asset is a ghost by setting the asset type to it, and then loading in the hashmap that the JLabel is coorelated with that mob type
                type = new com.example.pumpkinquest.mobs.ghost(label, MyFrame); // Creates the ghost
            } else if (assetType.equalsIgnoreCase("spider")) { // Checks if the asset is a spider by setting the asset type to it, and then loading in the hashmap that the JLabel is coorelated with that mob type
                type = new com.example.pumpkinquest.mobs.spider(label, MyFrame); // Creates the spider
            } else if (assetType.equalsIgnoreCase("zombie")) { // Checks if the asset is a zombie by setting the asset type to it, and then loading in the hashmap that the JLabel is coorelated with that mob type
                type = new com.example.pumpkinquest.mobs.zombie(label, MyFrame); // Creates the zombie
            } else if (assetType.equalsIgnoreCase("slime")) { // Checks if the asset is a slime by setting the asset type to it, and then loading in the hashmap that the JLabel is coorelated with that mob type
                type = new com.example.pumpkinquest.mobs.slime(label, MyFrame); // Creates the slime
            }
            if (type != null) { // Checks if the type is not null
                mobs.put(label, type);
            }
        }
        }

    }

