package com.td.pm.service;

import com.td.pm.bean.Users;

import java.util.List;

public interface UsersService {
    Boolean login(String userId,String userPassword);
    List<Users> queryAll();
}
