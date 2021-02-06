package com.company.hackerrank;

class Parent {
    Parent() {
        System.out.println("parent constructor");
    }
}

public class StaticInitBlock extends Parent {
    //static runs on first access to the class
    static {
        System.out.println("static init block1");
    }
    //come on instance creating
    {
        System.out.println("init block1");
    }
    {
        System.out.println("init block2");
    }

    StaticInitBlock() {
//        super();
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        new StaticInitBlock();
    }
    {
        System.out.println("init block3");
    }
    static {
        System.out.println("static init block2");
    }
}