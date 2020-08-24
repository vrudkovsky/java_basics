package com.rudkovsky.family10.dao;

import com.rudkovsky.family10.entity.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    boolean saveFamily(Family family);
}
