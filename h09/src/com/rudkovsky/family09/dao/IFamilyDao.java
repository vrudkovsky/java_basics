package com.rudkovsky.family09.dao;

import com.rudkovsky.family09.entity.Family;

import java.util.List;

public interface IFamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    boolean saveFamily(Family family);
}
