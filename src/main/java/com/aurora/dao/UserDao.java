package com.aurora.dao;

import com.aurora.entity.UserEntity;

import java.util.List;

public interface UserDao {
	
	List<UserEntity> getUsers(UserEntity user);

	int addUser(UserEntity user);
}