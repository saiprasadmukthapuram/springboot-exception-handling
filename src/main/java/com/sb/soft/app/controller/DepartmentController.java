package com.sb.soft.app.controller;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.soft.app.bean.Department;
import com.sb.soft.app.service.DepartmentService;
import com.sb.soft.app.util.RequestIDGenerator;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping(path = "/", produces = "application/json")
	public Department save(@RequestBody Department department, @RequestHeader(required= false, name = "Request-ID") String requestId) {
		requestId = RequestIDGenerator.useOrGenerateRequestID(requestId);
		MDC.put("Request-ID", requestId);
		return departmentService.save(department, requestId);
	}

	@GetMapping(path = "/{departmentID}", produces = "application/json")
	public Department findByID(@PathVariable Long departmentID, @RequestHeader(required = false, name = "Request-ID") String requestId) {
		requestId = RequestIDGenerator.useOrGenerateRequestID(requestId);
		MDC.put("Request-ID", requestId);
		return departmentService.findByID(departmentID, requestId).get();
	}

}
