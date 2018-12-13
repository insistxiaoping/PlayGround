package com.td.pm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.td.pm.bean.UserTable;
import com.td.pm.dao.UserTableDao;
import com.td.pm.service.UserTableService;

/**
 * @author ping
 * ҵ��㣬
 * @Service ��ʵ�����������Ǳ�Ҫ��
 */
@Service
public class UserTableServiceImpl implements UserTableService{
	
	@Autowired
	private UserTableDao userDao;

	public UserTable getUserById(Integer id) {
		UserTable userTable = userDao.getUserById(id);
		return userTable;
	}

}
