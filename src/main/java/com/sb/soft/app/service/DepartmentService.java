package com.sb.soft.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sb.soft.app.bean.Department;
import com.sb.soft.app.exception.BusinessException;
import com.sb.soft.app.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department, String requestId) {
		return departmentRepository.save(department);
	}

	public Optional<Department> findByID(Long departmentID, String requestId) {
		Optional<Department> d = departmentRepository.findById(departmentID);

		if (!d.isPresent()) {
			throw new BusinessException(requestId, "Given departmentId is not available", HttpStatus.NOT_FOUND,
					departmentID + " is not available in backend");
		}

		return d;
	}

}
