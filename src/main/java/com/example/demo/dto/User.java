package com.example.demo.dto;

public class User {

	private String userName;
	private String id;
	private String password;

	
	public User(String userName, String id, String password){
		this.id = id;
		this.password = password;
		this.userName = userName;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
