package com.brainmentors.restfulapps;

public class UserDetails {
	private String userid;
	private String email;
	private String phone;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
