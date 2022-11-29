package com.employeewage;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Employee emp=new Employee();
		System.out.println("Employee's Salary for Month is : "+emp.montlyWage());
	}
	
}
