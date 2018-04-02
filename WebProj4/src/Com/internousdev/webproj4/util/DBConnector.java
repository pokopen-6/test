package Com.internousdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 *  JDBC Drivername
	 */
	private static String drivername = "com.mysql.jdbc.Driver";
	/**
	 *  Database Access URL
	 */
	private static String url = "jdbc:mysql://localhost/webproj4";
	/**
	 *  Database Access username
	 */
	private static String user = "root";
	/**
	 *  Database Access password
	 */
	private static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;
		try {
			Class.forName(drivername);
			con = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
