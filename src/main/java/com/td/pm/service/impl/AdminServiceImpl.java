package com.td.pm.service.impl;

import com.td.pm.bean.Equipments;
import com.td.pm.mapper.EquipmentsMapper;
import com.td.pm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private EquipmentsMapper mapper;
    @Override
    public List<Equipments> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public Boolean save(Equipments equipments) {
       if (mapper.insert(equipments)>0)
           return true;
        return false;
    }

    @Override
    public Boolean deleteByIds(String[] array) {
        if (mapper.deleteByPrimaryKeys(array)>0)
            return true;
        return false;
    }

    @Override
    public Boolean updateEquipments(Equipments equipments) {
       if (mapper.updateByPrimaryKeySelective(equipments)>0)
           return true;
       return false;
    }

    @Override
    public Equipments getEquipById(String id) {
        Equipments equipments = mapper.selectByPrimaryKey(id);
        if (equipments != null)
            return equipments;
        return null;
    }
}
