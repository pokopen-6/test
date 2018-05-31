package com.internousdev.wheels.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.wheels.dto.ProductDTO;
import com.internousdev.wheels.util.DBConnector;

public class ProductListDAO {
	public ArrayList<ProductDTO> getProductInfo() throws SQLException {
		ArrayList<ProductDTO> productList = new ArrayList<>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM product_info WHERE status = 1 ORDER BY Product_id ASC";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
			ProductDTO dto = new ProductDTO();

			dto.setId(rs.getInt("id"));
			dto.setProductId(rs.getInt("product_id"));
			dto.setProductName(rs.getString("product_name"));
			dto.setProductDescription(rs.getString("product_description"));
			dto.setProductPrice(rs.getInt("price"));
			dto.setImageFilePath(rs.getString("image_file_path"));
			dto.setImageFileName(rs.getString("image_file_name"));
			productList.add(dto);
			}
			} catch(Exception e){
				throw new RuntimeException (e);
			}finally {
			con.close();
		}
		return productList;
	}
}

