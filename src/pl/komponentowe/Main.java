package pl.komponentowe;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Authors: ");
        System.out.println("Kacper Swiercz 224443");
        System.out.println("Patryk Kolanek 224333");

        System.out.println("1. Record voice");
        System.out.println("2. Play recording");
        choice = in.nextInt();

        if (1 == choice) {

        } else if (2 == choice) {
            File file = new File("record.wav");

            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
