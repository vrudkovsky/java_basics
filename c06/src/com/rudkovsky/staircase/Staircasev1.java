package com.rudkovsky.staircase;

import java.util.Scanner;

public class Staircasev1 {
    private static void print(char c) {
        System.out.printf("%c", c);
    }

    private static char symbol(int row, int col, int n) {
        return col < n - row - 1 ? ' ' : '#';
    }

    // Complete the staircase function below.
    private static void staircase(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                print(symbol(row, col, n));
            }
            print('\n');
        }
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        sc.close();
    }
}

