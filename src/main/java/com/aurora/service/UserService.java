package com.aurora.service;

import com.aurora.entity.UserEntity;

import java.util.List;

public interface UserService {
	
	List<UserEntity> getUsers();

	int addUser(UserEntity user);
}