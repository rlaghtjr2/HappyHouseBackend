package com.ssafy.edu.vue.dto;

public class UserDto {
	private String id;
	private String password;
	private String name;
	private String birthday;
	private String sex;
	private String email;
	private String created_date;
	private boolean isAdmim;
	
	
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", sex="
				+ sex + ", email=" + email + ", created_date=" + created_date + ", isAdmim=" + isAdmim + "]";
	}


	public UserDto() {
	}
	

	

	public UserDto(String id, String password, String name, String birthday, String sex, String email,
			String created_date, boolean isAdmim) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.email = email;
		this.created_date = created_date;
		this.isAdmim = isAdmim;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public boolean isAdmim() {
		return isAdmim;
	}

	public void setAdmim(boolean isAdmim) {
		this.isAdmim = isAdmim;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
