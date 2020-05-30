package pl.komponentowe;

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

        } else if (2 == in.nextInt()) {

        }
    }
}
