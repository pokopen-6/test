package com.internousdev.wheels.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wheels.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String userMail;
	private String userTel;
	private String postalCode;
	private String userAddress;
	public Map<String, Object>session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
										session.get("loginPassword").toString(),
										session.get("familyName").toString(),
										session.get("firstName").toString(),
										session.get("familyNameKana").toString(),
										session.get("firstNameKana").toString(),
										Integer.parseInt((session.get("sex")).toString()),
										session.get("userMail").toString(),
										session.get("userTel").toString(),
										session.get("postalCode").toString(),
										session.get("userAddress").toString());


		System.out.println(session.get("loginUserId").toString());
		System.out.println(session.get("loginPassword").toString());
		System.out.println(session.get("familyName").toString());
		System.out.println(session.get("firstName").toString());
		System.out.println(session.get("familyNameKana").toString());
		System.out.println(session.get("firstNameKana").toString());
		System.out.println(session.get("sex").toString());
		System.out.println(session.get("userMail").toString());
		System.out.println(session.get("userTel").toString());
		System.out.println(session.get("postalCode").toString());
		System.out.println(session.get("userAddress").toString());

		String result = SUCCESS;

		return result;


	}
	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId= loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNamekana(){
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}

	public int getSex(){
		return sex;
	}
	public void setSex(int sex){
		this.sex = sex;
	}

	public String getUserMail(){
		return userMail;
	}
	public void setUserMail(String userMail){
		this.userMail = userMail;
	}

	public String getUserTel(){
		return userTel;
	}
	public void setUserTel(String userTel){
		this.userTel = userTel;
	}
	public String getPostalCode(){
		return postalCode;
	}
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	public String getUserAddress(){
		return userAddress;
	}
	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}

	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}

	}
