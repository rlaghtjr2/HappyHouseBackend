package com.ssafy.edu.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dao.AptDao;
import com.ssafy.edu.vue.dto.AptDto;


@Service
public class AptServiceImpl implements AptService {
	
    @Autowired
	private AptDao aptDao;

	@Override
	public List<AptDto> findAptByDong(AptDto apt) {
		// TODO Auto-generated method stub
		return aptDao.findAptByDong(apt);
	}

	@Override
	public List<AptDto> findAptByAptName(AptDto apt) {
		// TODO Auto-generated method stub
		return aptDao.findAptByAptName(apt);
	}

	@Override
	public List<AptDto> findInterestAptById(String id) {
		// TODO Auto-generated method stub
		return aptDao.findInterestAptById(id);
	}

    
	
}
