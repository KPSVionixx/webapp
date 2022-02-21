package com.newpackage.praveen.user.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println(" CON = "+con);
			return con;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return con;
	}
}
