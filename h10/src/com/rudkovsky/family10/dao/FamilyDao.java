package com.rudkovsky.family10.dao;

import com.rudkovsky.family10.entity.Family;

import java.util.List;

public interface FamilyDao {
    List<com.rudkovsky.family10.entity.Family> getAllFamilies();
    com.rudkovsky.family10.entity.Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(com.rudkovsky.family10.entity.Family family);
    boolean saveFamily(Family family);
}
