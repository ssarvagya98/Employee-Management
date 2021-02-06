package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmpMain {

	public static void main(String[] args) {
		EmpMain app = new EmpMain();
		app.start();

	}

	private void start() {

		Department department1 = new Department("A", "Testing");
		Department department2 = new Department("B", "Development");

		Employee employees[] = new Employee[4];

		Developer developer1 = new Developer(1, "Sarvagya", department2, "Java");
		Developer developer2 = new Developer(2, "Apoorv  ", department2, "Python");

		Tester tester1 = new Tester(3, "Vishwaas", department1, "TestRail");
		Tester tester2 = new Tester(4, "Madhav  ", department1, "Testpad");

		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i];
				displayEmployee(developer);
			} else {
				Tester tester = (Tester) employees[i];
				displayEmployee(tester);
			}
		}

	}

	private void displayEmp(Employee employee) {
		System.out.print(employee.getId() + "\t");
		System.out.print(employee.getName() + "\t\t");
		System.out.print(employee.getDepartment() + "\t");

	}

	private void displayEmployee(Developer employee) {
		displayEmp(employee);
		System.out.println(employee.getLanguage());

	}

	private void displayEmployee(Tester employee) {
		displayEmp(employee);
		System.out.println(employee.getTools());
	}

}
