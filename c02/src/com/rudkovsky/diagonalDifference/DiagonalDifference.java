package com.rudkovsky.diagonalDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */



public class DiagonalDifference {

//    public static int[][] convert(List<List<Integer>> a) {
//        int size = a.size();
//        int[][] res = new int[size][size];
//        IntStream.range(0, size).forEach(y ->
//                IntStream.range(0, size).forEach(x ->
//                        res[y][x] = a.get(y).get(x)));
//        return res;
//    }

//    public static int diagonalDifference(List<List<Integer>> arr) {
//
//        int resilt = 0;
//        int[][] a = convert(arr);
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i == j || j - a[i].length - 1 == j) {
//                    System.out.println(a[i][j]);
//                }
//            }
//        }
//
//    }


    public static int diagonalDifferencev2(int[][] a) {
        int d1 = 0;
        int d2 = 0;
        int size = a.length;


        for (int i = 0; i < size; i++) {
            d1 = d1 + a[i][i];
        }

        for (int i = 0; i < size; i++) {
            int i_inv = size - i - 1;
            d2 = d2 + a[i][i_inv];
        }

        return Math.abs(d1 - d2);

    }

    public static <K> void iterateUsingForEach(List<List<K> > listOfLists)
    {

        // Iterate the 2D list
        // and print each element
        System.out.println("[");

        for (List<K> list : listOfLists) {
            System.out.print("  [");

            for (K item : list) {
                System.out.print("  "
                        + item
                        + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        int[][] a = new int[][] {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> i1 = new ArrayList<>();
        ArrayList<Integer> i2 = new ArrayList<>();
        ArrayList<Integer> i3 = new ArrayList<>();
        i1.add(1);
        i1.add(2);
        i1.add(3);
        i2.add(4);
        i2.add(5);
        i2.add(6);
        i3.add(7);
        i3.add(8);
        i3.add(9);
        arr.add(i1);
        arr.add(i2);
        arr.add(i3);
        iterateUsingForEach(arr);
        System.out.println();

        System.out.println(diagonalDifferencev2(a));
    }

}

