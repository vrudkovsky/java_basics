package com.rudkovsky.family09.dao;

import com.rudkovsky.family09.entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements IFamilyDao {
    private final List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return this.families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return this.families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < 0 || index > this.families.size()) {
            return false;
        } else {
            this.families.remove(index);
            return true;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.contains(family);
    }

    @Override
    public boolean saveFamily(Family family) {
        return families.add(family);

    }

    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                "}";
    }
}
