package com.ssafy.edu.vue.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.AptDto;
import com.ssafy.edu.vue.dto.CommercialDto;
import com.ssafy.edu.vue.util.CommercialCSV;
@Repository
public class CommercialDaoImpl implements CommercialDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public List<CommercialDto> findCommercialByAddress(CommercialDto commercial) {
		String code = sqlSession.selectOne(ns+"findCodeByAddress",commercial);
		return CommercialCSV.getCommInfo(code);
	}

	
	
}
