package com.example.demo.exception;

public class InvalidContactException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidContactException(String message) {
		super(message);
	}
}
