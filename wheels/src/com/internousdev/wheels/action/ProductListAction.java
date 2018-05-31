package com.internousdev.wheels.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wheels.dao.ProductListDAO;
import com.internousdev.wheels.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;



public class ProductListAction extends ActionSupport implements SessionAware {


	//セッション情報取得
	private Map<String, Object> session;
	//商品情報取得
	private ProductListDAO productListDAO = new ProductListDAO();
	//商品情報格納
	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();



	private int pageSelect;
	private int pageCount;
	private int listFlg;
	private List<Integer> pageList = new ArrayList<Integer>();

	//検索数
	public int number;

	private int maxPage;

	private int pageNum = 0;

	//商品情報取得メソッド
	public String execute() throws SQLException {
		String result = SUCCESS;
		productList = productListDAO.getProductInfo();

		number = productList.size();



		session.put("ProductList",productList.size());




		return result;
	}


	 @Override
	    public void setSession(Map<String, Object> session) {
	       this.session = session;
	    }

	    public Map<String, Object> getSession() {
	       return this.session;
	    }

	    public ProductListDAO getProductListDAO() {
	       return this.productListDAO;
	    }

	    public void setProductListDAO(ProductListDAO productListDAO) {
	       this.productListDAO = productListDAO;
	    }

	    public ArrayList<ProductDTO> getProductList() {
	       return this.productList;
	    }

	    public void setProductList(ArrayList<ProductDTO> productList) {
	       this.productList = productList;
	    }


		public int getPageSelect() {
	       return this.pageSelect;
	    }

	    public void setPageSelect(int pageSelect) {
	       this.pageSelect = pageSelect;
	    }

	    public List<Integer> getPageList() {
	       return this.pageList;
	    }

	    public void setPageList(List<Integer> pageList) {
	       this.pageList = pageList;
	    }

	    public int getPageCount() {
	       return this.pageCount;
	    }

	    public void setPageCount(int pageCount) {
	       this.pageCount = pageCount;
	    }



		public int getNumber() {
			return number;
		}



		public void setNumber(int number) {
			this.number = number;
		}



		public int getMaxPage() {
			return maxPage;
		}



		public void setMaxPage(int maxPage) {
			this.maxPage = maxPage;
		}




		public int getPageNum() {
			return pageNum;
		}



		public void setPageNum(int pageNum) {
			this.pageNum = pageNum;
		}



		public int getListFlg() {
			return listFlg;
		}



		public void setListFlg(int listFlg) {
			this.listFlg = listFlg;
		}




}
