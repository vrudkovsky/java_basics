package com.rudkovsky.lottery;

import org.assertj.core.util.Strings;
import java.util.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Stream;

public class GuessNumber {
    private static String name;
    private static int randomNumber;
    private static boolean win = true;
    private static int numberOfTires = 10;
    private static final int[] numbers = new int[10];
    private static StringBuilder sb = new StringBuilder();

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
//                numbers[numberOfTires] = userNumber;
                sb.append(userNumber + " ");
                System.out.println("Your number is too big. Please, try again.");
                System.out.println("Number of tires " + numberOfTires);

            } else if (userNumber < rNumber) {
                numberOfTires--;
//                numbers[numberOfTires] = userNumber;
                sb.append(userNumber + " ");
                System.out.println("Your number is too small. Please, try again.");
                System.out.println("Number of tires " + numberOfTires);
            } else {
                System.out.printf("Congratulations, %s!\n", name);
                win = false;
            }
        }
    }

    public static void yourNumbers() {
        String[] arr = sb.toString().split(" ");
        System.out.println("You have entered the numbers: ");
        System.out.println(Arrays.toString(convertStringIntoIntArray(arr)));

    }

    public static Integer[] convertStringIntoIntArray(String[] strings) {
        Integer[] intarray = new Integer[strings.length];
        int i=0;
        for(String str:strings){
            intarray[i]=Integer.parseInt(str.trim());
            i++;
        }
        Arrays.sort(intarray,  Collections.reverseOrder());
        return intarray;
    }

    public static void end() {
        System.out.println("Game over!\n");
    }


}
