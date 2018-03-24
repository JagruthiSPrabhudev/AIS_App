package com.ais.api;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Mukesh Poptani
 * 
 */
public class ApiService {

	public Student getStudentRecord(String uscId) {
		try{
			
			Connection con = DBConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aisusc where usc_id='" + uscId + "'");
			Student s = null;
			while (rs.next()){
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
				s = new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
			DBConnectionManager.closeConnection(con);
			return s;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}

}
