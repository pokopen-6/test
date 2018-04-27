package com.internousdev.wood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.wood.util.DBConnector;
import com.internousdev.wood.util.DateUtil;

public class BuyItemCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO purchase_history_info(id, user_id, product_id, product_count, price, regist_date)VALUES(?,?,?,?,?,?)";

	public void purchase_history_info(String id, String user_id, String product_id, String product_count, String price ) throws SQLException{
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, user_id);
			preparedStatement.setString(3, product_id);
			preparedStatement.setString(4, product_count);
			preparedStatement.setString(5, price);
			preparedStatement.setString(6, dateUtil.getDate());
			preparedStatement.execute();


		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

	}


}
