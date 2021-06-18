package com.ssafy.edu.vue.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.FindPWDto;
import com.ssafy.edu.vue.dto.UserDto;
@Repository
public class UserDaoImpl implements UserDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addUser(UserDto user) throws Exception {
		return sqlSession.insert(ns+"addUser",user);
	}

	@Override
	public boolean deleteUser(String id) throws Exception {
		sqlSession.delete(ns+"deleteUser",id);
		 return true;
	}

	@Override
	public boolean updateUser(UserDto user) throws Exception {
		 sqlSession.update(ns+"updateUser",user);
		 return true;
	}

	@Override
	public UserDto findUserById(String id) throws Exception {
		UserDto user = sqlSession.selectOne(ns+"findUserById", id);
		return user;
	}

	@Override
	public List<UserDto> findAllUser() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findAllUser");
	}

	@Override
	public UserDto findUser(UserDto user) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"findUser",user);
	}

	@Override
	public UserDto findUserByIdEmail(UserDto user) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"findUserByIdEmail",user);
	}

	@Override
	public boolean updatePassword(FindPWDto findPWDto) {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updatePassword",findPWDto);
		return true;
	}
	
}
