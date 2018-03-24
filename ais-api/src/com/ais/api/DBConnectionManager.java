package com.ais.api;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Mukesh Poptani
 * 
 */
public class DBConnectionManager {

	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3223633", "sql3223633",
					"HeC4XLKEjg");
			return con;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
