package com.example.pumpkinquest;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.example.pumpkinquest.frame.volume;


public class music { // Music class for playing music and sound effects


    static Clip clip; // The clip that is currently playing


    public static HashMap<String, Clip> clips = new HashMap<>(); // A hashmap to store all the clips




    public static void sequencer(String input, int numRepeat, float volume) throws UnsupportedAudioFileException, IOException, LineUnavailableException { // Main method for playing music and sound effects
        AudioInputStream audioStream = null; // Audio stream for the music
        File file = new File(input); // File for the music

        // Try loading from file first
        if (file.exists()) { // Checks if the file exists
            audioStream = AudioSystem.getAudioInputStream(file); // Gets the audio stream from the file
        } else {
            // Try loading from classpath
            URL resourceURL = frame.class.getResource("/" + input); // Gets the audio stream from the classpath
            if (resourceURL != null) { // Checks if the audio stream was found
                audioStream = AudioSystem.getAudioInputStream(resourceURL); // Gets the audio stream from the classpath
            } else { // If the audio stream was not found
                System.out.println("Warning: Audio file not found: " + input); // Prints a warning message
                return; // Returns from the method
            }
        }

        if(clip != null) { // Checks if the clip is not null
            if (clip.isRunning()) clip.stop(); // Stops the clip if it is running
            clip.close(); // Closes the clip
        }


        clip = AudioSystem.getClip(); // Gets the clip
        clip.open(audioStream); // Opens the clip
        volumeChange( volume); // Changes the volume
        clip.start(); // Starts the clip
        clip.loop(numRepeat); // Loops the clip

      
        Clip prior = clips.put(input, clip); // Puts the clip in the hashmap
        if (prior != null && prior != clip) { // Checks if the clip is not null and not the same as the previous clip
            prior.close(); // Closes the previous clip
        }
    }


    public static void playClip(String clipName, int numRepeat) throws UnsupportedAudioFileException, LineUnavailableException, IOException { // Main method for playing music and sound effects

        sequencer(clipName, numRepeat, volume); // Calls the sequencer method


    }

    // Safe method to stop the clip without null pointer exceptions
    public static void stopClip(String clipName) { 

        Clip clip = clips.get(clipName); // Gets the clip from the hashmap

        if (clip != null && clip.isRunning()) { // Checks if the clip is not null and not running
            clip.stop(); // Stops the clip
            clip.close(); // Closes the clip
            clips.remove(clipName); // Removes the clip from the hashmap so it doesnt get constantly played
        }
    }


    public static void stopAllClips() { // Main method for stopping all the clips
        for(Map.Entry<String, Clip> entry : clips.entrySet()) { // Loops through all the clips in the hashmap
            stopClip(entry.getKey()); // Stops the clip
        }
    }

    public static void volumeChange(float volumeChange) { // Main method for changing the volume

        volume = volumeChange; // Increases or decreases the volume by the given value
        if (volume >= 1f) { // Ensures volume is between 0.0 and 1.0
            volume = 1f;
        } else if(volume <= 0f) {
            volume = 0.00001f; // Ensures volume is between 0.0 and 1.0
        }

        System.out.println(volume); // Print the current volume for debugging


        float dB = (float) (Math.log10(volume) * 20); // Convert volume (0.0 to 1.0) to decibels



        for(Clip c : clips.values()) { // Loops through all the clips in the hashmap
            if(c != null && c.isRunning()) { // Checks if the clip is not null and not running
                FloatControl volumeControl = (FloatControl) c.getControl(FloatControl.Type.MASTER_GAIN); // Get the volume control from the clip
                volumeControl.setValue(dB); // Set the volume of the clip to the new value in decibels
            }
        }
    }




}
