package com.internousdev.wheels.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute(){

		return  SUCCESS;
	}

	public Map<String, Object> getSession(){
		return session;
	}
	public void  setSession(Map<String, Object>session){
		this.session = session;
	}

}
