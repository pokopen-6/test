package com.internousdev.wood.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

public class GoHomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object>session;

	public String execute(){
		return SUCCESS;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object>session){
		this.session = session;
	}

}