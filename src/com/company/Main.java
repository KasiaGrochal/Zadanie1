package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);

        System.out.println("Please guess the number from the range 0-99. You have 5 attempts!");
        Scanner number = new Scanner(System.in);
        int yourGuess = number.nextInt();

        for (int i = 1; i <= 5; i++) {
            if ((i == 5) && (yourGuess != randomNumber)) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + randomNumber);
            } else if (yourGuess == randomNumber) {
                System.out.println("You guessed it!");
                break;
            } else if (yourGuess > randomNumber) {
                printHint(i, "GREATER");
                yourGuess = number.nextInt();
            } else {
                printHint(i, "LOWER");
                yourGuess = number.nextInt();
            }
        }
    }

    public static void printHint(int i, String hint) {
        System.out.println("Your number is " + hint + " than the one you are trying to guess");
        System.out.println("You have " + (5 - i) + " attempts left! Please try again");
    }

}


