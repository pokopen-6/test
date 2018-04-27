package com.internousdev.wood.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wood.dao.LoginDAO;
import com.internousdev.wood.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userId;
	private String password;
	private boolean saveLogin;
	private Map<String, Object> session;

	public String execute() throws SQLException{
		String result="login";
		LoginDTO loginDTO = new LoginDTO();
		LoginDAO loginDAO = new LoginDAO();

		if(userId == null){
			return "login";
		}

		//IDの保持
		if(loginDTO != null){
			if(saveLogin){
				session.put("saveId", userId);
			}else{
				session.remove("saveId");
			}
		}

		//ログインチェック
		if(!userId.equals("")){
			if(!password.equals("")){
				loginDTO = loginDAO.select(userId,password);


				if(!loginDAO.existsUserId(userId)){
					result = "login";
				}else{
					//ログイン判定
					if(userId.equals(loginDTO.getUserId()) && password.equals(loginDTO.getPassword())){
						result = SUCCESS;

						session.put("userId", loginDTO.getUserId());
						session.put("loginFlg", true);//フラグ立て
					}
					}
			}
		}else {
			result ="login";
		}
		System.out.println(session.put("userId", loginDTO.getUserId()));
		System.out.println(session.put("loginFlg", loginDTO.getLoginFlg()));
		return result;
	}

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public boolean isSaveLogin(){
		return saveLogin;
	}
	public void setSaveLogin(boolean saveLogin){
		this.saveLogin = saveLogin;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object>session){
		this.session = session;
	}





	}