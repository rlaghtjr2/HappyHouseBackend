package com.ssafy.edu.vue.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ssafy.edu.vue.dao.InterestDao;
import com.ssafy.edu.vue.dto.InterestDto;


@Service
public class InterestServiceImpl implements InterestService {
	
    @Autowired
	private InterestDao interestDao;

	@Override
	public int addInterest(InterestDto dto) {
		// TODO Auto-generated method stub
		return interestDao.addInterset(dto);
	}

    
	
}
