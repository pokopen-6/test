package com.internousdev.wheels.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wheels.dao.BuyItemDAO;
import com.internousdev.wheels.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemAction extends ActionSupport implements SessionAware {
	public Map<String, Object>session;
	private int stock;
	private int product_price;
	private int price;

	private List<String> selectItemList;
	//購入製品情報取得DAO
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	public String message;
	//buyItem.jspでチェックした時のフラグ
	private String selectFlg;

	ArrayList<ProductDTO> productList = new ArrayList<>();

	public String execute() throws SQLException {

		String result = SUCCESS;
		session.get("userId").toString();

		//合計金額の計算
		session.put("stock", stock);
		session.put("product_price", product_price);
		System.out.println(session.get("stock"));
		System.out.println(session.get("product_price"));
		int intCount = Integer.parseInt(session.get("stock").toString());
		int intPrice = Integer.parseInt(session.get("product_price").toString());
		session.put("price", intCount * intPrice);
		System.out.println(session.get(price));



		if(selectFlg != null){
			selectChoose();
		}


		return result;

	}


public void selectChoose() throws SQLException {
		if(selectItemList == null){
			setMessage("チェックを入れてクレメンス");
			return;
		}
			int res = buyItemDAO.userChoose(selectItemList);
			if(res > 0){
System.out.println(res);

				// ↓iteratorで廻してあげる。iteratorはnewする必要がなく、iterator()を呼び出せばよい。
				Iterator<String> it = selectItemList.iterator();

				if (!(it.hasNext())) {
					selectItemList = null;
				}
			}

}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message = message;
	}



	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}

}
