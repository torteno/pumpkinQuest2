package com.example.pumpkinquest;

public class nodes {

    // Geometry — set once when the cell is created. Never mutated.
    final int nodeSizeX;
    final int nodeSizeY;
    private final int positionX;
    private final int positionY;
    final int gridX;
    final int gridY;

    // A* state — mutated by the pathfinder while it runs.
    boolean collision = false;
    nodes start;
    int gCost;
    int hCost;


    public nodes(int nodeSizeX, int nodeSizeY, int positionX, int positionY) { // constructor
        this.nodeSizeX = nodeSizeX; // sets the node size in the x direction
        this.nodeSizeY = nodeSizeY; // sets the node size in the y direction
        this.positionX = positionX; // sets the position in the x direction
        this.positionY = positionY; // sets the position in the y direction
        this.gridX = positionX / nodeSizeX; // sets the grid position in the x direction
        this.gridY = positionY / nodeSizeY; // sets the grid position in the y direction
    }

    public int getFCost() { // returns the fCost
        return gCost + hCost; 
    }

    public int getPositionX() { // returns the mob position(coordinates) in the x direction
        return positionX;
    }

    public int getPositionY() { // returns the mob position(coordinates) in the y direction
        return positionY;
    }
}


