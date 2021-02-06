package com.empmgt.entities;

public class Department {

	private String deptId;
	private String deptName;
	
	//Constructor 
	public Department(String deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}


	// Get-Set for deptId
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptId() {
		return deptId;
	}

	// Get-Set for deptName
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

}
