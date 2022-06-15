package com.zensar.practice.beans;

public class Department {
	private String departmentName;
	private int departmentNo;

	public Department() {
		super();
	}

	public Department(String departmentName, int departmentNo) {
		super();
		this.departmentName = departmentName;
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentNo=" + departmentNo + "]";
	}

}
