package com.example.pumpkinquest;
import com.example.pumpkinquest.frame;

import javax.swing.*;
import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class mobMovement extends frame {

    static int nodeSize = 32;

    private frame myFrame;
    int playerGridX = myFrame.playerWorldPos.x/nodeSize;
    int playerGridY = myFrame.playerWorldPos.y/nodeSize;

    HashMap<UUID, Integer> mobGridX = new HashMap<>();
    HashMap<UUID, Integer> mobGridY = new HashMap<>();

    int worldSizeX = 20000/nodeSize;
    int worldSizeY = 20000/nodeSize;

    nodes[][] grid = new nodes[worldSizeX][worldSizeY];






    frame my6Frame = new frame();



    public mobMovement(frame Frame) {
        this.myFrame = Frame;
    }

    ArrayList<Integer> blockedX = new ArrayList<>();
    ArrayList<Integer> blockedY = new ArrayList<>();


    public final int nodeSize = 8;

    ArrayList<Integer> pathX = new ArrayList<>();
    ArrayList<Integer> pathY = new ArrayList<>();
    ArrayList<nodes> neighbors = new ArrayList<>();



    public void check() {
       JLabel checker =  myFrame.assets(-10000, -10000, nodeSize, nodeSize, false, "", false, 1, false);

        for(int i = 0; i < 20000/nodeSize; i++) {
            for(int j = 0; j < 20000/nodeSize; j++) {
                if(true) {
                    if(myFrame.getComponentAt(i*nodeSize, j*nodeSize).getName() == "obstacle") {
                        blockedX.add(i);
                        blockedY.add(j);
                    }
                }
            }
        }
    }

    public ArrayList<nodes> getNeighbors(nodes node) {

        for(int x = -1; x <= 1; x++) {
            for(int y = -1; x <= 1; y++) {

                if(x == 0 && y == 0) {
                    continue;
                }

                int checkNeighborX = node.gridX;
                int checkNeighborY = node.gridY;

                if(checkNeighborX





            }
        }


        gain neighbors;
    }



    public void grid() {



       // JLabel checker =  myFrame.assets(startingPositionX, startingPositionY, nodeSize, nodeSize, false, "", false, 1, false);


        nodes node = new nodes(nodeSize, nodeSize, -20000, -20000);

        for(int i = 0; i < worldSizeX; i++) {
            for (int j = 0; j < worldSizeY; j++) {

                grid[i][j] = new nodes(nodeSize, nodeSize, i * nodeSize, j * nodeSize);


                for (JLabel obstacle : myFrame.obstacles) {

                    int obstacleX = obstacle.getX();
                    int obstacleY = obstacle.getY();
                    int obstacleHeight = obstacle.getHeight();
                    int obstacleWidth = obstacle.getWidth();

                    int nodeX = nodeSize * i;
                    int nodeY = nodeSize * j;

                    boolean overLapX = obstacleX < nodeX + nodeSize && obstacleX + obstacleWidth > nodeX;
                    boolean overLapY = obstacleY < nodeY + nodeSize && obstacleY + obstacleHeight > nodeY;

                    if (overLapX && overLapY) {
                        grid[i][j].collision = true;
                    }

                }
            }
        }
    }


    public void mobGridCheck(int followDistance, int mobX, int mobY ) {

        int followDistanceInNodes = followDistance/nodeSize;

        int mobGridX = (mobX + 20000) / nodeSize;
        int mobGridY = (mobY + 20000) / nodeSize;


        int maxGridX = Math.max(0 , Math.max(0, mobGridX - followDistanceInNodes));
        int maxGridY = Math.max(0, Math.max(0, mobGridY - followDistanceInNodes));
        int minGridX = Math.min(worldSizeX - 1, mobGridX + followDistanceInNodes);
        int minGridY = Math.min(worldSizeY - 1, mobGridY + followDistanceInNodes);

        nodes startingNode = grid[mobX][mobY];
        nodes playerLocation = grid[playerGridX][playerGridY];

        ArrayList<nodes> openPath = new ArrayList<>();
        ArrayList<nodes> closedPath = new ArrayList<>();

        ArrayList<nodes> path = AStar();




        for(int x = minGridX; x <= maxGridX; x++) {
            for(int y = minGridY; y <= maxGridY; y++) {
                    if(!grid[minGridX][minGridY].collision) {
                        openPath.add(grid[minGridX][minGridY]);
                    }
            }


        }





    }




    public void movement() {

        for(Map.Entry<JLabel, Point> entry : mobPoint.entrySet()) {

            JLabel mobLabel = entry.getKey(); // gets the JLabel of the mob from the mobPoint map
            Point mobPoints = entry.getValue(); // gets the Point position of the mob from the mobPoint map

            UUID mobID = reverseMobMap.get(mobLabel); // gets the UUID of the mob from the reverseMobMap, which maps JLabels to UUIDs

            Integer mobSpeed = MobSpeed.get(mobID); // gets the speed of the mob from the MobSpeed map
            Integer mobFollowDistance = MobFollowDistance.get(mobID); // gets the follow distance of the mob from the MobFollowDistance map

            Point mobSpawnpoint = mobSpawnPoint.get(mobID); // gets the spawn point of the mob from the mobSpawnPoint map

            if (mobSpeed == null || mobFollowDistance == null) {  // thanks gpt for this if statement to fix the error
                continue; // Skip this mob if data is missing
            }

            if(mobLabel == tortles) { // If the mob is a tortles, it uses the TortlesMovement method
                mobPoints = TortlesMovement((int) mobPoints.getX(), (int) mobPoints.getY(), mobSpeed, mobFollowDistance, mobSpawnpoint);
            } else { // If the mob is not a tortles, it uses the mobMovement method
                mobPoints = mobMovement((int) mobPoints.getX(), (int) mobPoints.getY(), mobSpeed, mobFollowDistance, mobSpawnpoint); // sets the mobPoints to the return value of the mobMovement method, which calculates the new position of the mob based on its speed and follow distance
            }
            mobPoint.put(mobLabel, mobPoints); // updates the mobPoint map with the new position of the mob
            mobLabel.setLocation(CameraInstance.worldToScreen(mobPoints)); // sets the location of the mob JLabel to the new position calculated by the mobMovement method, converting the world position to screen coordinates using the CameraInstance
            // System.out.println("Mob Point: " + mobPoints);
    
            double distance = Math.sqrt(Math.pow(((playerWorldPos.x - 40) - x), 2) + Math.pow(((playerWorldPos.y - 50) - y), 2));


            if(distance < mobFollowDistance) {


            }


        }






    }


    public nodes AStar() {

        int nextNodeX =







        return new nodes(nodeSize, nodeSize,
    }







}
