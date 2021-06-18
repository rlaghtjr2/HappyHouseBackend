package com.ssafy.edu.vue.service;

import java.util.List;

import com.ssafy.edu.vue.dto.CommercialDto;

public interface CommercialService {

	public List<CommercialDto> findCommercialByAddress(CommercialDto commercial);
	
	
}
