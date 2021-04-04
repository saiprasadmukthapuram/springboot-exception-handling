package com.sb.soft.app.exception;

import org.springframework.http.HttpStatus;

public class APIException extends DepartmentAbstractException {

	/**
	 * @param httpStatus
	 * @param details
	 */
	public APIException(String requestId, HttpStatus httpStatus, String details) {
		super(requestId, httpStatus, details);
	}

	/**
	 * @param message
	 * @param httpStatus
	 * @param details
	 */
	public APIException(String requestId, String message, HttpStatus httpStatus, String details) {
		super(requestId, message, httpStatus, details);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 * @param httpStatus
	 * @param details
	 */
	public APIException(String requestId, String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, HttpStatus httpStatus, String details) {
		super(requestId, message, cause, enableSuppression, writableStackTrace, httpStatus, details);
	}

	/**
	 * @param message
	 * @param cause
	 * @param httpStatus
	 * @param details
	 */
	public APIException(String requestId, String message, Throwable cause, HttpStatus httpStatus, String details) {
		super(requestId, message, cause, httpStatus, details);
	}

	/**
	 * @param cause
	 * @param httpStatus
	 * @param details
	 */
	public APIException(String requestId, Throwable cause, HttpStatus httpStatus, String details) {
		super(requestId, cause, httpStatus, details);
	}

}
