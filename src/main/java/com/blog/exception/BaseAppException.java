package com.blog.exception;

public class BaseAppException extends RuntimeException {

	private static final long serialVersionUID = 1813169667624919384L;

	public BaseAppException() {
		super();
	}

	public BaseAppException(String message) {
		super(message);
	}

	public BaseAppException(String message, Throwable cause) {
		super(message, cause);
	}

}
