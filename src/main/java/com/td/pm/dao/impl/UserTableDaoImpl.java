package com.td.pm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.td.pm.bean.UserTable;
import com.td.pm.dao.UserTableDao;
import com.td.pm.mapper.UserTableMapper;

/**
 * @author ping
 * 数据持久层，数据操作
 * @Repository Dao 的是实现类必须要有这个标记
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
