package com.rudkovsky.family12.service;

import com.rudkovsky.family12.dao.CollectionFamilyDao;
import com.rudkovsky.family12.entity.human.Family;
import com.rudkovsky.family12.entity.human.Human;
import com.rudkovsky.family12.entity.pet.Pet;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    private final CollectionFamilyDao collectionFamilyDao;

    public FamilyService(CollectionFamilyDao collectionFamilyDao) {
        this.collectionFamilyDao = collectionFamilyDao;
    }


    public List<Family> getAllFamilies(CollectionFamilyDao collectionFamilyDao) {
        return this.collectionFamilyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        this.collectionFamilyDao.getAllFamilies().forEach(f-> System.out.println(f.toString()));
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(f->f.countFamily() < count)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan (int count) {
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(f->f.countFamily() > count)
                .collect(Collectors.toList());
        }

    public boolean createNewFamily(Human father, Human mother) {
        return this.collectionFamilyDao.saveFamily(new Family(mother, father));
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.collectionFamilyDao.deleteFamily(index);
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
        return this.collectionFamilyDao.getAllFamilies().size();
    }

    public long countFamiliesWithMemberNumber(int count){
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(f->f.countFamily() == count).count();
    }

    public Family getFamilyById(int familyId) {
        return this.collectionFamilyDao.getFamilyByIndex(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.collectionFamilyDao.getFamilyByIndex(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.collectionFamilyDao.getFamilyByIndex(familyIndex).addPet();
    }



}
