package com.ssafy.edu.vue.dto;

public class AreaDto {
	private String city;
	private String gugun;
	private String dong;
	
	public AreaDto() {
		// TODO Auto-generated constructor stub
	}
	
	public AreaDto(String city, String gugun, String dong) {
		super();
		this.city = city;
		this.gugun = gugun;
		this.dong = dong;
	}
	@Override
	public String toString() {
		return "AreaDto [city=" + city + ", gugun=" + gugun + ", dong=" + dong + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	
	
}
