package com.ssafy.edu.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.edu.vue.dto.CommercialDto;
import com.ssafy.edu.vue.service.CommercialService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/commercial")
@Api(value = "SSAFY", description = "주변상가에 관한 정보")
public class CommercialController {

	public static final Logger logger = LoggerFactory.getLogger(CommercialController.class);

	@Autowired
	private CommercialService commercialService;

	@ApiOperation(value = "시,군,동으로 주변상가의 정보를 찾는다.", response = CommercialDto.class)
	@RequestMapping(value = "/{city}/{gugun}/{dong}", method = RequestMethod.GET)
	public ResponseEntity<List<CommercialDto>> findAptByArea(@PathVariable String city, @PathVariable String gugun,
			@PathVariable String dong) throws Exception {
		CommercialDto commercial = new CommercialDto();
		commercial.setCity(city);
		commercial.setGugun(gugun);
		commercial.setDong(dong);
		List<CommercialDto> commercials = commercialService.findCommercialByAddress(commercial);

		if (commercials.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CommercialDto>>(commercials, HttpStatus.OK);
	}

}
