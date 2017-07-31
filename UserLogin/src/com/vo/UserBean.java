package com.vo;

public class UserBean {
	private String name,pswd;

	
	public UserBean() {
		
	}
public UserBean(String name, String pswd) {
		super();
		this.name = name;
		this.pswd = pswd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	

}
