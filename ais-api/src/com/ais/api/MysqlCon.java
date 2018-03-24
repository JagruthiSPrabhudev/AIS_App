package com.ais.api;

import java.sql.*;

/**
 * @author Mukesh Poptani
 * 
 */
class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3223633", "sql3223633",
					"HeC4XLKEjg");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aisusc");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}