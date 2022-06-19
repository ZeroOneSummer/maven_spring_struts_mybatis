package com.aurora.service.impl;

import com.aurora.dao.UserDao;
import com.aurora.entity.UserEntity;
import com.aurora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public List<UserEntity> getUsers() {
		return userDao.getUsers(new UserEntity().setSex("男"));
	}

	@Override
	public int addUser(UserEntity user) {
		return userDao.addUser(user);
	}
}