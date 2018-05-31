package com.internousdev.wood.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.wood.dao.MyPageDAO;
import com.internousdev.wood.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
	public Map<String, Object>session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){
			String id = session.get("id").toString();
			String user_id = session.get("user_id").toString();
			myPageList = myPageDAO.getMyPageUserInfo(id, user_id);

		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result = SUCCESS;
		return result;
	}
		public void delete() throws SQLException {
			String id = session.get("id").toString();
			String user_id = session.get("user_id").toString();

			int res = myPageDAO.purchaseHistoryInfoDelete(id, user_id);

			if(res > 0 ){
				myPageList = null;
				setMessage("商品情報を正しく削除しますた");
			}else if(res == 0){
				setMessage("商品情報の削除に失敗しますた");
			}
		}
		public void setDeleteFlg(String deleteFlg){
			this.deleteFlg = deleteFlg;
		}
		@Override
		public void setSession(Map<String, Object> session){
			this.session = session;
		}
		public ArrayList<MyPageDTO> getMyPageList(){
			return this.myPageList;
		}

		public String getMessage(){
			return this.message;
		}
		public void setMessage(String message){
			this.message = message;
		}

}
