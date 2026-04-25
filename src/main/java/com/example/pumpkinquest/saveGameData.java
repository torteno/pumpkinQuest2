package com.example.pumpkinquest;

import com.example.pumpkinquest.quests.quests;

import java.awt.*;
import java.util.ArrayList;

public class saveGameData { // This class basically is like a bridge between the game and the save file, describing what data needs to be saved and loaded, and in what format

    public int swordUpgrade;
    public Point playerPosition;
    public double playerHealth;


    public Point spawnPosition;
    public boolean[] openedChests;
    public boolean[] openedChestsInteraction;
    public double maximumHealth;
    public boolean gameBeenSaved;
    public ArrayList<quests> completedQuests;
}
