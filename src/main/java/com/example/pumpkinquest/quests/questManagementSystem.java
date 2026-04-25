package com.example.pumpkinquest.quests;


import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.util.ArrayList;

public class questManagementSystem {

    public static quests activeQuest;
    // Initialised eagerly so completeActiveQuest() / startQuest() can call .add / .contains
    // without an NPE when the player completes their first quest.
    public static ArrayList<quests> completedQuests = new ArrayList<>();


    private final frame myFrame;

    public questManagementSystem(frame Frame) { //This class is responsible for managing the quests in the game, including tracking the active quest, updating quest progress, and handling quest completion.

        this.myFrame = Frame; // sets the class myFrame variable to the frame passed in by the constructor allowing the class to modify the global frame class

        myFrame.questDisplay.setText("No Active Quests"); // sets the text of the JLabel


        myFrame.questDisplay.setHorizontalTextPosition(JLabel.CENTER); // sets the horizontal text position of the JLabel to center, this is necessary because the default is left and it looks bad when the text is centered vertically but not horizontally
        myFrame.questDisplay.setVerticalTextPosition(JLabel.CENTER); // sets the vertical text position of the JLabel to center, this is necessary because the default is top and it looks bad when the text is centered horizontally but not vertically

        myFrame.questDisplay.setForeground(java.awt.Color.BLACK); // sets the background of the text to be white to its readable

        if(activeQuest != null) { // checks if there is an active Quest, if not it sets the text to no active quest
            myFrame.questDisplay.setText(activeQuest.getDescription()); // sets the text to the description of the active quest
        } else {
            myFrame.questDisplay.setText("No Active Quests");
        }
    }

    public void startQuest(quests quest) {
        // starts a quest by setting the active quest to the quest passed in and updating the text of the JLabel to the description of the quest


        if (completedQuests == null) { // checks if the completed quests list is null so it doesnt crash when we check for contents
            quest.startQuest();
            // sets the active quest to the quest passed in
            myFrame.questDisplay.setText(activeQuest.getDescription()); // sets the text of the JLabel to the description of the active quest
        } else {
            if (!completedQuests.contains(quest) || quest.isReplayable()) { // checks if the quest is already completed and if it is not replayable, if it is replayable or not completed it starts the quest
                quest.startQuest();  // sets the active quest to the quest passed in
                myFrame.questDisplay.setText(activeQuest.getDescription()); // sets the text of the JLabel to the description of the active quest
            } else {
                System.out.println("Quest already done, try another one please because I hopefully made them fun :D");
            }
        }
    }

     public void completeActiveQuest() { // completes the active quest by adding it to the completed quests list and setting the active quest to null and updating the text of the JLabel to no active quests
        if(activeQuest != null && activeQuest.meetRequirements()) { // checks if there is an active quest and if the requirements for completing it are met
            completedQuests.add(activeQuest); // adds the active quest to the completed quests list
            activeQuest.completeQuest(); // calls the completeQuest method of the active quest to handle any specific completion logic for that quest
            activeQuest = null; // sets the active quest to null
            myFrame.questDisplay.setText("No Active Quests"); // sets the text of the JLabel to no active quests
        }
    }



}
