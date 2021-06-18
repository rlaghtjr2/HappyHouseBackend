package com.ssafy.edu.vue.dto;

public class InterestDto {
	private String id;
	private String area;
	
	@Override
	public String toString() {
		return "Interest [id=" + id + ", area=" + area + "]";
	}
	public InterestDto() {
	}
	public InterestDto(String id, String area) {
		super();
		this.id = id;
		this.area = area;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}
