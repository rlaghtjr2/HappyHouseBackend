package com.ssafy.edu.vue.dto;

public class AptDto {
	private int idx;
	private String code;
	private String dongcode;
	private String city;
	private String gugun;
	private String dong;
	private String aptName;
	private String dealAmount;
	private String jibun;
	private String lat;
	private String lng;
	
	public AptDto() {
	}

	public AptDto(int idx, String code, String dongcode, String city, String gugun, String dong, String aptName,
			String dealAmount, String jibun, String lat, String lng) {
		super();
		this.idx = idx;
		this.code = code;
		this.dongcode = dongcode;
		this.city = city;
		this.gugun = gugun;
		this.dong = dong;
		this.aptName = aptName;
		this.dealAmount = dealAmount;
		this.jibun = jibun;
		this.lat = lat;
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "AptDto [index=" + idx + ", code=" + code + ", dongcode=" + dongcode + ", city=" + city + ", gugun="
				+ gugun + ", dong=" + dong + ", aptName=" + aptName + ", dealAmount=" + dealAmount + ", jibun=" + jibun
				+ ", lat=" + lat + ", lng=" + lng + "]";
	}

	public int getIndex() {
		return idx;
	}

	public void setIndex(int idx) {
		this.idx = idx;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDongcode() {
		return dongcode;
	}

	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
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

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getJibun() {
		return jibun;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}
	
	
}
