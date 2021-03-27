package com.rudkovsky.lottery;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberApp {
    private static String name;
    private static int randomNumber;
    private static int nt = 10;
    private static boolean win = true;
    private static final Resize a = new Resize();

    public static void init() {
        System.out.println("Let the game begin!");
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        //random number
        Randomizer random = new Randomizer();
        randomNumber = random.randomizer_0to10();
        System.out.printf("Random number is %d\n", randomNumber);
    }

    public static void guessNumber() {
        System.out.println("Please enter your number");
        Scanner sc = new Scanner(System.in);
        while (win && nt > 0) {
            int userNumber = sc.nextInt();
            a.add(userNumber);

            if (userNumber > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
                System.out.println("Number of tires " + nt);
                nt--;

            } else if (userNumber < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
                System.out.println("Number of tires " + nt);
                nt--;
            } else {
                System.out.printf("Congratulations, %s!\n", name);
                win = false;
            }
        }
        sc.close();
    }

    public static String yourNumbers() {
        return Arrays.toString(a.getA());
    }

    public static String gameOver(String name) {
        return "Game over " + name + "!!!";
    }

    public static void main(String[] args) {
        init();
        guessNumber();
        System.out.printf("Your numbers %s\n", yourNumbers());
        System.out.printf("%s\n", gameOver(name));

    }


}
