package com.internousdev.wood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.wood.dto.MyPageDTO;
import com.internousdev.wood.util.DBConnector;

public class MyPageDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<MyPageDTO> getMyPageUserInfo(String id, String user_id) throws SQLException{
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		String sql = "SELECT ubit.id, ubit.user_id, iit.product_name, ubit.price, ubit.product_count,  ubit.insert_date FROM purchase_history_info ubit LEFT JOIN product_info iit ON ubit.product_id = iit.id WHERE ubit.product_id =? AND ubit.user_id = ? ORDER BY insert_date DESC";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, user_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setInsert_date(rs.getString("insert_date"));
				myPageDTO.add(dto);
			}
		}catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}
			return myPageDTO;
		}
		public int purchaseHistoryInfoDelete(String id, String user_id) throws SQLException{
			String sql = "DELETE FROM purchase_history_info WHERE id = ? AND user_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			int result = 0;
			try {
				ps.setString(1, id);
				ps.setString(2, user_id);
				result = ps.executeUpdate();
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				con.close();
			}
			return result;

	}

}
