package com.sb.soft.app.util;

import java.util.UUID;

import org.springframework.util.StringUtils;

public class RequestIDGenerator {

	private RequestIDGenerator() {

	}

	public static String useOrGenerateRequestID(String requestId) {
		if (!StringUtils.hasText(requestId)) {
			return UUID.randomUUID().toString();
		}
		return requestId;
	}
}
