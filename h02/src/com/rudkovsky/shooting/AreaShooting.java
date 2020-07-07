package com.rudkovsky.shooting;

public class AreaShooting {
    public static void main(String[] args) {

        char [][] shArea = new char[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0) {
                    System.out.print(j);
                    System.out.print(" | ");
                } else if (j == 0) {
                    System.out.print(i);
                    System.out.print(shArea[i][j] + " | ");
                }
                else {
                    shArea[i][j] = '-';
                    System.out.print(shArea[i][j] + " | ");
                }

                if (j == 5) {
                    System.out.print("\n");
                }
            }
        }
    }
}
