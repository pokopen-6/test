package com.internousdev.wood.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wood.dao.ProductListDAO;
import com.internousdev.wood.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;



public class GoBuyItemAction extends ActionSupport implements SessionAware{


	public Map<String, Object> session;
	private ProductListDAO productListDAO = new ProductListDAO();
	public ArrayList<ProductDTO> productList = new ArrayList<>();
	public ArrayList<ProductDTO> displayList = new ArrayList<ProductDTO>();

	public String execute() throws SQLException {
		String result = ERROR;
		productList = productListDAO.getProductInfo();

		Iterator<ProductDTO> iterator = productList.iterator();
		if(!iterator.hasNext()){
			this.productList = null;


		}
		result = SUCCESS;
		return result;
	}



@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
		}



}
