package com.newpackage.praveen.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.newpackage.praveen.user.bean.UserBean;
import com.newpackage.praveen.user.util.DBUtil;

public class UserDAO {
	
	public String createuser(UserBean userBean) 
	{
		try
		{
		
			Connection con=DBUtil.getDBConnection();
			PreparedStatement pst=con.prepareStatement("insert into users_TB values(?,?)");
			pst.setString(1,userBean.getUsername());
			pst.setString(2,userBean.getPassword());
			
			int count=pst.executeUpdate();
			if(count==1)
			{
				return "INSERTED INTO DB SUCCESSFULLY";
			}
			else
			{
				return "FAIL Adding into DB";
			}
		}
		
		catch(Exception ex)
		{
			return "FAIL";		
		}
	}

	public String CheckUser(String Username, String Password) 
	{
	
		Connection con = DBUtil.getDBConnection();
		try
		{
		 PreparedStatement pst = con.prepareStatement("select * from  WEATHER_TB where R_DATE=? and LOCATION=?");
		 pst.setString(1,Username);
		 pst.setString(2, Password);
		 ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			return "Username and Password Match";
 		}
		else{
			return "Username or Password INCORRECT";
		}
		 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return "CHECK Failed";
		}		
		
	}	
		
}
