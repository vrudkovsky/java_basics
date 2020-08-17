package com.rudkovsky.family06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class MainTest {
    private Human humanChild1;
    private Human humanChild2;
    private Human humanChild3;
    private Human humanChild4;
    public Family family;
    private Human humanTest1 ;


    @BeforeEach
    void setUp() {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        String[][] schedule1 = new String[][] {{String.valueOf(friday), "task"},{String.valueOf(sunday), "task2"}};
        String[][] schedule2 = new String[][] {{String.valueOf(wednesday), "task4"},{String.valueOf(monday), "task5"}};
        Pet pet = new Pet(Species.DOG, "Paddy", 5, 50, new String[]{"eat", "run"});
        humanTest1 = new Human("Homes", "Addams", 1977,80, schedule1);
        Human humanTest2 = new Human("Morticia", "Addams", 1979, 90, schedule2);
        humanChild1 = new Human("Wednesday", "Addams", 1989, 110, schedule2);
        humanChild2 = new Human("Pugsley", "Addams", 1995, 92, schedule2);
        family = new Family(humanTest1, humanTest2, new Human[]{humanChild1, humanChild2, humanChild3}, pet);
    }
    @Test
    public void testToString() {
        String expected = "Addams";
        assertEquals(expected, humanTest1.getSurname());
    }
    @Test
    public void addChild(){
        family.addChild(humanChild3);
        assertEquals(6, family.countFamily());
    }
    @Test
    public void  countFamily(){
        assertEquals(4, family.countFamily());
    }
    @Test
    void deleteChildByIndex() {
        family.deleteChild(0);
        assertNotNull(humanChild1);
        assertEquals(2, family.countFamily());
    }
    @Test
    void deleteChildByEquals() {
        family.deleteChild(humanChild2);
        assertNotNull(humanChild2);
        assertEquals(4, family.countFamily());
    }
}