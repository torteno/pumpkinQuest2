package com.example.pumpkinquest;

import java.awt.Point;

public class Camera {

    // gets the position of the camera in the world, the screen width and height, and the player width and height

    public Point position;
    public int screenWidth, screenHeight;
    int playerWidth, playerHeight;

    public Camera(int screenWidth, int screenHeight, int width , int height) {
        
        // Initialize the camera with the screen dimensions and player dimensions
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.position = new Point(0, 0);
        this.playerWidth = width;
        this.playerHeight = height;
    }

    public Point worldToScreen(Point worldPos) { // Converts world coordinates to screen coordinates, with the camera position as the origin which is the center of the screen
        int screenX = (screenWidth / 2) + (worldPos.x - position.x);
        int screenY = (screenHeight / 2) + (worldPos.y - position.y);
        return new Point(screenX, screenY);
    }

    public Point screenToWorld(Point screenPos) { // Converts screen coordinates to world coordinates, with the camera position as the origin which is the center of the screen
        int worldX = screenPos.x - (screenWidth / 2) + position.x;
        int worldY = screenPos.y - (screenHeight / 2) + position.y;
        return new Point(worldX, worldY);
    }

    


}
