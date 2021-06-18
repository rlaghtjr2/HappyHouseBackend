package com.ssafy.edu.vue.dao;

import java.util.List;

import com.ssafy.edu.vue.dto.AreaDto;
public interface AreaDao {
	public List<String> findCity();

	public List<String> findGugunByCity(String city);

	public List<AreaDto> findDongByCityGugun(AreaDto area);
	
}
