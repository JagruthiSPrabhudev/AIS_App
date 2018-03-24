package com.ais.api;

/**
 * @author Mukesh Poptani
 * 
 */
public class Student {

	private String uscId;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student(String uscId, String firstName, String lastName, String email) {
		super();
		this.uscId = uscId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getUscId() {
		return uscId;
	}
	public void setUscId(String uscId) {
		this.uscId = uscId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


}
