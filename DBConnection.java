package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getDBConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/david","root","david");
		
		return con;
	}
}
