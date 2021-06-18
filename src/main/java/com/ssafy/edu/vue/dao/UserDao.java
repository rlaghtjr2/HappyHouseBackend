package com.ssafy.edu.vue.dao;


import java.util.List;

import com.ssafy.edu.vue.dto.FindPWDto;
import com.ssafy.edu.vue.dto.UserDto;

public interface UserDao {
	public int addUser(UserDto user) throws Exception;
	
	public boolean deleteUser(String id) throws Exception;
	
	public boolean updateUser(UserDto user) throws Exception;
	
	public UserDto findUserById(String id) throws Exception;

	public List<UserDto> findAllUser();

	public UserDto findUser(UserDto user);

	public UserDto findUserByIdEmail(UserDto user);

	public boolean updatePassword(FindPWDto findPWDto);
	
}
