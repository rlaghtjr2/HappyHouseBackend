package com.ssafy.edu.vue.service;

import java.util.List;

import com.ssafy.edu.vue.dto.AreaDto;

public interface AreaService {

	public List<String> findCity();

	public List<String> findGugunByCity(String city);

	public List<AreaDto> findDongByCityGugun(AreaDto area);
	
}
