package pl.komponentowe;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Authors: ");
        System.out.println("Kacper Swiercz 224443");
        System.out.println("Patryk Kolanek 224333");

        System.out.println("1. Record voice");
        System.out.println("2. Play recording");

        if (1 == in.nextInt()) {
            AudioFormat audioFormat = new AudioFormat(8000, 8, 1, true, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);

            Thread thread = new Thread(() -> {
                TargetDataLine targetDataLine = null;
                AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
                File audioFile = new File("record.wav");

                try {
                    targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
                    targetDataLine.open(audioFormat);
                    targetDataLine.start();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
                while (true) {
                    try {
                        assert targetDataLine != null;
                        AudioSystem.write(new AudioInputStream(targetDataLine), fileType, audioFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            });

            thread.start();

        } else if (2 == in.nextInt()) {

        }
    }
}
