package com.sb.soft.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.soft.app.bean.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
