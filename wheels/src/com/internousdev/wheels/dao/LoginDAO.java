package com.internousdev.wheels.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.wheels.dto.LoginDTO;
import com.internousdev.wheels.util.DBConnector;

public class LoginDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private LoginDTO loginDTO = new LoginDTO();


	public LoginDTO select(String userId, String Password){
		String sql = "SELECT * FROM user_info WHERE user_id = ? AND password = ? ";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, Password);

			ResultSet rs = preparedStatement.executeQuery();

			if(rs.next()){
				loginDTO.setUserId(rs.getString("user_id"));
				loginDTO.setPassword(rs.getString("password"));


				if(!(rs.getString("user_id").equals(null))){
					loginDTO.setLoginFlg(true);

				}

			}
			}catch(Exception e){
				e.printStackTrace();
			}
			return loginDTO;

	}

	public boolean login(LoginDTO loginDTO)throws SQLException{
		boolean result = false;
		int updateCount = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE user_info SET logined = 1 WHERE user_id = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginDTO.getUserId());
			updateCount = ps.executeUpdate();
			if(updateCount > 0){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;

	}
	public boolean existsUserId(String userId)throws SQLException{
		boolean result = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result = true ;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}


	}


