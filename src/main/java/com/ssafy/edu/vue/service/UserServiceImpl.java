package com.ssafy.edu.vue.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dao.UserDao;
import com.ssafy.edu.vue.dto.FindPWDto;
import com.ssafy.edu.vue.dto.UserDto;


@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
	private UserDao userDao;

	@Override
	public int addUser(UserDto user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean deleteUser(String id) throws Exception {
		userDao.deleteUser(id);
		return true;
	}

	@Override
	public boolean updateUser(UserDto user) throws Exception {
		userDao.updateUser(user);
		return true;
	}

	@Override
	public UserDto findUserById(String id) throws Exception {
		UserDto user = userDao.findUserById(id);
		return user;
	}

	@Override
	public List<UserDto> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	@Override
	public UserDto findUser(UserDto user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUser(user);
	}

	@Override
	public UserDto findUserByIdEmail(UserDto user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserByIdEmail(user);
	}

	@Override
	public boolean updatePassword(FindPWDto findPWDto) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updatePassword(findPWDto);
	}
    
    
	
}
