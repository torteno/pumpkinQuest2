package com.example.pumpkinquest;

import javax.swing.JLabel;

public class objects {

    private frame mainFrame;

    public objects(frame gameFrame) {
        this.mainFrame = gameFrame;
    }

    public static frame gameFrame;
    
    public objects(frame gameFrame) {
        objects.gameFrame = gameFrame;
        initializeObjects();
    }

    

    public static JLabel press;
    public static JLabel pressChest = mainFrame.GUIassets(125, 700, 760, 40, false, "images/GUI/pressE.png", false, 0, false);

    public static JLabel pressrespawn = mainFrame.GUIassets(75, 450, 860, 350, false, "images/text/respawn.png", false, 0, false);
    public static JLabel respawnSet = mainFrame.GUIassets(75, 0, 860, 350, false, "images/text/respawnSet.png", false, 0, false);




    public static JLabel iceSpikeOne = mainFrame.GUIassets( 430, 345, 125, 125, false, "images/mob/tortles/iceSpikeSmall.png", false, 1, false);
    public static JLabel iceSpikeTwo = mainFrame.GUIassets( 430, 345, 125, 125, false, "images/mob/tortles/iceSpikeBig.png", false, 1, false);

    public static JLabel gotApple = mainFrame.GUIassets( 130, 600, 1280, 320, false, "images/text/appleFind.png", false, 0, false);


    public static JLabel armourFound = mainFrame.GUIassets( 130, 600, 900, 320, false, "images/equipment/ArmourFound.png", false, 0, false);


    //public static JLabel chest =  mainFrame.assets(2000, 1000, 200, 200, false, "images/assets/chest.png", false, 8, true);


   public static JLabel warp = mainFrame.assets(-1000, 1000, 100, 200, false, "images/assets/warpstone.png", false, 8, true);

   //barrier for the large stretch of trees to the right of the player at spawn point

    public static JLabel treebarrier = mainFrame.assets(2775, -5800, 590, 7500, debugMode, "images/assets/manymanytrees.png", false, 8, true);

