package com.company.solutions;

public class Cow extends Animal {

    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }

    public void mu() {
        System.out.println(getSay() + " in all " + getTeeth() + " teeth" );
    }
}
