package com.sb.soft.app.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;

	private String departmentName;
	private String departmentHead;

	public Department() {
		super();
	}

	public Department(long departmentId, String departmentName, String departmentHead) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

}
