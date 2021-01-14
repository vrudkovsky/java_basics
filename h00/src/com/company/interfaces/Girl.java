package com.company.interfaces;

public class Girl implements Player, Study{
    String name = "";

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " Start by hand");
    }

    @Override
    public void read() {
        System.out.println(this.getName() + " Im reading a bool");
    }
}
