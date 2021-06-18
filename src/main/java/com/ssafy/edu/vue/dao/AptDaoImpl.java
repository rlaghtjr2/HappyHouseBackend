package com.ssafy.edu.vue.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.AptDto;
@Repository
public class AptDaoImpl implements AptDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<AptDto> findAptByDong(AptDto apt) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findAptByDong",apt);
	}

	@Override
	public List<AptDto> findAptByAptName(AptDto apt) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findAptByAptName",apt);
	}

	@Override
	public List<AptDto> findInterestAptById(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findInterestAptById",id);
	}

	
	
}
