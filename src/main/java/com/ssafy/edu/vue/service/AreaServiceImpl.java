package com.ssafy.edu.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dao.AreaDao;
import com.ssafy.edu.vue.dto.AreaDto;


@Service
public class AreaServiceImpl implements AreaService {
	
    @Autowired
	private AreaDao areaDao;

	@Override
	public List<String> findCity() {
		// TODO Auto-generated method stub
		return areaDao.findCity();
	}

	@Override
	public List<String> findGugunByCity(String city) {
		// TODO Auto-generated method stub
		return areaDao.findGugunByCity(city);
	}

	@Override
	public List<AreaDto> findDongByCityGugun(AreaDto area) {
		// TODO Auto-generated method stub
		return areaDao.findDongByCityGugun(area);
	}
    
    
	
}
