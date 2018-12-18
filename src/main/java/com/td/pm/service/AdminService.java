package com.td.pm.service;

import com.td.pm.bean.Equipments;

import java.util.List;

public interface AdminService {
    List<Equipments> queryAll();
    Boolean save(Equipments equipments);
    Boolean deleteByIds(List<String> list);
    Boolean updateEquipments(Equipments equipments);
    Equipments getEquipById(String id);
}
