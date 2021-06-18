package com.ssafy.edu.vue.dto;

public class CommercialDto {
//	상가업소번호|상호명|지점명|상권업종대분류코드|상권업종대분류명|상권업종중분류코드|
//	상권업종중분류명|상권업종소분류코드|상권업종소분류명|표준산업분류코드|표준산업분류명|
//	시도코드|시도명|시군구코드|시군구명|행정동코드|행정동명|법정동코드|법정동명|지번코드|
//	대지구분코드|대지구분명|지번본번지|지번부번지|지번주소|도로명코드|도로명|건물본번지|건물부번지|
//	건물관리번호|건물명|도로명주소|구우편번호|신우편번호|동정보|층정보|호정보|경도|위도
	//상호명 1
	private String storeName;
	//상권업종대분류명 4
	private String bigClass;
	//상권업종중분류명 6
	private String middleClass;
	//상권업종소분류명 8
	private String smallClass;
	//시도명12
	private String city;
	//시군구명14
	private String gugun;
	//법정동코드 17
	private String dongcode;
	//법정동명18
	private String dong;
	//지번주소 24
	private String addr;
	//건물명 30
	private String buildingName;
	//층수 35
	private String floor;
	//경도 37
	private String lng;
	//위도 38
	private String lat;
	
	public CommercialDto() {
	}
	
	
	
	public CommercialDto(String storeName, String bigClass, String middleClass, String smallClass, String city,
			String gugun, String dongcode, String dong, String addr, String buildingName, String floor, String lng,
			String lat) {
		super();
		this.storeName = storeName;
		this.bigClass = bigClass;
		this.middleClass = middleClass;
		this.smallClass = smallClass;
		this.city = city;
		this.gugun = gugun;
		this.dongcode = dongcode;
		this.dong = dong;
		this.addr = addr;
		this.buildingName = buildingName;
		this.floor = floor;
		this.lng = lng;
		this.lat = lat;
	}



	public String getDongcode() {
		return dongcode;
	}

	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}

	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getBigClass() {
		return bigClass;
	}
	public void setBigClass(String bigClass) {
		this.bigClass = bigClass;
	}
	public String getMiddleClass() {
		return middleClass;
	}
	public void setMiddleClass(String middleClass) {
		this.middleClass = middleClass;
	}
	public String getSmallClass() {
		return smallClass;
	}
	public void setSmallClass(String smallClass) {
		this.smallClass = smallClass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
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
