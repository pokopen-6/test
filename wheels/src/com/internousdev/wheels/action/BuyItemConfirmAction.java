package com.internousdev.wheels.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wheels.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object>session;
	private String result;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException {
		buyItemCompleteDAO.purchase_history_info(
				session.get("id").toString(),
				session.get("user_id").toString(),
				session.get("product_name").toString(),
				session.get("price").toString(),
				session.get("product_count").toString());






		result = SUCCESS;

		return result;
	}
	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}

}
