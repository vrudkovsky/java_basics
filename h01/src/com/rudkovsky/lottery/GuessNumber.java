package com.rudkovsky.lottery;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        boolean exit = true;
        String playerName;

        System.out.println("Let the game begin");

        do {

            // Define random number form 0 to 100
            Random random = new Random();
            int number = random.nextInt(100);

            //Input player name
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            playerName = scanner.nextLine();

            //Input player number
            System.out.println("Enter number: ");
            int playerNumber = scanner.nextInt();

            //Condition statement of guessing number
            if (playerNumber < number ) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (playerNumber > number) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations " + playerName + "!");
            }

            // Answer about exit of the game
            System.out.println("Do you want to continue? Press Y/N");
            char answer = scanner.next().charAt(0);

            if (answer == 'N' || answer == 'n') {
                exit = false;
            }

         } while (exit);

        System.out.println("Goodbay " + playerName + "!");

    }
}
