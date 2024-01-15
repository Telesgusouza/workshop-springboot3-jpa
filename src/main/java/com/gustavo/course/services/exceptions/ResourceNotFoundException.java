package com.gustavo.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -2208157124795116129L;

	public ResourceNotFoundException(Object id) {
		super("Rource not found. Id " + id);
	}
	
}
