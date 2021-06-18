package com.ssafy.edu.vue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dto.UserDto;

@Service
public class EmailService {
	
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendMail(UserDto user) throws MailException{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
	    message.setFrom("HappyHouse");
		message.setSubject("[HappyHouse] 비밀번호 찾기입니다");
		message.setText("임시 비밀번호는 [" + user.getPassword() + "]입니다.\n 로그인 후 비밀번호를 변경해주시기 바랍니다.");

		javaMailSender.send(message);
	}
}
