package com.ssafy.edu.vue.dao;

import java.util.List;

import com.ssafy.edu.vue.dto.AptDto;

public interface AptDao {

	public List<AptDto> findAptByDong(AptDto apt);

	public List<AptDto> findAptByAptName(AptDto apt);

	public List<AptDto> findInterestAptById(String id);
	
}
