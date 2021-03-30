package com.rudkovsky.shooting;

import java.util.Arrays;
import java.util.Scanner;


public class Battleship {
    public static void main(String[] args) {
        boolean exit = true;

        //create array for shooting area
        char[][] shootArea = new char[6][6];

        // Fill each row with 0
        for (char[] row : shootArea)
            Arrays.fill(row, '-');

        Scanner scanner = new Scanner(System.in);

        do {
            char shootingGoal = shootArea[2][3];
            int shootingX = 0;
            int shootingY = 0;
            boolean inputValidX = false;
            boolean inputValidY = false;

            System.out.println("Enter colomn -->");
            while (!inputValidX) {
                try {
                    shootingX  = Integer.parseInt(scanner.next());
                    if (shootingX < 6 && shootingX > 0) {
                        inputValidX = true;
                    } else {
                        System.out.println("Enter number for 1 to 5");
                    }
                } catch (Exception e) {
                    System.out.println("This is not a number. Enter value again");
                }
            }

            System.out.println("Enter row -->");
            while (!inputValidY) {
                try {
                    shootingY  = Integer.parseInt(scanner.next());
                if (shootingY < 6 && shootingY > 0) {
                    inputValidY = true;
                } else {
                    System.out.println("Enter number for 1 to 5");
                }
                } catch (Exception e) {
                    System.out.println("This is not a number. Enter value again");
                }
            }

            System.out.println("");
            if (shootArea[shootingY][shootingX] == shootingGoal){
                shootArea[shootingY][shootingX] = 'X';
                System.out.println("You have won!");
            } else {
                shootArea[shootingY][shootingX] = '*';
            }

            //Rendering shooting area to the standart output
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0) {
                        System.out.print(j);
                        System.out.print(" | ");
                    } else if (j == 0) {
                        System.out.print(i);
                        System.out.print(" | ");
                    } else if (j > 0) {
                        System.out.print(shootArea[i][j]);
                        System.out.print(" | ");
                    }
                    if (j == 5) {
                        System.out.print("\n");
                    }
                }
            }

            System.out.println("");
            System.out.println("Do you want to continue? Press y/n");
            char answer = scanner.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                exit = false;
            }

        } while (exit);
    }
}
