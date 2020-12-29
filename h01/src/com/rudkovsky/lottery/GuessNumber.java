package com.rudkovsky.lottery;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private static String name;
    private static int randomNumber;
    private static boolean win = true;
    private static int numberOfTires = 10;
    private static final int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        guessNumber(randomNumber);
        yourNumbers();
        end();
    }

    public static void init() {
        System.out.println("Let the game begin!");
        System.out.println(" Please enter your name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello " + name + "!!!");
        //random number
        Random random = new Random();
        randomNumber = random.nextInt(100);
        System.out.println("Random number is " + randomNumber);
    }


    public static void guessNumber(int rNumber) {
        System.out.println("Enter number to guess:");
        while (win && numberOfTires != 0) {
            Scanner sc = new Scanner(System.in);
            int userNumber = sc.nextInt();

            if (userNumber > rNumber) {
                numberOfTires--;
                numbers[numberOfTires] = userNumber;
                System.out.println("Your number is too big. Please, try again.");
                System.out.println("Number of tires " + numberOfTires);

            } else if (userNumber < rNumber) {
                numberOfTires--;
                numbers[numberOfTires] = userNumber;
                System.out.println("Your number is too small. Please, try again.");
                System.out.println("Number of tires " + numberOfTires);
            } else {
                System.out.printf("Congratulations, %s!", name);
                win = false;
            }
        }
    }

    public static void yourNumbers() {
        Arrays.sort(numbers);
        System.out.println("Your numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println('\n');
    }

    public static void end() {
        System.out.println("Game over!\n");
    }
}
