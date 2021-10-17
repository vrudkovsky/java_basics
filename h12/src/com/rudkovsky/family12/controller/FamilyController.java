package com.rudkovsky.family12.controller;

import com.rudkovsky.family12.entity.human.Family;
import com.rudkovsky.family12.entity.human.Human;
import com.rudkovsky.family12.entity.pet.Pet;
import com.rudkovsky.family12.service.FamilyService;

import java.util.ArrayList;
import java.util.List;

public class FamilyController {
    private final FamilyService fs;

    public FamilyController(FamilyService familyService) {
        this.fs = familyService;
    }

//    public List<Family> getAllFamilies(FamilyService familyService) {
//        return this.familyService.getAllFamilies(Family family);
//    }
    public void init() {
        fs.init();
    }

    public void displayAllFamilies() {
        this.fs.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return fs.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan (int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.fs.getFamiliesLessThan(count)) {
            if (family.countFamily() < count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public boolean createNewFamily(Human father, Human mother) {
        return this.fs.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.fs.deleteFamilyByIndex(index);
    }

    public void bornChild(Family family, String fatherName, String motherName) {
        this.fs.bornChild(family, fatherName,motherName);
    }

    public void adoptChild(Family family, Human child) {
        this.fs.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        this.fs.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return this.fs.count();
    }

    public Family getFamilyById(int familyId) {
        return this.fs.getFamilyById(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.fs.getFamilyById(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.fs.getFamilyById(familyIndex).addPet();
    }

    public int countFamiliesWithMemberNumber(Integer membersQty) {
        return (int) fs.countFamiliesWithMemberNumber(membersQty);
    }

    public void deleteAllChildrenOlderThen(Integer childAgeToDelete) {

    }
}
