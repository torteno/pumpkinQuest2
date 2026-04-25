package com.example.pumpkinquest;
import com.example.pumpkinquest.mobs.mob;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class mobMovement {

    public static final int nodeSize = 32; // Size of each node in the grid
    public static final int WORLD_OFFSET = 10000; // Offset to center the world



  //  private ArrayList<mob> allMobs = new ArrayList<>();

    private final frame myFrame;
    int playerGridX; // X coordinate of the player in grid cells
    int playerGridY; // Y coordinate of the player in grid cells

    // World dimensions in grid cells. Set once based on nodeSize, never reassigned.
    final int worldSizeX = 51200/nodeSize;
    final int worldSizeY = 51200/nodeSize;

    // Lazy node grid only cells that a mob or the player has actually visited get declared
    public HashMap<String, nodes> grid = new HashMap<>();

    private nodes playerNode; // Node of the player

    public nodes getPlayerNode() { // Main method for getting the player node
        return playerNode;
    }

    public void setPlayerNode(nodes playerNode) { // Main method for setting the player node
        this.playerNode = playerNode;
    }









    public mobMovement(frame Frame) { // Main method for creating the mobMovement object

        this.myFrame = Frame; // Sets the myFrame variable to the given frame
    }


    private String key(int gridX, int gridY) { // Main method for creating the key for the grid
        return gridX + "," + gridY; // Returns the key for the grid
    }


    // Get the node at this grid cell, creating it the first time anyone visits.
    public nodes getNode(int gridX, int gridY) { // Main method for getting the node at the given grid cell

        if (gridX < 0) { // Checks if the gridX is less than 0
            gridX = 0; // Sets the gridX to 0
        }
        if (gridX >= worldSizeX)  { // Checks if the gridX is greater than or equal to the worldSizeX
            gridX = worldSizeX - 1; // Sets the gridX to worldSizeX - 1
        }
        if (gridY < 0) { // Checks if the gridY is less than 0
            gridY = 0; // Sets the gridY to 0
        }
        if (gridY >= worldSizeY) { // Checks if the gridY is greater than or equal to the worldSizeY
            gridY = worldSizeY - 1; // Sets the gridY to worldSizeY - 1
        }

        String key = key(gridX, gridY); // Gets the key for the grid
        nodes existing = grid.get(key); // Gets the node at the given grid cell
        if (existing != null) { // Checks if the node exists
            return existing; // Returns the node
        }

        nodes node = new nodes(nodeSize, nodeSize, gridX * nodeSize, gridY * nodeSize); // Creates a new node
        markCollisionFromObstacles(node); // Marks the node as a collision if it is a collision
        grid.put(key, node); // Puts the node in the grid
        return node; // Returns the node
    }



    private void markCollisionFromObstacles(nodes node) { // Main method for marking the node as a collision
        int tileWorldX = (node.gridX * nodeSize) - WORLD_OFFSET; // Gets the tile world X
        int tileWorldY = (node.gridY * nodeSize) - WORLD_OFFSET; // Gets the tile world Y

        for (JLabel obstacle : myFrame.obstacles) { // Loops through all the obstacles
            if (obstacle == null) { // Checks if the obstacle is null
                continue; // Continues to the next obstacle
            }

            Point obstacleWorld = myFrame.AssetPoint.get(obstacle); // Gets the obstacle world position
            if (obstacleWorld == null) { // Checks if the obstacle world position is null
                continue; // Continues to the next obstacle
            }

            int obstacleX = obstacleWorld.x; // Gets the obstacle X position
            int obstacleY = obstacleWorld.y; // Gets the obstacle Y position
            int obstacleWidth = obstacle.getWidth(); // Gets the obstacle width
            int obstacleHeight = obstacle.getHeight(); // Gets the obstacle height


            if (tileWorldX + nodeSize > obstacleX && tileWorldX < obstacleX + obstacleWidth && tileWorldY + nodeSize > obstacleY && tileWorldY < obstacleY + obstacleHeight) { // Checks if the tile world position is greater than the obstacle position
                node.collision = true; // Sets the node collision to true
                return; // Returns the node
            }
        }
    }

    ArrayList<Integer> blockedX = new ArrayList<>(); // Array list for blocked X coordinates
    ArrayList<Integer> blockedY = new ArrayList<>(); // Array list for blocked Y coordinates


    //public final int nodeSize = 8;

    ArrayList<Integer> pathX = new ArrayList<>(); // Array list for path X coordinates
    ArrayList<Integer> pathY = new ArrayList<>(); // Array list for path Y coordinates



    public void check() { // Main method for checking the grid
       // JLabel checker =  myFrame.assets(-10000, -10000, nodeSize, nodeSize, false, "", false, 1, false);

        for(int i = 0; i < worldSizeX; i++) { // Loops through all the grid cells
            for(int j = 0; j < worldSizeY; j++) { // Loops through all the grid cells
                if(myFrame.getComponentAt(i*nodeSize, j*nodeSize).getName() == "obstacle") { // Checks if the grid cell is an obstacle
                }
            }
        }
    }

    public ArrayList<nodes> getNeighbors(nodes node) { // Main method for getting the neighbors of a node
        ArrayList<nodes> neighbors = new ArrayList<>();

        for(int x = -1; x <= 1; x++) { // Loops through all the grid cells
            for(int y = -1; y <= 1; y++) { // Loops through all the grid cells

                if(x == 0 && y == 0) { // Checks if the grid cell is the same as the current node
                    continue; // Continues to the next grid cell
                }

                int checkNeighborX = node.gridX + x; // Gets the checkNeighborX
                int checkNeighborY = node.gridY + y; // Gets the checkNeighborY

                if(checkNeighborX >= 0 && checkNeighborX < worldSizeX && checkNeighborY >= 0 && checkNeighborY < worldSizeY) { // Checks if the checkNeighborX and checkNeighborY are within the grid
                    // getNode lazily creates this neighbor if A* hasn't visited it yet
                    neighbors.add(getNode(checkNeighborX, checkNeighborY)); // Adds the neighbor to the neighbors list
                }

            }
        }
        return neighbors; // Returns the neighbors list
    }


    public double getDistance(Point mobLocation, Point endLocation) { // Main method for getting the distance between two points
        int distanceX = Math.abs(mobLocation.x - endLocation.x); // Gets the distance in the x direction
        int distanceY = Math.abs(mobLocation.y - endLocation.y); // Gets the distance in the y direction

        double distance = Math.sqrt((distanceX * distanceX) + (distanceY * distanceY)); // Calculates the distance

        return distance; //gains the distance
    }


    public double getDistanceInNodes(nodes node, nodes endNode) { // Main method for getting the distance in nodes
        int distanceX = Math.abs(node.gridX - endNode.gridX); // Gets the distance in the x direction
        int distanceY = Math.abs(node.gridY - endNode.gridY); // Gets the distance in the y direction

        double distance = Math.sqrt((distanceX * distanceX) + (distanceY * distanceY)); // Calculates the distance

        return distance;
    }



   /* private void getCost(nodes node, mob mob) {

        int distanceX = Math.abs(node.gridX - playerGridX);
        int distanceY = Math.abs(node.gridY - playerGridY);
        node.gCost = xDistance + distanceY;

        distanceX = Math.abs(


    } */




    public void grid() { // Main method for getting the grid
        playerGridX = (myFrame.playerWorldPos.x + WORLD_OFFSET) / nodeSize; // Gets the player grid X
        playerGridY = (myFrame.playerWorldPos.y + WORLD_OFFSET) / nodeSize; // Gets the player grid Y
        playerNode = getNode(playerGridX, playerGridY); // Gets the player node
    }


    public void mobGridCheck(int followDistance, int mobX, int mobY ) { // Main method for checking the mob grid

        int followDistanceInNodes = followDistance/nodeSize; // Gets the follow distance in nodes

        int mobGridX = mobX / nodeSize; // Gets the mob grid X
        int mobGridY = mobY / nodeSize; // Gets the mob grid Y


        int maxGridX = Math.max(0 , Math.max(0, mobGridX - followDistanceInNodes)); // Gets the max grid X
        int maxGridY = Math.max(0, Math.max(0, mobGridY - followDistanceInNodes)); // Gets the max grid Y
        int minGridX = Math.min(worldSizeX - 1, mobGridX + followDistanceInNodes); // Gets the min grid X
        int minGridY = Math.min(worldSizeY - 1, mobGridY + followDistanceInNodes); // Gets the min grid Y


        nodes startingNode = getNode(mobX, mobY); // Gets the starting node
        nodes playerLocation = getNode(playerGridX, playerGridY); // Gets the player location

        ArrayList<nodes> openPath = new ArrayList<>(); // Array list for open path
        ArrayList<nodes> closedPath = new ArrayList<>(); // Array list for closed path

        for(int x = minGridX; x <= maxGridX; x++) { // Loops through all the grid cells
            for(int y = minGridY; y <= maxGridY; y++) { // Loops through all the grid cells
                nodes cell = getNode(x, y); // Gets the node
                if(!cell.collision) { // Checks if the node is not a collision
                    openPath.add(cell); // Adds the node to the open path
                }
            }
        }





    }




    public void movement() { // Main method for moving the mobs

        for(Map.Entry<JLabel, Point> entry : myFrame.mobPoint.entrySet()) { // Loops through all the mobs

            JLabel mobLabel = entry.getKey(); // gets the JLabel of the mob from the mobPoint map
            Point mobPoints = entry.getValue(); // gets the Point position of the mob from the mobPoint map

            UUID mobID = myFrame.reverseMobMap.get(mobLabel); // gets the UUID of the mob from the reverseMobMap, which maps JLabels to UUIDs

            Integer mobSpeed = myFrame.MobSpeed.get(mobID); // gets the speed of the mob from the MobSpeed map
            Integer mobFollowDistance = myFrame.MobFollowDistance.get(mobID); // gets the follow distance of the mob from the MobFollowDistance map

            Point mobSpawnpoint = myFrame.mobSpawnPoint.get(mobID); // gets the spawn point of the mob from the mobSpawnPoint map

            if (mobSpeed == null || mobFollowDistance == null) {  // thanks gpt for this if statement to fix the error
                continue; // Skip this mob if data is missing
            }

            if(mobLabel == myFrame.tortles) { // If the mob is a tortles, it uses the TortlesMovement method
                mobPoints = myFrame.TortlesMovement((int) mobPoints.getX(), (int) mobPoints.getY(), mobSpeed, mobFollowDistance, mobSpawnpoint);
            } else { // If the mob is not a tortles, it uses the mobMovement method
                mobPoints = myFrame.mobMovement((int) mobPoints.getX(), (int) mobPoints.getY(), mobSpeed, mobFollowDistance, mobSpawnpoint); // sets the mobPoints to the return value of the mobMovement method, which calculates the new position of the mob based on its speed and follow distance
            }
            myFrame.mobPoint.put(mobLabel, mobPoints); // updates the mobPoint map with the new position of the mob
            mobLabel.setLocation(myFrame.CameraInstance.worldToScreen(mobPoints)); // sets the location of the mob JLabel to the new position calculated by the mobMovement method, converting the world position to screen coordinates using the CameraInstance
            // System.out.println("Mob Point: " + mobPoints);
    
            double distance = Math.sqrt(Math.pow(((myFrame.playerWorldPos.x - 40) - mobPoints.x), 2) + Math.pow(((myFrame.playerWorldPos.y - 50) - mobPoints.y), 2));


            if(distance < mobFollowDistance) {


            }


        }






    }


    public ArrayList<nodes> AStar(nodes mobStartNode, nodes locationNode) { // Main method for A* algorithm
        ArrayList<nodes> open = new ArrayList<>(); // Array list for open path
        ArrayList<nodes> closed = new ArrayList<>(); // Array list for closed path

        if (mobStartNode == null || locationNode == null) return new ArrayList<>(); // Returns an empty list if the start or end node is null

        open.add(mobStartNode); // Adds the start node to the open path
        int searchLimit = 500; // Limit search to prevent lag

        while (!open.isEmpty()) { // Loops through all the nodes in the open path
            if(searchLimit <= 0) { // Checks if the search limit is reached
                break; // Breaks the loop
            }
            searchLimit--; // Decrements the search limit

            nodes current = open.get(0); // Gets the current node
            for (nodes node : open) { // Loops through all the nodes in the open path
                if (node.getFCost() < current.getFCost() || (node.getFCost() == current.getFCost() && node.hCost < current.hCost)) { // Checks if the node is better than the current node
                    current = node; // Sets the current node to the better node
                }
            }

            open.remove(current); // Removes the current node from the open path
            closed.add(current); // Adds the current node to the closed path

            if (current == locationNode) { // Checks if the current node is the location node
                return path(mobStartNode, locationNode); // Returns the path
            }

            for (nodes neighbor : getNeighbors(current)) { // Loops through all the neighbors of the current node
                if (neighbor.collision || closed.contains(neighbor)) { // Checks if the neighbor is a collision or if it is in the closed path
                    continue; // Skips the neighbor
                }

                int updatedGCost = current.gCost + getHeuristic(current, neighbor); // Calculates the gCost of the neighbor

                if (updatedGCost < neighbor.gCost || !open.contains(neighbor)) { // Checks if the neighbor is better than the current node
                    neighbor.gCost = updatedGCost; // Sets the gCost of the neighbor
                    neighbor.hCost = getHeuristic(neighbor, locationNode); // Sets the hCost of the neighbor
                    neighbor.start = current; // Sets the start of the neighbor
                    if (!open.contains(neighbor)) { // Checks if the neighbor is not in the open path
                        open.add(neighbor); // Adds the neighbor to the open path
                    }
                }
            }
        }

        return new ArrayList<>();
    }


    public int getHeuristic(nodes startNode, nodes endNode) { // Main method for heuristic
        int distancebetweenStartandEndX = Math.abs(startNode.gridX - endNode.gridX); // Gets the distance between the start and end node in the x direction
        int distancebetweenStartandEndY = Math.abs(startNode.gridY - endNode.gridY); // Gets the distance between the start and end node in the y direction

        return 10 * (distancebetweenStartandEndX + distancebetweenStartandEndY) + (14 - 2 * 10) * Math.min(distancebetweenStartandEndX , distancebetweenStartandEndY); //THANK YOU UNIVERSITY OF TEXAS https://www.cs.utexas.edu/~theshark/courses/cs354r/lectures/cs354r-20.pdf! Quick note, if the movement is a little bit weird, adjust the nums of horizontal/vertical and diagonal to hopefully smoothen out what it will pick, and please do this before submitting and dont forget you wrote this message please

    }



    private ArrayList<nodes> path(nodes start, nodes end) { // Main method for path

        ArrayList<nodes> AStarPath = new ArrayList<>(); // Array list for A* path

            while(end != start) { // Loops through all the nodes in the path
                AStarPath.add(0, end); // Adds the end node to the A* path
                end = end.start; // Sets the end node to the start of the end node
            }

        return AStarPath; // Returns the A* path
    }



    public ArrayList<nodes> getMobPath(mob mob, nodes locationNode) { // Main method for getMobPath
        // recompute the mob's grid cell from its current world position
        int nodeX = (mob.getPosition().x + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // Gets the node position in the x direction
        int nodeY = (mob.getPosition().y + mobMovement.WORLD_OFFSET) / mobMovement.nodeSize; // Gets the node position in the y direction

        // getNode handles bounds clamping and lazy creation for both endpoints
        nodes startNode = getNode(nodeX, nodeY); // Gets the start node
        nodes endNode = getNode(locationNode.gridX, locationNode.gridY); // Gets the end node

        return AStar(startNode, endNode); // Returns the A* path
    }


    public Point mobMovementAcrossNodes(mob mob, nodes locationNode) { // Main method for mobMovementAcrossNodes

        if(mob.getCurrentPath().isEmpty() || mob.getTick() % 30 == 0) { // Checks if the mob's path is empty or if the mob's tick is a multiple of 30
            mob.setCurrentPath(getMobPath(mob, locationNode)); // Gets the mob's path
            mob.setPathNum(0); // Sets the mob's path number to 0
        }

        mob.setTick(mob.getTick() + 1); // Increments the mob's tick
        


        if(mob.getCurrentPath().isEmpty() || mob.getPathNum() >= mob.getCurrentPath().size()) { // Checks if the mob's path is empty or if the mob's path number is greater than the mob's path size
            return mob.getPosition(); // Returns the mob's position
        }


        nodes nextNode = mob.getCurrentPath().get(mob.getPathNum()); // Gets the next node in the mob's path
        int targetNodeX = (nextNode.gridX * nodeSize) - WORLD_OFFSET; // Gets the target node position in the x direction
        int targetNodeY = (nextNode.gridY * nodeSize) - WORLD_OFFSET; // Gets the target node position in the y direction

        int distanceX = targetNodeX - mob.getPosition().x; // Gets the distance between the target node and the mob in the x direction
        int distanceY = targetNodeY - mob.getPosition().y; // Gets the distance between the target node and the mob in the y direction
        double distance = Math.sqrt((distanceX * (double)distanceX) + (distanceY * (double)distanceY)); // Gets the distance between the target node and the mob


        if(distance < mob.getSpeed()) { // Checks if the distance is less than the mob's speed
            mob.setPathNum(mob.getPathNum() + 1); // Increments the mob's path number
            return new Point(targetNodeX, targetNodeY); // Returns the target node position
        }


        int newX = (int) (mob.getPosition().x + (distanceX / distance) * mob.getSpeed()); // Calculates the new x position of the mob
        int newY = (int) (mob.getPosition().y + (distanceY / distance) * mob.getSpeed()); // Calculates the new y position of the mob

        return new Point(newX, newY); // Returns the new position of the mob


    }











}
