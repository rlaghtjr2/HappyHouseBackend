package com.ssafy.edu.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.edu.vue.dto.AptDto;
import com.ssafy.edu.vue.dto.InterestDto;
import com.ssafy.edu.vue.help.NumberResult;
import com.ssafy.edu.vue.service.InterestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/interest")
@Api(value = "SSAFY", description = "HappyHouse 관심지역에 관한 정보")
public class InterestController {

	public static final Logger logger = LoggerFactory.getLogger(InterestController.class);

	@Autowired
	private InterestService interestService;

	@ApiOperation(value = " 새로운 관심지역 정보를 입력한다. 그리고 그 입력한 정보의 테이블상 인덱스를 반환한다.", response = NumberResult.class)
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<NumberResult> addUser(@RequestBody InterestDto dto) throws Exception {

		int total = interestService.addInterest(dto);
		NumberResult nr = new NumberResult();
		nr.setCount(total);
		nr.setName("addInterest");
		nr.setState("succ");
		if (total <= 0) {
			nr.setCount(-1);
			nr.setName("addInterest");
			nr.setState("fail");
			// return new ResponseEntity(HttpStatus.NO_CONTENT);
			return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
		}
		return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
	}
}
