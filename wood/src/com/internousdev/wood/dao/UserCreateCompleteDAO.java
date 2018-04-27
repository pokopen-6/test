package com.internousdev.wood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.wood.util.DBConnector;
import com.internousdev.wood.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,user_mail,user_tel,postal_code,user_address,regist_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

	public void createUser(String loginUserId, String loginPassword, String familyName, String firstName, String familyNameKana, String firstNameKana, int sex, String userMail, String userTel, String postalCode, String userAddress) throws SQLException{

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);
			preparedStatement.setString(3, familyName);
			preparedStatement.setString(4, firstName);
			preparedStatement.setString(5, familyNameKana);
			preparedStatement.setString(6, firstNameKana);
			preparedStatement.setInt(7, sex);
			preparedStatement.setString(8, userMail);
			preparedStatement.setString(9, userTel);
			preparedStatement.setString(10, postalCode);
			preparedStatement.setString(11, userAddress);
			preparedStatement.setString(12, dateUtil.getDate());
			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

}
