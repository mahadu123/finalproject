package com.sdl.homeloan.exceptions;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8223264287445189246L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
