package com.rudkovsky.family08;

import java.util.HashSet;
import java.util.Set;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    public Set<String> habits = new HashSet<>();

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return 	"{"
                + "nickname = " + this.nickname + "; "
                + "age = " + this.age + "; "
                + "trickLevel = " + trickLevel + "; \n"
                + "\thabits = " + habits
                + "}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet:{"
                        + "nickname = " + this.nickname + ", "
                        + "age = " + this.age + ", "
                        + "trickLevel = " + trickLevel + ", \n"
                        + "\thabits = " + habits
                        + "}"+ "destroyed" + '\n');
    }
}
