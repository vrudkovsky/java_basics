package com.rudkovsky.family12.service;

import com.rudkovsky.family08.DayOfWeek;
import com.rudkovsky.family12.dao.CollectionFamilyDao;
import com.rudkovsky.family12.entity.enums.Species;
import com.rudkovsky.family12.entity.human.Family;
import com.rudkovsky.family12.entity.human.Human;
import com.rudkovsky.family12.entity.pet.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FamilyService {
    private final CollectionFamilyDao cfd;

    public FamilyService(CollectionFamilyDao collectionFamilyDao) {
        this.cfd = collectionFamilyDao;
    }

    public void init() {

        //Days of the week
        DayOfWeek sanday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek thuesday = DayOfWeek.TUESDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        DayOfWeek thursday = DayOfWeek.THURSDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;

        //Pet
        Pet dog = new Pet(Species.DOG, "Max") {
            @Override
            public void respond() {

            }
        };

        Map<String, String[]> fs = new HashMap<>() {{
            put(sanday.name(), new String[]{"get to work", "go home"});
            put(monday.name(), new String[]{"get to work", "go home"});
            put(thuesday.name(), new String[]{"get to work", "go home"});
            put(wednesday.name(), new String[]{"get to work", "go home"});
            put(thursday.name(), new String[]{"get to work", "go home"});
            put(friday.name(), new String[]{"get to work", "go home"});
            put(saturday.name(), new String[]{"get to work", "go home"});
        }};

        Map<String, String[]> ms = new HashMap<>() {{
            put(sanday.name(), new String[]{"cleaning", "walking"});
            put(monday.name(), new String[]{"cleaning", "walking"});
            put(thuesday.name(), new String[]{"cleaning", "walking"});
            put(wednesday.name(), new String[]{"cleaning", "walking"});
            put(thursday.name(), new String[]{"cleaning", "walking"});
            put(friday.name(), new String[]{"cleaning", "walking"});
            put(saturday.name(), new String[]{"cleaning", "walking"});
        }};

        Human father = new Human("Bob", "Simpson", 20101979, 125, dog, fs);
        Human mother = new Human("Marta", "Simpson", 20101986, 125, dog, ms);

        createNewFamily(father,mother);


    }


    public List<Family> getAllFamilies(CollectionFamilyDao collectionFamilyDao) {
        return this.cfd.getAllFamilies();
    }

    public void displayAllFamilies() {
        this.cfd.getAllFamilies().forEach(f-> System.out.println(f.toString()));
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return this.cfd.getAllFamilies().stream()
                .filter(f->f.countFamily() > count)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan (int count) {
        return this.cfd.getAllFamilies().stream()
                .filter(f->f.countFamily() < count)
                .collect(Collectors.toList());
        }

    public boolean createNewFamily(Human father, Human mother) {
        return this.cfd.saveFamily(new Family(mother, father));
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.cfd.deleteFamily(index);
    }

    public Family bornChild(Family family, String fatherName, String motherName) {
        return new Family();
    }

    public Family adoptChild(Family family, Human child) {

        return new Family();
    }

    public void deleteAllChildrenOlderThan(int age) {

    }

    public int count() {
        return this.cfd.getAllFamilies().size();
    }

    public long countFamiliesWithMemberNumber(int count){
        return this.cfd.getAllFamilies().stream()
                .filter(f->f.countFamily() == count).count();
    }

    public Family getFamilyById(int familyId) {
        return this.cfd.getFamilyByIndex(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.cfd.getFamilyByIndex(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.cfd.getFamilyByIndex(familyIndex).addPet();
    }



}
