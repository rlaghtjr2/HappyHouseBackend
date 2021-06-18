package com.ssafy.edu.vue.service;

import java.util.List;

import com.ssafy.edu.vue.dto.AptDto;

public interface AptService {

	public List<AptDto> findAptByDong(AptDto apt);
	
	public List<AptDto> findAptByAptName(AptDto apt);

	public List<AptDto> findInterestAptById(String id);
	
}
