package com.rudkovsky.plusminus;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

public class PlusMinusV2 {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        long[] counters = {0, 0, 0};
        int len = arr.length;

        counters[0] = Arrays.stream(arr).filter(x -> x > 0).count();
        counters[1] = Arrays.stream(arr).filter(x -> x < 0).count();
        counters[0] = len - counters[0] - counters[1];

        for (long counter: counters) {
            double r = (double)counter / arr.length;
            System.out.printf("%.6f\n", r);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

