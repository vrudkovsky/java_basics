package com.company.hackerrank;
import java.io.*;
import java.util.*;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for (int i = 1; sc.hasNext() == true; i++) {
            System.out.println(i + " " + sc.nextLine());
        }
    }
}
