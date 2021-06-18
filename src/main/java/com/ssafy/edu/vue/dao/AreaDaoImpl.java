package com.ssafy.edu.vue.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.AreaDto;
@Repository
public class AreaDaoImpl implements AreaDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public List<String> findCity() {
		return sqlSession.selectList(ns+"findCity");
	}

	@Override
	public List<String> findGugunByCity(String city) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findGugunByCity",city);
	}

	@Override
	public List<AreaDto> findDongByCityGugun(AreaDto area) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findDongByCityGugun",area);
	}
	
}
