package com.example.pumpkinquest.quests;

public class collectStoneSword extends quests {

    private boolean collectedStoneSword = false;

    private final String ID = "collectStoneSword"; // id of the quest
    private final String description = "Collect the stone sword in the chest behind the house"; // description of the quest
    private final boolean replayable = false; // replayable status of the quest


    public collectStoneSword() {  // constructor
        super("collectStoneSword", "Collect the stone sword in the chest behind the house", false); // calls the constructor of the parent class
    }

    @Override
    public void completeQuest() { // completes the quest

        System.out.println("Congratulations, you have collected the stone sword! You can now use it to defeat stronger enemies and progress further in the game. Keep up the good work and continue exploring the world of Pumpkin Quest!"); // prints the completion message

    }

    @Override
    public boolean meetRequirements() { // checks if the requirements are met
        return collectedStoneSword; // returns the status of the quest
    }

    public boolean isCollectedStoneSword() { // checks if the stone sword is collected
        return collectedStoneSword; // returns the status of the quest
    }

    public void setCollectedStoneSword(boolean collectedStoneSword) { // sets the status of the quest
        this.collectedStoneSword = collectedStoneSword; // sets the status of the quest
    }
}
