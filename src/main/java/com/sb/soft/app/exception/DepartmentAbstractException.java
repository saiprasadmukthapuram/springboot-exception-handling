package com.sb.soft.app.exception;

import org.springframework.http.HttpStatus;

public abstract class DepartmentAbstractException extends RuntimeException {

	private final String requestId;
	private final HttpStatus httpStatus;
	private final String details;
	private String errorCode;

	public DepartmentAbstractException(String requestId, HttpStatus httpStatus, String details) {
		super();
		this.requestId = requestId;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public DepartmentAbstractException(String requestId, String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, HttpStatus httpStatus, String details) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.requestId = requestId;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public DepartmentAbstractException(String requestId, String message, Throwable cause, HttpStatus httpStatus,
			String details) {
		super(message, cause);
		this.requestId = requestId;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public DepartmentAbstractException(String requestId, String message, HttpStatus httpStatus, String details) {
		super(message);
		this.requestId = requestId;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public DepartmentAbstractException(String requestId, Throwable cause, HttpStatus httpStatus, String details) {
		super(cause);
		this.requestId = requestId;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public String getRequestId() {
		return requestId;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getDetails() {
		return details;
	}

}
