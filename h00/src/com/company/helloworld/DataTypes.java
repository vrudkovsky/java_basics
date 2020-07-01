package com.company.helloworld;

public class DataTypes {
    public static void main(String[] args) {
        // byte, short, int, long
        // char
        // boolean
        // float, double
        // null
        // BigInteger, BigDecimal

        // byte - (-128 - +127)

         int b = 2147483647;
         System.out.println(b++);
         System.out.println(b++);
         System.out.println(b++);
         System.out.println(b++);

//        short s = b;
//        s += 1000;
//        int i = s;
//        long l = b;

//        System.out.println("short " + s);

        int intCastToShort = 40000;
        short castedShort = (short) intCastToShort;

        System.out.println(" ");
        System.out.println("int " + intCastToShort);
        System.out.println("short " + castedShort);

        System.out.println("                " + Integer.toBinaryString(intCastToShort));
        System.out.println(Integer.toBinaryString(castedShort));

        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(7));


        int empty = 0;

        System.out.println(empty);

        float f = 1;
        double d = 2;

        System.out.println(f);
        System.out.println(d);

        var x = 10;
//        x = "String";

        String str = null;

        f = 112.9f;

        int shortenedFloat = (int) f;

        System.out.println(shortenedFloat);

        int division = 10 / 3;
        int remainder = 10 % 3;

        System.out.println(division);
        System.out.println(remainder);
    }
}
