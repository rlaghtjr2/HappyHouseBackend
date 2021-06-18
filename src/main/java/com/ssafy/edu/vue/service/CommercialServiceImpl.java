package com.ssafy.edu.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dao.AptDao;
import com.ssafy.edu.vue.dao.CommercialDao;
import com.ssafy.edu.vue.dto.AptDto;
import com.ssafy.edu.vue.dto.CommercialDto;


@Service
public class CommercialServiceImpl implements CommercialService {
	
    @Autowired
	private CommercialDao commercialDao;

	@Override
	public List<CommercialDto> findCommercialByAddress(CommercialDto commercial) {
		// TODO Auto-generated method stub
		return commercialDao.findCommercialByAddress(commercial);
	}

    
	
}
