package com.ssafy.edu.vue.dao;

import java.util.List;

import com.ssafy.edu.vue.dto.AptDto;
import com.ssafy.edu.vue.dto.CommercialDto;

public interface CommercialDao {

	public List<CommercialDto> findCommercialByAddress(CommercialDto commercial);
	
}
