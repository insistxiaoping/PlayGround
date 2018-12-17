package com.td.pm.service.impl;

import com.td.pm.bean.Users;
import com.td.pm.mapper.UsersMapper;
import com.td.pm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper mapper;
    @Override
    public Boolean login(String userId, String userPassword) {
        Users users = mapper.selectByPrimaryKey(userId);
        //≈–∂œ’À∫≈√‹¬Î «∑Ò’˝»∑
        if (users == null || !userPassword.equals(users.getUserPassword()))
            return false;
        else
            return true;
    }

    @Override
    public List<Users> queryAll() {
        return mapper.queryAll();
    }
}
