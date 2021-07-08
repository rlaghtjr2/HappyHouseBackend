package com.ssafy.edu.vue.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.edu.vue.dto.FindPWDto;
import com.ssafy.edu.vue.dto.UserDto;
import com.ssafy.edu.vue.help.BoolResult;
import com.ssafy.edu.vue.help.NumberResult;
import com.ssafy.edu.vue.service.EmailService;
import com.ssafy.edu.vue.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/user")
@Api(value = "SSAFY", description = "HappyHouse User에 관한 정보")
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailService emailService;

	@ApiOperation(value = " 새로운 유저 정보를 입력한다. 그리고 그 유저의 테이블상 인덱스를 반환한다.", response = NumberResult.class)
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<NumberResult> addUser(@RequestBody UserDto dto) throws Exception {

		int total = userService.addUser(dto);
		NumberResult nr = new NumberResult();
		nr.setCount(total);
		nr.setName("addUser");
		nr.setState("succ");
		if (total <= 0) {
			nr.setCount(-1);
			nr.setName("addUser");
			nr.setState("fail");
			return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
		}
		return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = " 해당유저의 정보를 삭제한다.", response = BoolResult.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<BoolResult> deleteUser(@PathVariable String id) throws Exception {

		boolean total = userService.deleteUser(id);
		BoolResult nr = new BoolResult();
		nr.setCount(total);
		nr.setName("deleteUser");
		nr.setState("succ");
		if (!total) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = " 유저의 정보를 수정한다 ", response = BoolResult.class)
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<BoolResult> updateUser(@RequestBody UserDto dto) throws Exception {
		boolean total = userService.updateUser(dto);
		BoolResult nr = new BoolResult();
		nr.setCount(total);
		nr.setName("updateUser");
		nr.setState("succ");
		if (!total) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = "유저아이디로 유저의 정보를 찾는다.", response = UserDto.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> findUserById(@PathVariable String id) throws Exception {
		UserDto user = userService.findUserById(id);
		if (user == null || user.getId() == "") {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
	
	@ApiOperation(value = "모든 유저정보를 찾는다.", response = UserDto.class)
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity< List<UserDto> > findAllUser() throws Exception {
		
		List<UserDto> users = userService.findAllUser();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<UserDto>>(users, HttpStatus.OK);
	}
	
	@ApiOperation(value = "유저 정보를 찾습니다.", response = UserDto.class)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<UserDto> findUser(UserDto dto) throws Exception {
		
		UserDto user = userService.findUser(dto);
		if (user == null || user.getId() == "") {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
		
	}
	
	@ApiOperation(value = "비밀번호를 찾습니다.", response = UserDto.class)
	@RequestMapping(value = "/password", method = RequestMethod.GET)
	public ResponseEntity<UserDto> findPassword(UserDto dto) throws Exception {
		
		UserDto user = userService.findUserByIdEmail(dto);
		
		if (user == null || user.getId() == "") {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		try {
			FindPWDto findPwdDto = new FindPWDto(user.getId());
			userService.updatePassword(findPwdDto);
			user = userService.findUserById(user.getId());
			emailService.sendMail(user);
		}catch(MailException e) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
}
