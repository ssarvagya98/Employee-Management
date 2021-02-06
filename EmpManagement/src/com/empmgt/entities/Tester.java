package com.empmgt.entities;

public class Tester extends Employee {

	private String tools;

	// Constructor
	public Tester(int id, String name, Department department, String tools) {
		super(id, name, department);
		this.tools = tools;
	}
	

	@Override
	public String toString() {
		return "Tester [tools=" + tools + "]";
	}


	// Get-Set for tools
	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

}
