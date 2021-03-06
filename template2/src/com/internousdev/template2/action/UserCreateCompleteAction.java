package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {
		System.out.println(session.get("loginUserId").toString());
		System.out.println(session.get("loginPassword").toString());
		System.out.println(session.get("userName").toString());
//		System.out.println(loginUserId);
//		System.out.println(loginPassword);
//		System.out.println(userName);
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString());
		String result = SUCCESS;
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;

	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}

}
