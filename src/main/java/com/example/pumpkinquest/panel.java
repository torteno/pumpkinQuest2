package com.example.pumpkinquest;

import javax.swing.*;
import java.awt.*;
import java.net.URL;



class BackgroundPanel extends JPanel {

    // The background image to be displayed in the panel
    private Image backgroundImage;


    //  Constructor that initializes the background image from a file
    public BackgroundPanel(String fileName) {
        URL imageURL = getClass().getResource("/" + fileName);
        if (imageURL != null) {
            backgroundImage = new ImageIcon(imageURL).getImage();
        } else {
            backgroundImage = new ImageIcon(fileName).getImage();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        // Call the superclass's paintComponent method to ensure proper rendering
        super.paintComponent(g);

        // Draw the background image, scaling it to fit the panel size/screen size
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
