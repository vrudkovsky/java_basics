package com.company.helloworld;

import java.util.Arrays;

public class SplitArrays {
    public static void main(String[] args) {
        // Generate an array of 20 numbers
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        System.out.println("Random number is " + Arrays.toString(numbers));

        // split it into two new arrays:
        // with positive and negative numbers

        int[] posNumArr = new int[1];
        int[] negNumArr = new int[1];

        System.out.println(Arrays.toString(posNumArr));
        System.out.println(Arrays.toString(negNumArr));

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < 0) {
                negNumArr[i] = numbers[i];
                negNumArr = Arrays.copyOf(negNumArr, negNumArr.length + 1);
                System.out.println(Arrays.toString(negNumArr));
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= 0) {
                posNumArr[i] = numbers[i];
                posNumArr = Arrays.copyOf(posNumArr, posNumArr.length + 1);
                System.out.println(Arrays.toString(posNumArr));
            }
        }

//        System.out.println("Positive numbers: " + posNumCount);
//        System.out.println("Negative numbers: " + negNumCount);

        // Вывести их на экран
    }
}
