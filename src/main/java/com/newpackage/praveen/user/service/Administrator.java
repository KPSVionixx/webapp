package com.newpackage.praveen.user.service;

import java.util.Scanner;

import com.newpackage.praveen.user.bean.UserBean;
import com.newpackage.praveen.user.dao.UserDAO;

public class Administrator
{	
	public static void main(String[] args) {
		UserDAO dao=new UserDAO();
		UserBean ubean=new UserBean();
		String username;
		String password;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add username and Password\n 2.Verify username and password for login\n \t Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Username to be created:");
			ubean.setUsername(sc.nextLine());
			System.out.println("Enter assword:");
			ubean.setUsername(sc.nextLine());
			dao.createuser(ubean);
			break;
		case 2:
			System.out.println("Enter Username to be created:");
			username=(sc.nextLine());
			System.out.println("Enter assword:");
			password=(sc.nextLine());
			dao.CheckUser(username, password);
			break;
		default:
			System.out.println("Please Enter a valid choice");
		}
		sc.close();
	}
}
