package com.td.pm.service;

import com.td.pm.bean.ApplyEquip;
import com.td.pm.bean.Users;

import java.util.List;

public interface UsersService {
    Boolean login(String userId,String userPassword,String isAdmin);
    List<Users> queryAll();
    Boolean saveUser(Users users);
    Boolean saveApplyEquip(ApplyEquip apply);
}
