package com.apiemploye.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Loadexption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Loadexption(String message) {
		super(message);
		this.message = message;
	}
	
	
	

}