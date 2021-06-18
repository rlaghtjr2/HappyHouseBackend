package com.ssafy.edu.vue.dto;

import java.util.Random;

public class FindPWDto {
	private String id;
	private String randPwd;
	public FindPWDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FindPWDto(String id) {
		this.id = id;
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 12; i++) {
		    int rIndex = rnd.nextInt(3);
		    switch (rIndex) {
		    case 0:
		        // a-z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 97));
		        break;
		    case 1:
		        // A-Z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 65));
		        break;
		    case 2:
		        // 0-9
		        temp.append((rnd.nextInt(10)));
		        break;
		    }
		}
		
		this.randPwd = temp.toString();
	}
	@Override
	public String toString() {
		return "FindPWDto [id=" + id + ", randPwd=" + randPwd + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRandPwd() {
		return randPwd;
	}
	public void setRandPwd(String randPwd) {
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 12; i++) {
		    int rIndex = rnd.nextInt(3);
		    switch (rIndex) {
		    case 0:
		        // a-z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 97));
		        break;
		    case 1:
		        // A-Z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 65));
		        break;
		    case 2:
		        // 0-9
		        temp.append((rnd.nextInt(10)));
		        break;
		    }
		}

		this.randPwd = temp.toString();
	}
	
}
