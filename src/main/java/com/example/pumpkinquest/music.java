package com.example.pumpkinquest;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.example.pumpkinquest.frame.volume;


public class music {


    static Clip clip;


    public static HashMap<String, Clip> clips = new HashMap<>();




    public static void sequencer(String input, int numRepeat, float volume) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioStream = null;
        File file = new File(input);

        // Try loading from file first
        if (file.exists()) {
            audioStream = AudioSystem.getAudioInputStream(file);
        } else {
            // Try loading from classpath
            URL resourceURL = frame.class.getResource("/" + input);
            if (resourceURL != null) {
                audioStream = AudioSystem.getAudioInputStream(resourceURL);
            } else {
                System.out.println("Warning: Audio file not found: " + input);
                return;
            }
        }

        if(clip != null && clip.isRunning()) {
            clip.stop();
        }


        clip = AudioSystem.getClip();
        clip.open(audioStream);
        volumeChange(clip, volume);
        clip.start();
        clip.loop(numRepeat);
        clips.put(input, clip);
    }


    public static void playClip(String clipName, int numRepeat) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        sequencer(clipName, numRepeat, volume);


    }

    // Safe method to stop the clip without null pointer exceptions
    public static void stopClip(String clipName) {

        Clip clip = clips.get(clipName);

        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
            clips.remove(clipName);
        }
    }


    public static void stopAllClips() {
        for(Map.Entry<String, Clip> entry : clips.entrySet()) {
            stopClip(entry.getKey());
        }
    }

    public static void volumeChange(Clip clip, float volumeChange) {

        volume = volumeChange; // Increases or decreases the volume by the given value
        if (volume >= 1f) { // Ensures volume is between 0.0 and 1.0
            volume = 1f;
        } else if(volume <= 0f) {
            volume = 0.00001f; // Ensures volume is between 0.0 and 1.0
        }

        System.out.println(volume); // Print the current volume for debugging


        float dB = (float) (Math.log10(volume) * 20); // Convert volume (0.0 to 1.0) to decibels



        for(Clip c : clips.values()) {
            if(c != null && c.isRunning()) {
                FloatControl volumeControl = (FloatControl) c.getControl(FloatControl.Type.MASTER_GAIN); // Get the volume control from the clip
                volumeControl.setValue(dB); // Set the volume of the clip to the new value in decibels
            }
        }
    }




}
