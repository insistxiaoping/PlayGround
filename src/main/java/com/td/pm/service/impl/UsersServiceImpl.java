package com.td.pm.service.impl;

import com.td.pm.bean.ApplyEquip;
import com.td.pm.bean.Users;
import com.td.pm.mapper.EquipmentsMapper;
import com.td.pm.mapper.UsersMapper;
import com.td.pm.mapper.ApplyEquipMapper;
import com.td.pm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private ApplyEquipMapper applyEquipMapper;
    @Override
    public Boolean login(String userId, String userPassword,String isAdmin) {
        Users users =null;
        if (isAdmin ==null){
            users = usersMapper.selectByPrimaryKey(userId);
            //≈–∂œ’À∫≈√‹¬Î «∑Ò’˝»∑
            if (users == null || !userPassword.equals(users.getUserPassword()))
                return false;
        }else{
            if (usersMapper.selectAdminByPrimaryKey(userId,userPassword)<0)
                return false;
        }
        return true;
    }
    @Override
    public Boolean saveUser(Users users) {
        int count = usersMapper.insert(users);
        if (count>0)
            return true;
        return false;
    }
    @Override
    public List<Users> queryAll() {
        return usersMapper.queryAll();
    }
    @Override
    public   Boolean saveApplyEquip(ApplyEquip apply){
        int count = applyEquipMapper.insert(apply);
        if (count>0)
            return true;
        return false;
    }

    @Override
    public List<ApplyEquip> queryByUserId(String applyUserId) {
        return applyEquipMapper.queryByUserId(applyUserId);
    }

}
