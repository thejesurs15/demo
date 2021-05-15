package com.thejes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class test_jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user="hiber";
		String pass="hbstudent";
        		
		try {
			
			System.out.println("connecting to database" +jdbcUrl);
			
			Connection connection=DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("connection succesful"); 
		}
		catch(Exception exc){
			
			exc.printStackTrace();
			
		}

	}

}
