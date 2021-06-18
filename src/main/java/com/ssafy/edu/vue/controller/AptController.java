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

import com.ssafy.edu.vue.dto.AptDto;
import com.ssafy.edu.vue.service.AptService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/apt")
@Api(value = "SSAFY", description = "HappyHouse Apt에 관한 정보")
public class AptController {

	public static final Logger logger = LoggerFactory.getLogger(AptController.class);

	@Autowired
	private AptService aptService;

	@ApiOperation(value = "시,군,동으로 아파트의 정보를 찾는다.", response = AptDto.class)
	@RequestMapping(value = "/{city}/{gugun}/dong/{dong}", method = RequestMethod.GET)
	public ResponseEntity<List<AptDto>> findAptByArea(@PathVariable String city, @PathVariable String gugun,
			@PathVariable String dong) throws Exception {
		AptDto apt = new AptDto();
		apt.setCity(city);
		apt.setGugun(gugun);
		apt.setDong(dong);
		List<AptDto> apts = aptService.findAptByDong(apt);

		if (apts.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AptDto>>(apts, HttpStatus.OK);
	}

	@ApiOperation(value = "시,군,아파트이름으로 아파트의 정보를 찾는다.", response = AptDto.class)
	@RequestMapping(value = "/{city}/{gugun}/aptName/{aptName}", method = RequestMethod.GET)
	public ResponseEntity<List<AptDto>> findAptByAptName(@PathVariable String city, @PathVariable String gugun,
			@PathVariable String aptName) throws Exception {
		AptDto apt = new AptDto();
		apt.setCity(city);
		apt.setGugun(gugun);
		apt.setAptName(aptName);
		List<AptDto> apts = aptService.findAptByAptName(apt);

		if (apts.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AptDto>>(apts, HttpStatus.OK);
	}

	@ApiOperation(value = "아이디로 관심지역들의 아파트의 정보를 찾는다.", response = AptDto.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<AptDto>> findInterestAptById(@PathVariable String id) throws Exception {
		List<AptDto> apts = aptService.findInterestAptById(id);

		if (apts.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AptDto>>(apts, HttpStatus.OK);
	}
}
