package com.manitos.model;

public class UserCredencial {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserCredencial(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserCredencial() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserCredencial [username=" + username + ", password=" + password + "]";
	}
	

}
