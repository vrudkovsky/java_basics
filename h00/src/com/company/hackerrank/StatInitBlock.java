package com.company.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StatInitBlock {

    static boolean flag = true;
    static int B, H;

    static {
        try{
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

//https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful


