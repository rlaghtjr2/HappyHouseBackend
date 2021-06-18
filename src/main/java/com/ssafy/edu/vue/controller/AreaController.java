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

import com.ssafy.edu.vue.dto.AreaDto;
import com.ssafy.edu.vue.service.AreaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/area")
@Api(value = "SSAFY", description = "HappyHouse 지역에 관한 정보")
public class AreaController {

	public static final Logger logger = LoggerFactory.getLogger(AreaController.class);

	@Autowired
	private AreaService areaService;

	@ApiOperation(value = "시의 정보를 찾는다.", response = String.class)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<String>> findCity() throws Exception {
		List<String> citys = areaService.findCity();
		if (citys.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(citys, HttpStatus.OK);
	}

	@ApiOperation(value = "시의 정보로 구/군의 정보를 찾는다.", response = String.class)
	@RequestMapping(value = "/{city}", method = RequestMethod.GET)
	public ResponseEntity<List<String>> findGugunByCity(@PathVariable String city) throws Exception {
		List<String> guguns = areaService.findGugunByCity(city);
		if (guguns.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(guguns, HttpStatus.OK);
	}

	@ApiOperation(value = "시와 구/군 정보로 동의 정보를 찾는다.", response = String.class)
	@RequestMapping(value = "/{city}/{gugun}", method = RequestMethod.GET)
	public ResponseEntity<List<AreaDto>> findDongByCityGugun(@PathVariable String city, @PathVariable String gugun)
			throws Exception {
		AreaDto area = new AreaDto();
		area.setCity(city);
		area.setGugun(gugun);

		List<AreaDto> areas = areaService.findDongByCityGugun(area);
		if (areas.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<AreaDto>>(areas, HttpStatus.OK);
	}
}
