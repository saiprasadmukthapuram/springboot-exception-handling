package com.sb.soft.app.exception;

import java.util.Calendar;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sb.soft.app.exception.model.DeptExceptionModel;

@ControllerAdvice
public class GobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return super.handleMethodArgumentNotValid(ex, headers, status, request);
	}

	@ExceptionHandler(value = { APIException.class })
	protected ResponseEntity<Object> handleAPIException(APIException ex, WebRequest request) {
		HttpStatus httpStatus;
		if (ex.getHttpStatus() == null) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		} else {
			httpStatus = ex.getHttpStatus();
		}
		return new ResponseEntity<Object>(createException(ex, httpStatus, request, ex.getDetails()), httpStatus);
	}

	@ExceptionHandler(value = { BusinessException.class })
	protected ResponseEntity<Object> handleBusinessException(BusinessException ex, WebRequest request) {

		HttpStatus httpStatus;
		if (ex.getHttpStatus() == null) {
			httpStatus = HttpStatus.BAD_REQUEST;
		} else {
			httpStatus = ex.getHttpStatus();
		}

		return new ResponseEntity<Object>(createException(ex, httpStatus, request, ex.getDetails()), httpStatus);
	}

	private DeptExceptionModel createException(Exception ex, HttpStatus status, WebRequest request, String details) {

		DeptExceptionModel model = new DeptExceptionModel();
		model.setTimestamp(String.valueOf(Calendar.getInstance().getTimeInMillis()));
		model.setException(ex.getClass().getName());
		model.setStatus(status.toString());
		model.setError(status.getReasonPhrase());
		model.setDetails(details);
		if (request instanceof ServletWebRequest) {
			ServletWebRequest swr = (ServletWebRequest) request;
			model.setPath(swr.getRequest().getRequestURI());
		}

		if (ex instanceof DepartmentAbstractException) {
			model.setMessage(ex.getMessage());
			model.setRequestId(((DepartmentAbstractException) ex).getRequestId());
		}
		return model;
	}
}
