package com.devco.qa.travelocity.models;

public class SignInModel {
	
	private String user;
	private String password;
	
	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}

	public SignInModel(String user, String password) {
		this.user = user;
		this.password = password;
	}
}
