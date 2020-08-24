package controller;

import entity.Family;
import entity.Human;
import entity.Pet;
import service.FamilyService;

import java.util.ArrayList;
import java.util.List;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

//    public List<Family> getAllFamilies(FamilyService familyService) {
//        return this.familyService.getAllFamilies(Family family);
//    }

    public void displayAllFamilies() {
        this.familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.familyService.getFamiliesBiggerThan(count)) {
            if (family.countFamily() > count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public List<Family> getFamiliesLessThan (int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.familyService.getFamiliesLessThan(count)) {
            if (family.countFamily() < count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public boolean createNewFamily(Human father, Human mother) {
        return this.familyService.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.familyService.deleteFamilyByIndex(index);
    }

    public void bornChild(Family family, String fatherName, String motherName) {
        this.familyService.bornChild(family, fatherName,motherName);
    }

    public void adoptChild(Family family, Human child) {
        this.familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        this.familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return this.familyService.count();
    }

    public  Family getFamilyById(int familyId) {
        return this.familyService.getFamilyById(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.familyService.getFamilyById(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.familyService.getFamilyById(familyIndex).addPet();
    }

}
