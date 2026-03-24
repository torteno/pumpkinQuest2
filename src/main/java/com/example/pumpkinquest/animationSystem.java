package com.example.pumpkinquest;
import javax.swing.*;

public class animationSystem extends frame {

    public void animation(JLabel label, Icon[] images, int speed, boolean repeat) {

        long timeAtFrame = System.currentTimeMillis();
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
        } while(repeat);
    }
}
