package com.company.hackerrank.strings;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

//        String temp = A.replaceAll("\\s+", "").toLowerCase();
//        boolean b = IntStream.range(0, temp.length() / 2)
//                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
//        System.out.println(b ? "Yes" : "No");

        System.out.println( A.equals( new StringBuilder(A).reverse().toString())
                ? "Yes" : "No" );

    }
}
