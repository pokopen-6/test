package com.internousdev.wheels.dto;

public class LoginDTO {

	private String userId;

	private String password;

	private String userName;

	private boolean loginFlg = false;

	private boolean logined;

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

	public boolean isLogined(){
		return logined;
	}
	public void setLogined(boolean logined){
		this.logined = logined;
	}

}
