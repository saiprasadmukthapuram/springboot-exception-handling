package com.sb.soft.app.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends DepartmentAbstractException {

	public BusinessException(String requestId, String message, HttpStatus httpStatus, String details) {
		super(requestId,message, httpStatus, details);
	}

	public BusinessException(String requestId, String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, HttpStatus httpStatus, String details) {
		super(requestId, message, cause, enableSuppression, writableStackTrace, httpStatus, details);
	}

	public BusinessException(String requestId, String message, Throwable cause, HttpStatus httpStatus, String details) {
		super(requestId, message, cause, httpStatus, details);
	}

	public BusinessException(String requestId, Throwable cause, HttpStatus httpStatus, String details) {
		super(requestId, cause, httpStatus, details);
	}

	public BusinessException(String requestId, HttpStatus httpStatus, String details) {
		super(requestId, httpStatus, details);
	}

}
