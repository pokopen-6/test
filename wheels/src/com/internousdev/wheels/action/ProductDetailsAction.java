package com.internousdev.wheels.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wheels.dao.ProductDetailsDAO;
import com.internousdev.wheels.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;



public class ProductDetailsAction extends ActionSupport implements SessionAware {

	//セッション情報取得
	public Map<String, Object> session;

	private String id;
	private String productId;
	private String error;
	private int insertFlg;

	//購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();
	//商品詳細リスト
	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();
	public ProductDTO detail = new ProductDTO();
	public List<ProductDTO> detailsList = new ArrayList<ProductDTO>();


	public String execute() throws SQLException {
		//商品詳細取得

			detail = productDetailsDAO.getProductDetailsInfo(productId);
			if(detail != null && detail.getId() != 0){
				session.put("DetailProductDTO", detail);
			}else{
				return ERROR;
			}


		String result = SUCCESS;
		return result;

	}

	@Override
    public void setSession(Map<String, Object> session) {
       this.session = session;
    }

    public Map<String, Object> getSession() {
       return this.session;
    }
    		public String getProductId(){
    			return productId;
    		}
    		public void setProductId(String productId){
    			this.productId = productId;
    		}

			public int getInsertFlg() {
				return insertFlg;
			}

			public void setInsertFlg(int insertFlg) {
				this.insertFlg = insertFlg;
			}

			public List<Integer> getStockList() {
				return stockList;
			}

			public void setStockList(List<Integer> stockList) {
				this.stockList = stockList;
			}

			public List<ProductDTO> getDetailsList() {
				return detailsList;
			}

			public void setDetailsList(List<ProductDTO> detailsList) {
				this.detailsList = detailsList;
			}

			public ProductDetailsDAO getProductDetailsDAO() {
				return productDetailsDAO;
			}

			public void setProductDetailsDAO(ProductDetailsDAO productDetailsDAO) {
				this.productDetailsDAO = productDetailsDAO;
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}




			public String getError() {
				return error;
			}

			public void setError(String error) {
				this.error = error;
			}

			public ProductDTO getDetail() {
				return detail;
			}




			public void setDetail(ProductDTO detail) {
				this.detail = detail;
			}



}

