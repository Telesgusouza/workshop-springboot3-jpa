package com.gustavo.course.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = -8397591745790930557L;

	public DatabaseException(String msg) {
		super(msg);
	}
	
}
