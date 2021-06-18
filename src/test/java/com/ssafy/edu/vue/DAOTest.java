package com.ssafy.edu.vue;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ssafy.edu.vue.dao.UserDaoImpl;
import com.ssafy.edu.vue.dto.UserDto;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class DAOTest {
 @Autowired
 private UserDaoImpl dao;  // 인터페이스를 넣지 마세요.
 @Test
 public void test() {   
    try {
    	
	} catch (Exception e) {
	}
 }
}