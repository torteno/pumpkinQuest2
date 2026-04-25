package com.example.pumpkinquest;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class animationSystem extends frame { // extends the frame class to get access to the frame's data

    int frameIndex = 0; // the index of the current frame in the animation

    public void animation(JLabel label, Icon[] images, int speed, boolean repeat) { // animates the label with the given images, speed, and repeat status

        frameIndex = 0; // sets the frame index to 0
        label.setIcon(images[frameIndex]); // sets the icon of the label to the first frame


        Timer timer = new Timer(speed, new ActionListener() { // creates a timer to animate the label
            @Override
            public void actionPerformed(ActionEvent e) { // performs the animation
                frameIndex++; // increments the frame index
                if (frameIndex >= images.length) { // checks if the frame index is greater than the number of frames
                    if (repeat) { // checks if the animation should repeat
                        frameIndex = 0; // resets the frame index to 0
                    } else {
                        ((Timer) e.getSource()).stop(); // stops the timer
                        return; // returns from the method
                    }
                }
                label.setIcon(images[frameIndex]); // sets the icon of the label to the current frame
                label.repaint(); // repaints the label
            }
        });

        timer.start(); // starts the timer

       /* long timeAtFrame = System.currentTimeMillis();
        long timeCheck;
    do {
            for (int i = 0; i < images.length; i++) {
                timeCheck = System.currentTimeMillis();
                while (((timeAtFrame - timeCheck) * 100) < speed) {
                    timeCheck = System.currentTimeMillis();
                }

                if (((timeAtFrame - timeCheck) * 100) >= speed) {
                    label.setIcon(images[i]);
                    timeAtFrame = System.currentTimeMillis();
                    label.repaint();
                }
            }
        } while(repeat); */
    }
}
