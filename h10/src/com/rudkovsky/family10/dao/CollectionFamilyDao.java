package com.rudkovsky.family10.dao;

import com.rudkovsky.family10.entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private final List<Family> families = new ArrayList<>();


    @Override
    public List<Family> getAllFamilies() {
        return this.families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return this.families.get(index);
    }

    // Not sure about this implementation !!!!
    @Override
    public boolean deleteFamily(int index) {
        if (index < 0 || index > this.families.size()) {
            return false;
        } else {
            families.remove(index);
            return true;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            return true;
        }
        return false;
    }

    @Override
    public boolean saveFamily(Family family) {
        // update current DB
        return true;
    }

    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                '}';
    }
}