    // array of respawn points in the game, each with a unique position and image
    public static JLabel[] respawnPoints = new JLabel[] {
           mainFrame.assets( 2550, -1250, 150, 200, false, "images/assets/RespawnPoint.png", false, 8, true),
           mainFrame.assets(2811 , -7825, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
           mainFrame.assets(13943 , -7747, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
            mainFrame.assets(7283 , -645, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
           mainFrame.assets(14796 , -585, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true)
};

    //array of chests in the game, each with a unique position and image

    //An array of all the chest images. The order is important (in relation to the chest method)
    public static JLabel[] chestImages = new JLabel[] {
        mainFrame.assets(3880, -525, 150, 150, false, "images/assets/chest.png", false, 8, true), // Apple
        mainFrame.assets(1708 , -2861, 150, 150,  false, "images/assets/chest.png", false, 8, true), // Stone
        mainFrame.assets(6000, -465, 150, 150, false, "images/assets/chest.png", false, 8, true), // Iron
        mainFrame.assets(10600, -495, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Gold
        mainFrame.assets(15260, -1430, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Ruby
        mainFrame.assets(15240, -6200, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Emerald
        mainFrame.assets(3220, -7720, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Diamond
        mainFrame.assets(9090, -4200, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Apple
        mainFrame.assets(14950, -3820, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Apple
        mainFrame.assets(11345, -7470, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Apple
        mainFrame.assets(3675, -7610, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Apple
        mainFrame.assets(8600, -2470, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Armour
        mainFrame.assets(15540, -6890, 150, 150, false, "images/assets/chest.png", false, 8, true),  // Armour
        mainFrame.assets(4220, -7240, 150, 150, false, "images/assets/chest.png", false, 8, true)  // Armour

};


// mobs for the first section of the game
    public static JLabel ghost1 = mainFrame.mobCreation(2250, -3000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600, 1);
    public static JLabel ghost2 = mainFrame.mobCreation(2250, -3600, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost3 = mainFrame.mobCreation(2500, -4450, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost4 = mainFrame.mobCreation(2100, 5500, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost5 = mainFrame.mobCreation(2800, -6300, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost6 = mainFrame.mobCreation(4100, -6000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost7 = mainFrame.mobCreation(4400, -5100, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost8 = mainFrame.mobCreation(4450, -4150, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost9 = mainFrame.mobCreation(5000, -2800, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost10 = mainFrame.mobCreation(4800, -2000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost11 = mainFrame.mobCreation(4005, -2645, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel ghost12 = mainFrame.mobCreation(4085, -1700, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel slime1= mainFrame.mobCreation(4685, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime2= mainFrame.mobCreation(4810, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime3= mainFrame.mobCreation(5105, -455, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime4= mainFrame.mobCreation(5350, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime5= mainFrame.mobCreation(5560, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime6= mainFrame.mobCreation(5750, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime7= mainFrame.mobCreation(4785, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime8= mainFrame.mobCreation(4910, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime9= mainFrame.mobCreation(5205, -455, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime10= mainFrame.mobCreation(5450, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime11= mainFrame.mobCreation(5660, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    //this is the thing that kills you on the riddle path
    public static JLabel deadEnd= mainFrame.mobCreation(13300, -6700, 200, 165, "", 2, 10, 3, 300, 5, 500,1);

    //in the village
    public static JLabel zombie1= mainFrame.mobCreation(7760, -880, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie2= mainFrame.mobCreation(7430, -2070, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie3= mainFrame.mobCreation(7570, -3130, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie4= mainFrame.mobCreation(7920, -3870, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie5= mainFrame.mobCreation(8000, -4910, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie6= mainFrame.mobCreation(9120, -3770, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie7= mainFrame.mobCreation(9090, -2850, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie8= mainFrame.mobCreation(9200, -1950, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie9= mainFrame.mobCreation(10070, -110, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);

    //after the maze
    public static JLabel spider1= mainFrame.mobCreation(15260, -1330, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider2= mainFrame.mobCreation(15270, -2400, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider3= mainFrame.mobCreation(15450, -3280, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider4= mainFrame.mobCreation(15000, -4400, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider5= mainFrame.mobCreation(15000, -6040, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider6= mainFrame.mobCreation(15560, -6950, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider7= mainFrame.mobCreation(15000, -6040, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel spider8= mainFrame.mobCreation(15260, -5200, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);

//last section
    public static JLabel spider9= mainFrame.mobCreation(11920, -7720, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel zombie10= mainFrame.mobCreation(11020, -7040, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel ghost13= mainFrame.mobCreation(9430, -6930, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
    public static JLabel slime12= mainFrame.mobCreation(8820, -5770, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel slime13= mainFrame.mobCreation(8570, -6250, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
    public static JLabel spider10= mainFrame.mobCreation(7510, -6450, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel ghost14= mainFrame.mobCreation(6670, -7100, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 200, 5, 600, 1);
    public static JLabel zombie11= mainFrame.mobCreation(5540, -7270, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie12= mainFrame.mobCreation(4720, -7470, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel zombie13= mainFrame.mobCreation(3650, -7590, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
    public static JLabel spider11= mainFrame.mobCreation(3640, -7590, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
   


    public static JLabel tortles = mainFrame.mobCreation(21600, -2272, 200,376, "images/mob/tortles/downStanding.png", 2, 1000, 1, 150, 3, 1600,1);
// three npcs
    public static JLabel NPC = mainFrame.assets(2100,  -2000, 100, 200, false, "images/NPC/Grandma/grandma.png", false, 2, true);
    public static JLabel NPC3 = mainFrame.assets(9200,  -1600, 126, 238, false, "images/NPC/Maze/secondnpc.png", false, 2, true);
    public static JLabel NPC2 = mainFrame.assets(14450,  -7100, 116, 228, false, "images/NPC/Wizard/wizard.png", false, 2, true);


// lake barriers
    public static JLabel waterBarrier = mainFrame.assets(0, 900, 20000, 800, debugMode, "", false, 3 , false);
    public static JLabel lakeBarrier1 = mainFrame.assets(5400, -5875, 1975, 600, debugMode, "",false, 3, false);
    public static JLabel lakeBarrier2 = mainFrame.assets(5200, -5225, 2175,250, debugMode, "", false, 3, false);
    public static JLabel lakeBarrier3 = mainFrame.assets(5000, -5475, 1550,2000, debugMode, "", false, 3, false);
    public static JLabel lakeBarrier4 = mainFrame.assets(5400, -3875, 1650,2200, debugMode, "", false, 3, false);
    public static JLabel lakeBarrier5 = mainFrame.assets(5600, -1875, 1550,760, debugMode, "", false, 3, false);
    public static JLabel lakeBarrier6 = mainFrame.assets(6450, -4475, 700,560, debugMode, "", false, 3, false);


    //public static JLabel waterBarrier = mainFrame.assets(0, 900, 4800, 800, true, "", false, 3 , false);

    public static JLabel endScreen = mainFrame.GUIassets(0,0, 1000, 1000, false, "images/GUI/gameOver.png", false, 2, false);
    public static JLabel escToQuit = mainFrame.GUIassets(100,500, 800 , 300, false, "images/GUI/escToQuit.png", false, 2, false);
    public static JLabel pumpkin = mainFrame.GUIassets(400,100, 200, 200, false, "images/GUI/pumpkin.png", false, 2, false);


    public static JLabel controls = mainFrame.GUIassets(550, 50, 400, 600,false, "images/GUI/controls.png", false, 0, true);

    public static JLabel SScredits = mainFrame.GUIassets(0, 0, 1040, 780,false, "images/GUI/creditsScreen.png", false, 2, true);
    public static JLabel startMenu = mainFrame.GUIassets(0,0, 1000, 1000, false, "images/GUI/placeHolderStart.png", false, 2, true);
    public static JLabel startCredits = mainFrame.GUIassets(100, 300, 400, 40, false, "images/GUI/startScreenCredits.png", false, 1, true);
    public static JLabel startPlay = mainFrame.GUIassets(100, 200, 400, 40, false, "images/GUI/startScreenNew.png", false, 1, true);
    public static JLabel startQuit = mainFrame.GUIassets(100, 400, 400, 40, false, "images/GUI/startScreenQuit.png", false, 1, true);
    public static JLabel currentSelection = mainFrame.GUIassets(25, 192, 60, 60, false, "images/GUI/selectionarrow.png", false, 1, true);

//Background for the NPC Dialogue
    public static JLabel NPCBackground = mainFrame.GUIassets(-170, 370, 1320, 500, false, "images/NPC/NPCDialogueBackground.png", false, 2, false);

    /*
    public static JLabel NPCScroller1 = mainFrame.GUIassets(-150, 590, 1000, 30, false, "images/NPC/coverDialogue.png", false, 0, false);
    public static JLabel NPCScroller2 = mainFrame.GUIassets(-150, 615, 1000, 30, false, "images/NPC/coverDialogue.png", false, 0, false);
    public static JLabel NPCScroller3 = mainFrame.GUIassets(-150, 640, 1000, 30, false, "images/NPC/coverDialogue.png", false, 0, false);
    public static JLabel NPCScroller4 = mainFrame.GUIassets(-150, 665, 1000, 30, false, "images/NPC/coverDialogue.png", false, 0, false);
    */

    public static JLabel warpBack = mainFrame.assets(21553 , -4705, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpArena = mainFrame.assets(2502 , -7564, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel rockThird = mainFrame.assets( 2500, 2500, 200, 200, false, "images/assets/rock.png", false, 8, true);



    // all of the trees in the game as well as a few of the rocks
    public static JLabel Rock274736 = mainFrame.assets(2353 , -7107, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock3320042 = mainFrame.assets(2278 , -7257, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock2848022 = mainFrame.assets(2178 , -7432, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock4690770 = mainFrame.assets(2178 , -7557, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock8165025 = mainFrame.assets(2178 , -7732, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock9260882 = mainFrame.assets(2178 , -7832, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock2335392 = mainFrame.assets(2278 , -7932, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock754881 = mainFrame.assets(2403 , -8007, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock1726032 = mainFrame.assets(1577 , -8031, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock8461454 = mainFrame.assets(1577 , -7856, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock4868639 = mainFrame.assets(1577 , -7681, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock3939617 = mainFrame.assets(1577 , -7531, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock8602846 = mainFrame.assets(1577 , -7381, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock1661273 = mainFrame.assets(1577 , -7281, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock8212042 = mainFrame.assets(1577 , -7131, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock1011629 = mainFrame.assets(1577 , -7081, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock4685957 = mainFrame.assets(1577 , -6856, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock7075964 = mainFrame.assets(1577 , -6856, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock1051545 = mainFrame.assets(1577 , -6956, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock9392083 = mainFrame.assets(1702 , -8056, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock5679939 = mainFrame.assets(1877 , -8056, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock7836519 = mainFrame.assets(2052 , -8056, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock487015 = mainFrame.assets(2227 , -8056, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Rock939617 = mainFrame.assets(2377 , -8056, 200, 200,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Tree539529 = mainFrame.assets(1643 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5996628 = mainFrame.assets(1743 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3455053 = mainFrame.assets(1868 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree571772 = mainFrame.assets(2043 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9495548 = mainFrame.assets(2193 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8499027 = mainFrame.assets(2318 , -6687, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8911215 = mainFrame.assets(2563 , -7082, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8792634 = mainFrame.assets(2438 , -6932, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2059171 = mainFrame.assets(2438 , -6807, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8359082 = mainFrame.assets(14414 , -5342, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3251671 = mainFrame.assets(14414 , -5217, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1580588 = mainFrame.assets(14414 , -5092, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6470467 = mainFrame.assets(14414 , -4967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9209422 = mainFrame.assets(14339 , -4842, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8579339 = mainFrame.assets(14339 , -4692, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2103638 = mainFrame.assets(14082 , -4615, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4363909 = mainFrame.assets(14455 , -5873, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7076734 = mainFrame.assets(14455 , -5748, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5424698 = mainFrame.assets(14230 , -5598, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2776118 = mainFrame.assets(14608 , -3961, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8798578 = mainFrame.assets(14925 , -3643, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4504854 = mainFrame.assets(14925 , -3518, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5445049 = mainFrame.assets(14925 , -3393, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2239979 = mainFrame.assets(14925 , -3243, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8474601 = mainFrame.assets(14925 , -3043, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9757249 = mainFrame.assets(14925 , -2843, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5980306 = mainFrame.assets(15025 , -2743, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4769336 = mainFrame.assets(15025 , -2493, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5627789 = mainFrame.assets(14711 , -2029, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3613034 = mainFrame.assets(14711 , -1904, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8319634 = mainFrame.assets(14711 , -1829, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2728386 = mainFrame.assets(14711 , -1704, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3240836 = mainFrame.assets(14711 , -1454, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9062171 = mainFrame.assets(10211 , -1574, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2281341 = mainFrame.assets(9663 , -1001, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3859802 = mainFrame.assets(10360 , -448, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5495403 = mainFrame.assets(14062 , -435, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7999274 = mainFrame.assets(14312 , -435, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2077032 = mainFrame.assets(14137 , 215, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1140736 = mainFrame.assets(14103 , 516, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree894129 = mainFrame.assets(14382 , 100, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3243961 = mainFrame.assets(14549 , -267, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7425187 = mainFrame.assets(14624 , 358, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2328316 = mainFrame.assets(14399 , 583, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Rock7881951 = mainFrame.assets(14841 , -3794, 100, 100,  debugMode, "images/assets/rock.png", false, 8, true);
    public static JLabel Tree1256711 = mainFrame.assets(13379 , -6657, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8185935 = mainFrame.assets(13071 , -6574, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3513786 = mainFrame.assets(12746 , -6574, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3509063 = mainFrame.assets(12403 , -6491, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree772701 = mainFrame.assets(12101 , -6314, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree407964 = mainFrame.assets(11710 , -6618, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6014213 = mainFrame.assets(11897 , -6980, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6703167 = mainFrame.assets(12175 , -7133, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5242107 = mainFrame.assets(12494 , -7202, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6610135 = mainFrame.assets(12719 , -7202, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8752945 = mainFrame.assets(11797 , -6325, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9056618 = mainFrame.assets(11617 , -6895, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2443879 = mainFrame.assets(13240 , -6343, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3364519 = mainFrame.assets(13215 , -6038, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8914757 = mainFrame.assets(14065 , -6873, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3961646 = mainFrame.assets(15897 , -110, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8767579 = mainFrame.assets(15897 , 15, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7782009 = mainFrame.assets(15897 , 140, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6676541 = mainFrame.assets(15897 , 265, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1055690 = mainFrame.assets(15897 , 390, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3913108 = mainFrame.assets(15897 , 540, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1477942 = mainFrame.assets(15897 , 715, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree151925 = mainFrame.assets(15889 , 622, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2827591 = mainFrame.assets(12140 , 288, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5664389 = mainFrame.assets(12742 , 275, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5457556 = mainFrame.assets(13822 , 285, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8607514 = mainFrame.assets(14196 , -129, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7259531 = mainFrame.assets(15290 , 450, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1911749 = mainFrame.assets(15426 , -69, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9294134 = mainFrame.assets(7084 , -6067, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4546444 = mainFrame.assets(7184 , -6017, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6302609 = mainFrame.assets(7284 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8082771 = mainFrame.assets(7484 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8322091 = mainFrame.assets(7384 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5190735 = mainFrame.assets(7559 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5154436 = mainFrame.assets(7659 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8806342 = mainFrame.assets(7784 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree185952 = mainFrame.assets(7909 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2399591 = mainFrame.assets(8059 , -5967, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6375606 = mainFrame.assets(8184 , -5792, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5183165 = mainFrame.assets(8134 , -5842, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2632178 = mainFrame.assets(8284 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4750703 = mainFrame.assets(8384 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8452285 = mainFrame.assets(8509 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree954059 = mainFrame.assets(8634 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3913763 = mainFrame.assets(8734 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2658908 = mainFrame.assets(8859 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8890663 = mainFrame.assets(9009 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6101518 = mainFrame.assets(9134 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2812298 = mainFrame.assets(9259 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4056913 = mainFrame.assets(9384 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5220054 = mainFrame.assets(9484 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6976626 = mainFrame.assets(9609 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8729470 = mainFrame.assets(9834 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5125693 = mainFrame.assets(9759 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3384917 = mainFrame.assets(9934 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7912554 = mainFrame.assets(10059 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3559740 = mainFrame.assets(10184 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7837572 = mainFrame.assets(10284 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1922105 = mainFrame.assets(10384 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree467559 = mainFrame.assets(10509 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6128170 = mainFrame.assets(10659 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3662865 = mainFrame.assets(10784 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2048156 = mainFrame.assets(10934 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2934467 = mainFrame.assets(11084 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6862194 = mainFrame.assets(11234 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree691378 = mainFrame.assets(11384 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8322462 = mainFrame.assets(11559 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4560341 = mainFrame.assets(11734 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5063331 = mainFrame.assets(11909 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9632926 = mainFrame.assets(11884 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1905667 = mainFrame.assets(11984 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6039112 = mainFrame.assets(12084 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3654647 = mainFrame.assets(12184 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2686439 = mainFrame.assets(12309 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8598639 = mainFrame.assets(12459 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree271638 = mainFrame.assets(12559 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6602032 = mainFrame.assets(12409 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8105100 = mainFrame.assets(12634 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6825928 = mainFrame.assets(12734 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5131757 = mainFrame.assets(12859 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2342103 = mainFrame.assets(13009 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2435384 = mainFrame.assets(13109 , -5717, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6518572 = mainFrame.assets(13105 , -5578, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3033592 = mainFrame.assets(13105 , -5428, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2496826 = mainFrame.assets(13180 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1870690 = mainFrame.assets(13280 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8454682 = mainFrame.assets(13380 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree464437 = mainFrame.assets(13480 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8914726 = mainFrame.assets(13605 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3935739 = mainFrame.assets(13705 , -5303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5032229 = mainFrame.assets(13865 , -5838, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4329269 = mainFrame.assets(13790 , -5638, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3650788 = mainFrame.assets(13790 , -5513, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree805723 = mainFrame.assets(13790 , -5388, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7676965 = mainFrame.assets(13783 , -5306, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree947007 = mainFrame.assets(14005 , -6083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5881947 = mainFrame.assets(14130 , -6083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5964617 = mainFrame.assets(14255 , -6083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3129453 = mainFrame.assets(14355 , -6083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7845320 = mainFrame.assets(14455 , -6083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6952321 = mainFrame.assets(14008 , -6011, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6619962 = mainFrame.assets(14583 , -6036, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree708655 = mainFrame.assets(14683 , -6036, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8119923 = mainFrame.assets(15372 , -5905, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9752098 = mainFrame.assets(15472 , -5905, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5316796 = mainFrame.assets(15597 , -5905, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5315600 = mainFrame.assets(15772 , -5905, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2055909 = mainFrame.assets(15722 , -5905, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1456271 = mainFrame.assets(14341 , -1744, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5531316 = mainFrame.assets(10686 , -1673, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6419097 = mainFrame.assets(14720 , -1852, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree952845 = mainFrame.assets(14720 , -2002, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9284153 = mainFrame.assets(14720 , -2152, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7675243 = mainFrame.assets(14720 , -2402, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1556548 = mainFrame.assets(14414 , -5301, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree39616467 = mainFrame.assets(15897 , -110, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5648767579 = mainFrame.assets(15897 , 15, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree77820097 = mainFrame.assets(15897 , 140, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6656476541 = mainFrame.assets(15897 , 265, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree410555650 = mainFrame.assets(15897 , 390, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree39134108 = mainFrame.assets(15897 , 540, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5345151925 = mainFrame.assets(15889 , 622, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6995224 = mainFrame.assets(8996 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2594009 = mainFrame.assets(9096 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1769738 = mainFrame.assets(9221 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7569855 = mainFrame.assets(9371 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4509706 = mainFrame.assets(9546 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5822404 = mainFrame.assets(9446 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree545418 = mainFrame.assets(9721 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4735210 = mainFrame.assets(9621 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5051639 = mainFrame.assets(9846 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1619688 = mainFrame.assets(9946 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree90474 = mainFrame.assets(10071 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2023031 = mainFrame.assets(10196 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2925140 = mainFrame.assets(10321 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6036291 = mainFrame.assets(10446 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3199280 = mainFrame.assets(10596 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7128280 = mainFrame.assets(10771 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4875937 = mainFrame.assets(10721 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6461475 = mainFrame.assets(10896 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6163797 = mainFrame.assets(11021 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9189558 = mainFrame.assets(11196 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3910251 = mainFrame.assets(11071 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5792930 = mainFrame.assets(11371 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2652457 = mainFrame.assets(11246 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2885247 = mainFrame.assets(11496 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7385978 = mainFrame.assets(11621 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2333556 = mainFrame.assets(11746 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree489446 = mainFrame.assets(11896 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2096077 = mainFrame.assets(12021 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9642619 = mainFrame.assets(12121 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5420588 = mainFrame.assets(12221 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5160370 = mainFrame.assets(12346 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9394205 = mainFrame.assets(12496 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2258626 = mainFrame.assets(12596 , -8185, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8130165 = mainFrame.assets(12693 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9348828 = mainFrame.assets(12793 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7863003 = mainFrame.assets(12943 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5659619 = mainFrame.assets(13068 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree50792 = mainFrame.assets(13193 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6099386 = mainFrame.assets(13343 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7308405 = mainFrame.assets(13493 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4248191 = mainFrame.assets(13618 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5082069 = mainFrame.assets(13793 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4306000 = mainFrame.assets(13918 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7791825 = mainFrame.assets(14018 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3485773 = mainFrame.assets(14143 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1490437 = mainFrame.assets(14243 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9140949 = mainFrame.assets(14368 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9596250 = mainFrame.assets(14518 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1429318 = mainFrame.assets(14643 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4041571 = mainFrame.assets(14768 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6767830 = mainFrame.assets(14893 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree231319 = mainFrame.assets(15018 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9110307 = mainFrame.assets(15118 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree929468 = mainFrame.assets(15368 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2223194 = mainFrame.assets(15268 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5889756 = mainFrame.assets(15593 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3840864 = mainFrame.assets(15893 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1435134 = mainFrame.assets(15743 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1704949 = mainFrame.assets(15493 , -8182, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9206715 = mainFrame.assets(2474 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4085487 = mainFrame.assets(2549 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3507432 = mainFrame.assets(2674 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree434540 = mainFrame.assets(2849 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3708324 = mainFrame.assets(2974 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3834086 = mainFrame.assets(3199 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree15040 = mainFrame.assets(3099 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4611611 = mainFrame.assets(3324 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9698629 = mainFrame.assets(3524 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1870970 = mainFrame.assets(3524 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3447164 = mainFrame.assets(3399 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6230488 = mainFrame.assets(3649 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9182955 = mainFrame.assets(3774 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4344606 = mainFrame.assets(3924 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2442910 = mainFrame.assets(4099 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5103322 = mainFrame.assets(4224 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6573016 = mainFrame.assets(4224 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6429359 = mainFrame.assets(4324 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9243609 = mainFrame.assets(4524 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7909173 = mainFrame.assets(4449 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4628434 = mainFrame.assets(4699 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3345029 = mainFrame.assets(4624 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8642269 = mainFrame.assets(4799 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5351563 = mainFrame.assets(4924 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1190198 = mainFrame.assets(5074 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1898330 = mainFrame.assets(5174 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7893570 = mainFrame.assets(5274 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9182584 = mainFrame.assets(5424 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree326971 = mainFrame.assets(5549 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2273167 = mainFrame.assets(5674 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9686776 = mainFrame.assets(5824 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1872221 = mainFrame.assets(5899 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2931180 = mainFrame.assets(5999 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3478232 = mainFrame.assets(6124 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1856167 = mainFrame.assets(6274 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1789368 = mainFrame.assets(6424 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6030323 = mainFrame.assets(6524 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4854558 = mainFrame.assets(6674 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6888383 = mainFrame.assets(6849 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7161483 = mainFrame.assets(6974 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7119951 = mainFrame.assets(7124 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree352324 = mainFrame.assets(7274 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1483349 = mainFrame.assets(7424 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2792651 = mainFrame.assets(7549 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9678301 = mainFrame.assets(7649 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1905339 = mainFrame.assets(7749 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1435172 = mainFrame.assets(7899 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4545246 = mainFrame.assets(8099 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8688573 = mainFrame.assets(8024 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3163284 = mainFrame.assets(8149 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9921715 = mainFrame.assets(8249 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7928291 = mainFrame.assets(8349 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree473342 = mainFrame.assets(8499 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5085912 = mainFrame.assets(8424 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7926294 = mainFrame.assets(8624 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8785962 = mainFrame.assets(8749 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9436639 = mainFrame.assets(8874 , -8198, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8458095 = mainFrame.assets(15894 , -5224, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9496351 = mainFrame.assets(15894 , -5116, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9687084 = mainFrame.assets(15894 , -5008, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8936391 = mainFrame.assets(15894 , -4912, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2461937 = mainFrame.assets(15894 , -4792, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9124816 = mainFrame.assets(15894 , -4708, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5268518 = mainFrame.assets(15894 , -4624, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5413058 = mainFrame.assets(15894 , -4534, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6138448 = mainFrame.assets(15894 , -4432, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3354822 = mainFrame.assets(15894 , -4342, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1895213 = mainFrame.assets(15894 , -4240, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5899497 = mainFrame.assets(15894 , -4150, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1009735 = mainFrame.assets(15894 , -4042, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5732778 = mainFrame.assets(15894 , -3952, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7177675 = mainFrame.assets(15894 , -3874, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1981486 = mainFrame.assets(15894 , -3724, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1967982 = mainFrame.assets(15894 , -3628, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7692972 = mainFrame.assets(15894 , -3514, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5133889 = mainFrame.assets(15894 , -3394, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8729518 = mainFrame.assets(15894 , -3292, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4339900 = mainFrame.assets(15894 , -3202, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2166631 = mainFrame.assets(15894 , -3082, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6213314 = mainFrame.assets(15894 , -2944, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5538868 = mainFrame.assets(15894 , -2806, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4505246 = mainFrame.assets(15894 , -2674, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8831994 = mainFrame.assets(15894 , -2536, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree628553 = mainFrame.assets(15894 , -2386, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1876186 = mainFrame.assets(15894 , -2236, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6469648 = mainFrame.assets(15894 , -2104, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7558457 = mainFrame.assets(15894 , -1966, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8845061 = mainFrame.assets(15894 , -1804, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9256199 = mainFrame.assets(15894 , -1654, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1645444 = mainFrame.assets(15894 , -1522, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1216927 = mainFrame.assets(15894 , -1348, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3089102 = mainFrame.assets(15894 , -1180, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6797450 = mainFrame.assets(15894 , -1030, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6760275 = mainFrame.assets(15894 , -868, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8960257 = mainFrame.assets(15894 , -706, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1556352 = mainFrame.assets(15894 , -550, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4043895 = mainFrame.assets(15894 , -406, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5291694 = mainFrame.assets(15894 , -250, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6321688 = mainFrame.assets(15531 , -1492, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2638378 = mainFrame.assets(15386 , -1752, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1389579 = mainFrame.assets(15670 , -2576, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1117048 = mainFrame.assets(15670 , -3020, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9035911 = mainFrame.assets(15591 , -3730, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9931432 = mainFrame.assets(14969 , -3858, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5406515 = mainFrame.assets(14367 , -4042, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9171430 = mainFrame.assets(14297 , -4374, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3356492 = mainFrame.assets(14349 , -4768, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree51817 = mainFrame.assets(14695 , -5675, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3651251 = mainFrame.assets(15343 , -6503, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6822505 = mainFrame.assets(15471 , -6841, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6825045 = mainFrame.assets(14241 , -7189, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4354294 = mainFrame.assets(13084 , -7367, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1113516 = mainFrame.assets(13626 , -7807, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1399506 = mainFrame.assets(13404 , -7951, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9941675 = mainFrame.assets(13120 , -8063, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2534819 = mainFrame.assets(12855 , -8083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8370739 = mainFrame.assets(12543 , -8083, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3854757 = mainFrame.assets(11083 , -7073, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree992857 = mainFrame.assets(10159 , -7478, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree796117 = mainFrame.assets(9653 , -7278, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9725106 = mainFrame.assets(9053 , -6918, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5889562 = mainFrame.assets(8746 , -6401, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3412042 = mainFrame.assets(8158 , -6593, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9764398 = mainFrame.assets(7760 , -6633, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8125214 = mainFrame.assets(7590 , -6799, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8042317 = mainFrame.assets(7415 , -7107, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7479968 = mainFrame.assets(7215 , -7387, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7667771 = mainFrame.assets(6995 , -7677, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2512278 = mainFrame.assets(6687 , -7777, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9215234 = mainFrame.assets(6241 , -7889, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5915733 = mainFrame.assets(5669 , -7869, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4889782 = mainFrame.assets(2798 , -6603, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9823986 = mainFrame.assets(2990 , -6603, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2257050 = mainFrame.assets(3446 , -6492, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3531412 = mainFrame.assets(2606 , -7302, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4317160 = mainFrame.assets(2691 , -7282, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6214228 = mainFrame.assets(2769 , -7303, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7714919 = mainFrame.assets(2880 , -7252, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree641695 = mainFrame.assets(2988 , -7252, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8584396 = mainFrame.assets(3102 , -7252, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2992229 = mainFrame.assets(3222 , -7252, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7997346 = mainFrame.assets(3342 , -7252, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6868632 = mainFrame.assets(3390 , -7183, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8823881 = mainFrame.assets(3486 , -7183, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9384217 = mainFrame.assets(3612 , -7183, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7521373 = mainFrame.assets(3738 , -7138, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4432626 = mainFrame.assets(3858 , -7093, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1369880 = mainFrame.assets(4014 , -7048, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9374114 = mainFrame.assets(4196 , -7080, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6561023 = mainFrame.assets(4124 , -7080, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9620677 = mainFrame.assets(3950 , -7080, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7597664 = mainFrame.assets(4276 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4897421 = mainFrame.assets(4434 , -7039, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9855444 = mainFrame.assets(4382 , -7071, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5370506 = mainFrame.assets(4522 , -7091, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7482388 = mainFrame.assets(4618 , -7139, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2091158 = mainFrame.assets(4736 , -7134, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9563150 = mainFrame.assets(4816 , -7079, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6195529 = mainFrame.assets(4996 , -7079, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1550825 = mainFrame.assets(4922 , -7107, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4562546 = mainFrame.assets(5096 , -7107, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3177897 = mainFrame.assets(5188 , -7139, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5863615 = mainFrame.assets(5394 , -7099, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1612034 = mainFrame.assets(5304 , -7099, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2492666 = mainFrame.assets(5502 , -7099, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1640866 = mainFrame.assets(5616 , -7099, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8252251 = mainFrame.assets(5700 , -7135, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6678393 = mainFrame.assets(5790 , -7147, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4057316 = mainFrame.assets(5892 , -7120, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2815489 = mainFrame.assets(6000 , -7120, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9625092 = mainFrame.assets(6138 , -7090, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6826323 = mainFrame.assets(6278 , -7080, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6125837 = mainFrame.assets(6422 , -7080, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree735368 = mainFrame.assets(6526 , -6995, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6209566 = mainFrame.assets(6710 , -6930, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4396413 = mainFrame.assets(6834 , -6760, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4489681 = mainFrame.assets(6884 , -6597, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1592387 = mainFrame.assets(6920 , -6342, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4402511 = mainFrame.assets(6936 , -6208, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8895579 = mainFrame.assets(6952 , -6110, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9975981 = mainFrame.assets(6888 , -6433, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3301276 = mainFrame.assets(6744 , -6775, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2190578 = mainFrame.assets(6597 , -6883, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9239238 = mainFrame.assets(6320 , -6969, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5717459 = mainFrame.assets(6198 , -7057, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6658485 = mainFrame.assets(5999 , -7020, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9444391 = mainFrame.assets(5845 , -7028, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4559396 = mainFrame.assets(5710 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2578459 = mainFrame.assets(5542 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2607422 = mainFrame.assets(5350 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1630222 = mainFrame.assets(5194 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2704923 = mainFrame.assets(5062 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4277952 = mainFrame.assets(4888 , -7040, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1928685 = mainFrame.assets(4716 , -7030, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6180223 = mainFrame.assets(4606 , -7010, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3773204 = mainFrame.assets(4156 , -7010, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1103873 = mainFrame.assets(3474 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree793133 = mainFrame.assets(3294 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3271991 = mainFrame.assets(3114 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4537717 = mainFrame.assets(2946 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1279115 = mainFrame.assets(2826 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8047198 = mainFrame.assets(2712 , -7210, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3090544 = mainFrame.assets(2576 , -7266, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8473991 = mainFrame.assets(2506 , -7286, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2018106 = mainFrame.assets(4401 , -7003, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7844071 = mainFrame.assets(6111 , -7018, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9780511 = mainFrame.assets(6425 , -6933, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5236789 = mainFrame.assets(6242 , -6948, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8103832 = mainFrame.assets(6891 , -6307, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4290940 = mainFrame.assets(6807 , -6613, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8243648 = mainFrame.assets(6657 , -6787, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2904261 = mainFrame.assets(4015 , -7028, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4418733 = mainFrame.assets(3375 , -7138, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3151693 = mainFrame.assets(3539 , -7116, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3696520 = mainFrame.assets(3201 , -7165, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6080178 = mainFrame.assets(2554 , -7211, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9418599 = mainFrame.assets(1999 , -6179, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9764304 = mainFrame.assets(2215 , -5087, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4471253 = mainFrame.assets(1962 , -4612, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8636901 = mainFrame.assets(2216 , -4053, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2557818 = mainFrame.assets(1690 , -3446, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5265643 = mainFrame.assets(2298 , -3403, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7954813 = mainFrame.assets(2071 , -2780, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8448378 = mainFrame.assets(1895 , -2085, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5986250 = mainFrame.assets(1514 , -6702, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6342155 = mainFrame.assets(1509 , -6583, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8500856 = mainFrame.assets(1431 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7363945 = mainFrame.assets(1251 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8974681 = mainFrame.assets(1341 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1278418 = mainFrame.assets(1197 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7723548 = mainFrame.assets(1083 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7560305 = mainFrame.assets(975 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6311823 = mainFrame.assets(861 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5381580 = mainFrame.assets(729 , -6523, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3252481 = mainFrame.assets(577 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5582701 = mainFrame.assets(451 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4778675 = mainFrame.assets(319 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4178348 = mainFrame.assets(217 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8467457 = mainFrame.assets(121 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7727334 = mainFrame.assets(37 , -6539, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3333056 = mainFrame.assets(-67 , -6577, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6048703 = mainFrame.assets(-67 , -6511, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree942262 = mainFrame.assets(-67 , -6427, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9798835 = mainFrame.assets(-67 , -6325, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9553856 = mainFrame.assets(-67 , -6199, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3019335 = mainFrame.assets(-67 , -6055, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8819895 = mainFrame.assets(-67 , -5929, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4010428 = mainFrame.assets(-67 , -5773, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree437711 = mainFrame.assets(-67 , -5635, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree773776 = mainFrame.assets(-67 , -5515, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9692262 = mainFrame.assets(-67 , -5407, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree202250 = mainFrame.assets(-67 , -5275, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1120178 = mainFrame.assets(-67 , -5137, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7479147 = mainFrame.assets(-67 , -5005, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5756555 = mainFrame.assets(-67 , -4873, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4498280 = mainFrame.assets(-67 , -4729, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7447033 = mainFrame.assets(-67 , -4591, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3148577 = mainFrame.assets(-67 , -4465, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6530406 = mainFrame.assets(-67 , -4339, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2047667 = mainFrame.assets(-67 , -4195, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3487278 = mainFrame.assets(-67 , -4069, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8689980 = mainFrame.assets(-67 , -3925, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5730096 = mainFrame.assets(-67 , -3781, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4334159 = mainFrame.assets(-67 , -3643, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3058002 = mainFrame.assets(-67 , -3487, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6536043 = mainFrame.assets(-67 , -3343, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2050908 = mainFrame.assets(-67 , -3217, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5687754 = mainFrame.assets(-67 , -3061, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5122238 = mainFrame.assets(-67 , -2929, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2806883 = mainFrame.assets(-67 , -2791, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4535955 = mainFrame.assets(-67 , -2647, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8095523 = mainFrame.assets(-67 , -2503, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6524478 = mainFrame.assets(-67 , -2359, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4326009 = mainFrame.assets(-67 , -2215, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1979602 = mainFrame.assets(-67 , -2059, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8184004 = mainFrame.assets(-67 , -1915, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1944513 = mainFrame.assets(-67 , -1783, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2491834 = mainFrame.assets(-67 , -1639, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2383839 = mainFrame.assets(-67 , -1489, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5333429 = mainFrame.assets(-67 , -1333, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree178805 = mainFrame.assets(-67 , -1171, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1141 = mainFrame.assets(-67 , -1003, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2870748 = mainFrame.assets(-67 , -853, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5284431 = mainFrame.assets(-67 , -697, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7899588 = mainFrame.assets(-67 , -547, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5727540 = mainFrame.assets(-67 , -373, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2651477 = mainFrame.assets(-67 , -181, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9310792 = mainFrame.assets(-67 , -25, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6895424 = mainFrame.assets(-67 , 137, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7677106 = mainFrame.assets(-67 , 299, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1661864 = mainFrame.assets(-67 , 449, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5057161 = mainFrame.assets(-67 , 599, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6832098 = mainFrame.assets(15559 , -3380, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8512689 = mainFrame.assets(15200 , -4458, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6232756 = mainFrame.assets(15042 , -5068, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5832627 = mainFrame.assets(14460 , -5068, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5234340 = mainFrame.assets(14425 , -5462, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7437695 = mainFrame.assets(14205 , -5818, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1536450 = mainFrame.assets(13914 , -6004, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5320075 = mainFrame.assets(13960 , -6560, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6819830 = mainFrame.assets(14334 , -6415, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2447868 = mainFrame.assets(14918 , -6639, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree498763 = mainFrame.assets(15318 , -7357, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1356730 = mainFrame.assets(15283 , -7991, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8516220 = mainFrame.assets(14767 , -7661, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2705686 = mainFrame.assets(15893 , -8163, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5119799 = mainFrame.assets(15893 , -8073, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3481253 = mainFrame.assets(15893 , -7995, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree815187 = mainFrame.assets(15893 , -7923, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9308511 = mainFrame.assets(15893 , -7791, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3771774 = mainFrame.assets(15893 , -7695, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2656600 = mainFrame.assets(15893 , -7593, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3299039 = mainFrame.assets(15893 , -7473, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree572142 = mainFrame.assets(15893 , -7347, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3726092 = mainFrame.assets(15941 , -7203, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2806551 = mainFrame.assets(15949 , -7022, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1360115 = mainFrame.assets(15949 , -6890, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6097244 = mainFrame.assets(15961 , -6755, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree88208 = mainFrame.assets(15961 , -6629, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9100371 = mainFrame.assets(15961 , -6527, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6693837 = mainFrame.assets(15961 , -6413, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7641452 = mainFrame.assets(15961 , -6311, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1811973 = mainFrame.assets(15956 , -6204, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3044499 = mainFrame.assets(15931 , -6047, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8531071 = mainFrame.assets(15931 , -5939, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree220284 = mainFrame.assets(15896 , -5838, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7506151 = mainFrame.assets(15896 , -5742, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3746810 = mainFrame.assets(15896 , -5646, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4772677 = mainFrame.assets(15896 , -5544, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2572910 = mainFrame.assets(15908 , -5445, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8599361 = mainFrame.assets(15908 , -5361, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);

    public static JLabel House6307983 = mainFrame.assets(7843 , -1214, 600, 600,  debugMode, "images/assets/houses/house.png", false, 8, true);
    public static JLabel House6347268 = mainFrame.assets(7877 , -2268, 600, 600,  debugMode, "images/assets/houses/house.png", false, 8, true);
    public static JLabel House5613608 = mainFrame.assets(7715 , -3102, 600, 600,  debugMode, "images/assets/houses/house.png", false, 8, true);
    public static JLabel HouseTwo9396074 = mainFrame.assets(7628, -3758, 600, 600,  debugMode, "images/assets/houses/houseTwo.png", false, 8, true);
    public static JLabel HouseTwo6064984 = mainFrame.assets(7907 , -4356, 600, 600,  debugMode, "images/assets/houses/houseTwo.png", false, 8, true);
    public static JLabel HouseTwo924866 = mainFrame.assets(8508 , -1141, 600, 600,  debugMode, "images/assets/houses/houseTwo.png", false, 8, true);
    public static JLabel HouseTwo7756268 = mainFrame.assets(1808 , -2580, 400, 400,  debugMode, "images/assets/houses/houseTwo.png", false, 8, true);


// ALL for the maze (its very big yes)
    public static JLabel LittleBush4476318 = mainFrame.assets(10904 , -486, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush4131510 = mainFrame.assets(10904 , -906, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush2396163 = mainFrame.assets(10904 , -1386, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpOne = mainFrame.assets(10906 , -1194, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpTwo = mainFrame.assets(10906 , -738, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel LittleBush8318242 = mainFrame.assets(11540 , -738, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush2976735 = mainFrame.assets(11544 , -1150, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush5659796 = mainFrame.assets(11544 , -1618, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush9842894 = mainFrame.assets(11544 , -370, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpThree = mainFrame.assets(11546 , -622, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpFour = mainFrame.assets(11546 , -1006, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpFive = mainFrame.assets(11546 , -1438, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel LittleBush3659183 = mainFrame.assets(12184 , -1009, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush3050567 = mainFrame.assets(12184 , -1357, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush9963417 = mainFrame.assets(12184 , -1741, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush505283 = mainFrame.assets(12184 , -637, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpSix = mainFrame.assets(12173 , -857, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpSeven = mainFrame.assets(12173 , -1241, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpEight = mainFrame.assets(12173 , -1601, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel LittleBush7556671 = mainFrame.assets(12836 , -1052, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush4248156 = mainFrame.assets(12836 , -1400, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush1221163 = mainFrame.assets(12836 , -668, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush8010436 = mainFrame.assets(12836 , -296, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpNine = mainFrame.assets(12826 , -524, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpTen = mainFrame.assets(12826 , -932, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpEleven = mainFrame.assets(12826 , -1280, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel LittleBush1556035 = mainFrame.assets(13366 , -1586, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush5714479 = mainFrame.assets(13366 , -1226, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush961166 = mainFrame.assets(13366 , -854, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush2378646 = mainFrame.assets(13366 , -482, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpTwelve = mainFrame.assets(13356 , -722, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpThirteen = mainFrame.assets(13356 , -1094, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpFourteen = mainFrame.assets(13356 , -1466, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel LittleBush8287394 = mainFrame.assets(13966 , -1028, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush2024410 = mainFrame.assets(13966 , -560, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel LittleBush3074532 = mainFrame.assets(13966 , -1388, 100, 100,  debugMode, "images/assets/littlebush.png", false, 8, true);
    public static JLabel warpFifteen = mainFrame.assets(13956 , -1280, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel warpSixteen = mainFrame.assets(13956 , -848, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
    public static JLabel Tree7750002 = mainFrame.assets(11015 , -1690, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7407216 = mainFrame.assets(11255 , -1726, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8980819 = mainFrame.assets(11675 , -1834, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8703687 = mainFrame.assets(11903 , -1870, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3678105 = mainFrame.assets(12335 , -1906, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree422279 = mainFrame.assets(12599 , -1714, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7713566 = mainFrame.assets(12947 , -1714, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2765583 = mainFrame.assets(13163 , -1882, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1945038 = mainFrame.assets(13559 , -1774, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree186322 = mainFrame.assets(13867 , -1701, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1759215 = mainFrame.assets(14174 , -1619, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8930861 = mainFrame.assets(13803 , -482, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6533175 = mainFrame.assets(13506 , -413, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1579725 = mainFrame.assets(13242 , -353, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree7035561 = mainFrame.assets(12987 , -421, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9230897 = mainFrame.assets(12609 , -331, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6804403 = mainFrame.assets(12363 , -475, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4852611 = mainFrame.assets(12060 , -495, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1130434 = mainFrame.assets(11847 , -390, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3735295 = mainFrame.assets(11595 , -318, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1249126 = mainFrame.assets(11295 , -386, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8594725 = mainFrame.assets(11046 , -425, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4914318 = mainFrame.assets(10617 , -404, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree73634 = mainFrame.assets(10233 , -1212, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree9810489 = mainFrame.assets(9897 , -1068, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5666911 = mainFrame.assets(10465 , -1600, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6784751 = mainFrame.assets(9481 , -1060, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6622075 = mainFrame.assets(10157 , -502, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3075148 = mainFrame.assets(9467 , -702, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree8464097 = mainFrame.assets(11487 , -2103, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5416818 = mainFrame.assets(11931 , -2247, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4440599 = mainFrame.assets(12763 , -2065, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1866024 = mainFrame.assets(13191 , -2337, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree5514514 = mainFrame.assets(13691 , -2031, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree3544453 = mainFrame.assets(14519 , -1815, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree6337614 = mainFrame.assets(14533 , -1278, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree1329190 = mainFrame.assets(14483 , -588, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree4867098 = mainFrame.assets(15147 , -772, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);
    public static JLabel Tree2260184 = mainFrame.assets(15307 , -1244, 200, 300,  debugMode, "images/assets/tree.png", false, 8, true);

    public static JLabel WorldBarrier1 = mainFrame.assets(19200 , -4800, 2160, 600,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier2 = mainFrame.assets(21660 , -4800, 2260, 600,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier3 = mainFrame.assets(19200 , -4000, 1200, 1400,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier4 = mainFrame.assets(18000 , -2500, 500, 400,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier5 = mainFrame.assets(19200 , -1900, 700, 1200,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier6 = mainFrame.assets(20000 , -820, 1400, 600,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier7 = mainFrame.assets(21300 , -920, 1600, 600,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier8 = mainFrame.assets(22900 , -2000, 1400, 1200,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier9 = mainFrame.assets(23800 , -2600, 300, 600,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier10 = mainFrame.assets(23600 , -3900, 400, 1300,  debugMode, "", false, 8, true);
    public static JLabel worldBarrier11 = mainFrame.assets(23200 , -4100, 400, 200,  debugMode, "", false, 8, true);

// sword received text
    public static JLabel stoneSword = mainFrame.GUIassets( 80, 600, 896, 224, false, "images/assets/SwordText/CharacterSword1.png", false, 0, false);
    public static JLabel ironSword = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/assets/SwordText/CharacterSword2.png", false, 0, false);
    public static JLabel goldSword = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/assets/SwordText/CharacterSword3.png", false, 0, false);
    public static JLabel rubySword = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/assets/SwordText/CharacterSword4.png", false, 0, false);
    public static JLabel emeraldSword = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/assets/SwordText/CharacterSword5.png", false, 0, false);
    public static JLabel diamondSword = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/assets/SwordText/CharacterSword6.png", false, 0, false);

  //  public static JLabel gotApple = mainFrame.GUIassets( 130, 600, 1280, 320, false, "images/text/appleFind.png", false, 0, false);


   // public static JLabel armourFound = mainFrame.GUIassets( 130, 600, 896, 224, false, "images/equipment/ArmourFound.png", false, 0, false);



    //all the images for the up attacks (different sword types)
    public static JLabel[] upAttack = new public static JLabel[]{

            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/wood/up_wood.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/stone/up_stone.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/iron/up_iron.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/gold/up_gold.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/ruby/up_ruby.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/emerald/up_emerald.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/diamond/up_diamond.png", false, 1, false)

    };
    //all the images for the left attacks (different sword types)
    public static JLabel[] leftAttack = new JLabel[]{
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/wood/left_wood.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/stone/stone_left.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/iron/left_iron.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/gold/left_gold.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/ruby/left_ruby.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/emerald/left_emerald.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/diamond/left_diamond.png", false, 1, false)


    };
    //all the images for the down attacks (different sword types)
    public static JLabel[] downAttack = new JLabel[]{


            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/wood/down_wood.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/stone/down_stone.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/iron/down_iron.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/gold/down_gold.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/ruby/down_ruby.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/emerald/down_emerald.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/diamond/down_diamond.png", false, 1, false)

    };
    //all the images for the right attacks (different sword types)
    public static JLabel[] rightAttack = new JLabel[]{
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/wood/right_wood.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/stone/right_stone.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/iron/right_iron.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/gold/right_gold.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/ruby/right_ruby.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/emerald/right_emerald.png", false, 1, false),
            mainFrame.GUIassets(100, 100, 100, 100, false, "images/equipment/diamond/right_diamond.png", false, 1, false)

    };

    private void initializeObjects() {
        press = gameFrame.GUIassets(125, 700, 760, 40, false, "images/GUI/pressE.png", false, 0, false);
        pressChest = gameFrame.GUIassets(125, 700, 760, 40, false, "images/GUI/pressE.png", false, 0, false);
        pressrespawn = gameFrame.GUIassets(75, 450, 860, 350, false, "images/text/respawn.png", false, 0, false);
        respawnSet = gameFrame.GUIassets(75, 0, 860, 350, false, "images/text/respawnSet.png", false, 0, false);
        iceSpikeOne = gameFrame.GUIassets( 430, 345, 125, 125, false, "images/mob/tortles/iceSpikeSmall.png", false, 1, false);
        iceSpikeTwo = gameFrame.GUIassets( 430, 345, 125, 125, false, "images/mob/tortles/iceSpikeBig.png", false, 1, false);
        gotApple = gameFrame.GUIassets( 130, 600, 1280, 320, false, "images/text/appleFind.png", false, 0, false);
        armourFound = gameFrame.GUIassets( 130, 600, 900, 320, false, "images/equipment/ArmourFound.png", false, 0, false);
        warp = gameFrame.assets(-1000, 1000, 100, 200, false, "images/assets/warpstone.png", false, 8, true);
        treebarrier = gameFrame.assets(2775, -5800, 590, 7500, gameFrame.debugMode, "images/assets/manymanytrees.png", false, 8, true);
        respawnPoints = new JLabel[] {
            gameFrame.assets( 2550, -1250, 150, 200, false, "images/assets/RespawnPoint.png", false, 8, true),
            gameFrame.assets(2811 , -7825, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
            gameFrame.assets(13943 , -7747, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
            gameFrame.assets(7283 , -645, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true),
            gameFrame.assets(14796 , -585, 150, 200,  false, "images/assets/respawnPoint.png", false, 8, true)
        };
        chestImages = new JLabel[] {
            gameFrame.assets(3880, -525, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(1708 , -2861, 150, 150,  false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(6000, -465, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(10600, -495, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(15260, -1430, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(15240, -6200, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(3220, -7720, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(9090, -4200, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(14950, -3820, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(11345, -7470, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(3675, -7610, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(8600, -2470, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(15540, -6890, 150, 150, false, "images/assets/chest.png", false, 8, true),
            gameFrame.assets(4220, -7240, 150, 150, false, "images/assets/chest.png", false, 8, true)
        };
        ghost1 = gameFrame.mobCreation(2250, -3000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600, 1);
        ghost2 = gameFrame.mobCreation(2250, -3600, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost3 = gameFrame.mobCreation(2500, -4450, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost4 = gameFrame.mobCreation(2100, 5500, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost5 = gameFrame.mobCreation(2800, -6300, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost6 = gameFrame.mobCreation(4100, -6000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost7 = gameFrame.mobCreation(4400, -5100, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost8 = gameFrame.mobCreation(4450, -4150, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost9 = gameFrame.mobCreation(5000, -2800, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost10 = gameFrame.mobCreation(4800, -2000, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost11 = gameFrame.mobCreation(4005, -2645, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        ghost12 = gameFrame.mobCreation(4085, -1700, 200, 200, "images/mob/ghostLeft.png", 2, 20, 0.5, 300, 3, 600,1);
        slime1= gameFrame.mobCreation(4685, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime2= gameFrame.mobCreation(4810, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime3= gameFrame.mobCreation(5105, -455, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime4= gameFrame.mobCreation(5350, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime5= gameFrame.mobCreation(5560, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime6= gameFrame.mobCreation(5750, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime7= gameFrame.mobCreation(4785, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime8= gameFrame.mobCreation(4910, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime9= gameFrame.mobCreation(5205, -455, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime10= gameFrame.mobCreation(5450, -555, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime11= gameFrame.mobCreation(5660, -655, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        deadEnd= gameFrame.mobCreation(13300, -6700, 200, 165, "", 2, 10, 3, 300, 5, 500,1);
        zombie1= gameFrame.mobCreation(7760, -880, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie2= gameFrame.mobCreation(7430, -2070, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie3= gameFrame.mobCreation(7570, -3130, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie4= gameFrame.mobCreation(7920, -3870, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie5= gameFrame.mobCreation(8000, -4910, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie6= gameFrame.mobCreation(9120, -3770, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie7= gameFrame.mobCreation(9090, -2850, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie8= gameFrame.mobCreation(9200, -1950, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie9= gameFrame.mobCreation(10070, -110, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        spider1= gameFrame.mobCreation(15260, -1330, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider2= gameFrame.mobCreation(15270, -2400, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider3= gameFrame.mobCreation(15450, -3280, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider4= gameFrame.mobCreation(15000, -4400, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider5= gameFrame.mobCreation(15000, -6040, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider6= gameFrame.mobCreation(15560, -6950, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider7= gameFrame.mobCreation(15000, -6040, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider8= gameFrame.mobCreation(15260, -5200, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        spider9= gameFrame.mobCreation(11920, -7720, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        zombie10= gameFrame.mobCreation(11020, -7040, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        ghost13= gameFrame.mobCreation(9430, -6930, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 300, 3, 600,1);
        slime12= gameFrame.mobCreation(8820, -5770, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        slime13= gameFrame.mobCreation(8570, -6250, 80, 65, "images/mob/littleslime.png", 2, 10, 0.5, 150, 5, 800,1);
        spider10= gameFrame.mobCreation(7510, -6450, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        ghost14= gameFrame.mobCreation(6670, -7100, 200, 200, "images/mob/ghostRight.png", 2, 20, 0.5, 200, 5, 600, 1);
        zombie11= gameFrame.mobCreation(5540, -7270, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie12= gameFrame.mobCreation(4720, -7470, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        zombie13= gameFrame.mobCreation(3650, -7590, 80, 160, "images/mob/zombie.png", 2, 50, 1, 200, 2, 1000, 2);
        spider11= gameFrame.mobCreation(3640, -7590, 160, 80, "images/mob/spider.png", 2, 20, 0.5, 200, 5, 600, 1);
        tortles = gameFrame.mobCreation(21600, -2272, 200,376, "images/mob/tortles/downStanding.png", 2, 1000, 1, 150, 3, 1600,1);
        NPC = gameFrame.assets(2100,  -2000, 100, 200, false, "images/NPC/Grandma/grandma.png", false, 2, true);
        NPC3 = gameFrame.assets(9200,  -1600, 126, 238, false, "images/NPC/Maze/secondnpc.png", false, 2, true);
        NPC2 = gameFrame.assets(14450,  -7100, 116, 228, false, "images/NPC/Wizard/wizard.png", false, 2, true);
        waterBarrier = gameFrame.assets(0, 900, 20000, 800, gameFrame.debugMode, "", false, 3 , false);
        lakeBarrier1 = gameFrame.assets(5400, -5875, 1975, 600, gameFrame.debugMode, "",false, 3, false);
        lakeBarrier2 = gameFrame.assets(5200, -5225, 2175,250, gameFrame.debugMode, "", false, 3, false);
        lakeBarrier3 = gameFrame.assets(5000, -5475, 1550,2000, gameFrame.debugMode, "", false, 3, false);
        lakeBarrier4 = gameFrame.assets(5400, -3875, 1650,2200, gameFrame.debugMode, "", false, 3, false);
        lakeBarrier5 = gameFrame.assets(5600, -1875, 1550,760, gameFrame.debugMode, "", false, 3, false);
        lakeBarrier6 = gameFrame.assets(6450, -4475, 700,560, gameFrame.debugMode, "", false, 3, false);
        endScreen = gameFrame.GUIassets(0,0, 1000, 1000, false, "images/GUI/gameOver.png", false, 2, false);
        escToQuit = gameFrame.GUIassets(100,500, 800 , 300, false, "images/GUI/escToQuit.png", false, 2, false);
        pumpkin = gameFrame.GUIassets(400,100, 200, 200, false, "images/GUI/pumpkin.png", false, 2, false);
        controls = gameFrame.GUIassets(550, 50, 400, 600,false, "images/GUI/controls.png", false, 0, true);
        SScredits = gameFrame.GUIassets(0, 0, 1040, 780,false, "images/GUI/creditsScreen.png", false, 2, true);
        startMenu = gameFrame.GUIassets(0,0, 1000, 1000, false, "images/GUI/placeHolderStart.png", false, 2, true);
        startCredits = gameFrame.GUIassets(100, 300, 400, 40, false, "images/GUI/startScreenCredits.png", false, 1, true);
        startPlay = gameFrame.GUIassets(100, 200, 400, 40, false, "images/GUI/startScreenNew.png", false, 1, true);
        startQuit = gameFrame.GUIassets(100, 400, 400, 40, false, "images/GUI/startScreenQuit.png", false, 1, true);
        currentSelection = gameFrame.GUIassets(25, 192, 60, 60, false, "images/GUI/selectionarrow.png", false, 1, true);
        NPCBackground = gameFrame.GUIassets(-170, 370, 1320, 500, false, "images/NPC/NPCDialogueBackground.png", false, 2, false);
        warpBack = gameFrame.assets(21553 , -4705, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
        warpArena = gameFrame.assets(2502 , -7564, 100, 200,  false, "images/assets/warpStone.png", false, 8, true);
        rockThird = gameFrame.assets( 2500, 2500, 200, 200, false, "images/assets/rock.png", false, 8, true);
        Rock274736 = gameFrame.assets(2353 , -7107, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock3320042 = gameFrame.assets(2278 , -7257, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock2848022 = gameFrame.assets(2178 , -7432, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock4690770 = gameFrame.assets(2178 , -7557, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock8165025 = gameFrame.assets(2178 , -7732, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock9260882 = gameFrame.assets(2178 , -7832, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock2335392 = gameFrame.assets(2278 , -7932, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock754881 = gameFrame.assets(2403 , -8007, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock1726032 = gameFrame.assets(1577 , -8031, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock8461454 = gameFrame.assets(1577 , -7856, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
        Rock4868639 = gameFrame.assets(1577 , -7681, 200, 200,  gameFrame.debugMode, "images/assets/rock.png", false, 8, true);
    }


