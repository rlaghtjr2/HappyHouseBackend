package com.ssafy.edu.vue.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.InterestDto;
@Repository
public class InterestDaoImpl implements InterestDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addInterset(InterestDto dto) {
		// TODO Auto-generated method stub
		return sqlSession.insert(ns+"addInterest",dto);
	}

	
	
}
