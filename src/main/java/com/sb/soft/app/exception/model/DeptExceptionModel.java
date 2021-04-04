package com.sb.soft.app.exception.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeptExceptionModel {
	private String requestId;
	private String timestamp;
	private String exception;
	private String status;
	private String error;
	private String path;
	private String message;
	private String details;
	
	@JsonProperty("requestId")
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("exception")
	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@JsonProperty("path")
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("details")
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
