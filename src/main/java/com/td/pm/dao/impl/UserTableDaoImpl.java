package com.td.pm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.td.pm.bean.UserTable;
import com.td.pm.dao.UserTableDao;
import com.td.pm.mapper.UserTableMapper;

/**
 * @author ping
 * ���ݳ־ò㣬���ݲ���
 * @Repository Dao ����ʵ�������Ҫ��������
 */
@Repository
public class UserTableDaoImpl implements UserTableDao{
	
	@Resource
	private UserTableMapper userTableMapper;

	public UserTable getUserById(Integer id) {
		UserTable userTable = userTableMapper.selectByPrimaryKey(id);
		return userTable;
	}

}
