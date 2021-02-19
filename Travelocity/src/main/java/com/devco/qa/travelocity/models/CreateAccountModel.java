package com.devco.qa.travelocity.models;

public class CreateAccountModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public CreateAccountModel(String firstName, String lastName, String email, String password,
			String confirmPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
}
