package com.brainmentors.controllers;

public class UserSessionAttr {
	private String userid;
	private String city;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserSessionAttr [userid=" + userid + ", city=" + city + "]";
	}
	
	

}
