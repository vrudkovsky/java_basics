package com.rudkovsky.plusminus;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

public class PlusMinusV3 {
    // Complete the plusMinus function below.

    static double ratio(long n, int total) {
        return (double) n / total;
    }

    static Long filter(int[] a, IntPredicate f) {
        return Arrays.stream(a).filter(f).count();
    }

    static void plusMinus(int[] arr) {
        int len = arr.length;
        double[] ratios = new double[3];

        long gt0 = filter(arr, x -> x > 0);
        long lt0 = filter(arr, x -> x < 0);
        long eq0 = len - gt0 - lt0;

        ratios[0] = ratio(gt0, len);
        ratios[1] = ratio(lt0, len);
        ratios[2] = ratio(eq0, len);

        for (double r : ratios) System.out.printf("%.6f\n", r);
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
