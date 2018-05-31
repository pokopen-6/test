package com.internousdev.wheels.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String userMail;
	private String userTel;
	private String postalCode;
	private String userAddress;

	public Map<String, Object>session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(familyName.equals("")) && !(firstName.equals("")) && !(familyNameKana.equals("")) && !(firstNameKana.equals("")) && !(sex.equals("")) && !(userMail.equals("")) && !(userTel.equals("")) && !(postalCode.equals("")) && !(userAddress.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("sex", sex);
			session.put("userMail", userMail);
			session.put("userTel", userTel);
			session.put("postalCode", postalCode);
			session.put("userAddress", userAddress);

			System.out.println(session.put("loginUserId", loginUserId));
			System.out.println(session.put("loginPassword", loginPassword));
			System.out.println(session.put("familyName", familyName));
			System.out.println(session.put("firstName", firstName));
			System.out.println(session.put("familyNameKana", familyNameKana));
			System.out.println(session.put("firstNameKana", firstNameKana));
			System.out.println(session.put("sex", sex));
			System.out.println(session.put("userMail", userMail));
			System.out.println(session.put("userTel", userTel));
			System.out.println(session.put("postalCode", postalCode));
			System.out.println(session.put("userAddress", userAddress));




		}else{
			setErrorMessage("未入力またはエラー項目があります");
			result = ERROR;
		}
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

	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
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

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}




}
