/*
* Java Substring Comparisons
* */

package com.company.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] str = new String[s.length() - k + 1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

//      welcometojava
        System.out.println(s.length());
        for (int i = 0; i <= s.length() - k; ++i) {
            str[i] = s.substring(i, k + i);
        }

        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        smallest = str[0];
        largest = str[str.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}