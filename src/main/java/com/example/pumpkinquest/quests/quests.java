package com.example.pumpkinquest.quests;

import com.example.pumpkinquest.quests.questManagementSystem;

public abstract class quests {

    private String ID; // id of the quest
    private String description; // description of the quest

    public boolean isReplayable() { // returns if the quest is replayable
        return replayable;
    }

    private final boolean replayable; // replayable status of the quest

    public String getDescription() { // returns the description of the quest
        return description;
    }

    public void setDescription(String description) { // sets the description of the quest
        this.description = description;
    }

    public String getID() { // returns the id of the quest
        return ID;
    }

    public void setID(String ID) { // sets the id of the quest
        this.ID = ID;
    }




    public quests(String ID, String description, boolean replayable) { // constructor
        this.ID = ID; // sets the id of the quest
        this.description = description; // sets the description of the quest
        this.replayable = replayable; // sets the replayable status of the quest
    }


    public void startQuest() { // starts the quest
        if(questManagementSystem.completedQuests == null) { // checks if the quest management system has no completed quests
            questManagementSystem.activeQuest = this; // sets the active quest to this quest
        } else {
            if (!questManagementSystem.completedQuests.contains(this) || replayable) { // checks if the quest management system has no completed quests or if the quest is replayable
                questManagementSystem.activeQuest = this; // sets the active quest to this quest
            } else { // if the quest management system has completed quests and the quest is not replayable
                System.out.println("Quest already done, try another one please because I hopefully made them fun :D");
            }
        }
    }

    public abstract void completeQuest();

   public abstract boolean meetRequirements();


}
