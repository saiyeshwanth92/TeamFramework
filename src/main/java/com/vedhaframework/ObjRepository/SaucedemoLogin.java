package com.vedhaframework.ObjRepository;

public class SaucedemoLogin {

	
	private static String username ="//input[@placeholder=\"Username\"]" ;
	private static String password = "//input[@placeholder=\"Password\"]";
	private static String login = "login-button";
	
	
	
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}
	public static String getLogin() {
		return login;
	}


}

