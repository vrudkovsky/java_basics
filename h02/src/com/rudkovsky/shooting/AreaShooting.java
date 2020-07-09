package com.rudkovsky.shooting;

import java.util.Arrays;

public class AreaShooting {
    public static void main(String[] args) {
        //create array for shooting area
        char [][] shootArea = new char [6][6];
        // Fill each row with 0
        for (char[] row : shootArea)
            Arrays.fill(row, '-');

        shootArea[3][3] = 'x';
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
//
