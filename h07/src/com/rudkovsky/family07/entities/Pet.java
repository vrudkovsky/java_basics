package com.rudkovsky.family07.entities;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return 	" {"
                + "nickname = " + this.nickname + ", "
                + "age = " + this.age + ", "
                + "trickLevel = " + trickLevel + ", \n"
                + "\thabits = " + Arrays.toString(habits)
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                nickname.equals(pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" {"
                + "nickname = " + this.nickname + ", "
                + "age = " + this.age + ", "
                + "trickLevel = " + trickLevel + ", \n"
                + "\thabits = " + Arrays.toString(habits)
                + "}");
    }
}
