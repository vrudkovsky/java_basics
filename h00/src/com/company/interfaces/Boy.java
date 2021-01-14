package com.company.interfaces;

public class Boy implements Player, Study {
    private String name = "";

    public Boy(String name) {
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
        System.out.println(this.getName() + " Start by leg");
    }

    @Override
    public void read() {
        System.out.println(this.getName() + " Read a book");
    }
}
