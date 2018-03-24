package com.ais.api;

import java.util.List;

/**
 * @author Mukesh Poptani
 * 
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private List<String> messages;

	public CustomException(List<String> messages) {
		super();
		this.messages = messages;
	}

	public List<String> getMessages() {
		return messages;
	}

}
