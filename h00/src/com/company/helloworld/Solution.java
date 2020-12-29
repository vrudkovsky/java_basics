package com.company.helloworld;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String names =  "Tror Gvigris Deriana Nori";
        fourLetters(names);
    }

    public static void fourLetters(String names) {
        // Write your code here...
        String[] splitted = names.split(" ");
        System.out.println(Arrays.toString(splitted));
    }

    public static void runCode() {
        // Entrypoint to debug your function
    }
}
