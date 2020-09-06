package com.manipal.spring_core_demo3.model;

import java.util.List;

public class Organization {
	private int id;
	private String name;
	private List<Employee> employeeList;
	
	public int getId() {
		System.out.println("Getter Method...");
		return id;
	}
	public void setId(int id) {
		System.out.println("Setter Method...");
		this.id = id;
	}
	public String getName() {
		System.out.println("getter Method...");
		return name;
	}
	public void setName(String name) {
		System.out.println("Setter Method...");
		this.name = name;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", employeeList=" + employeeList + "]";
	}
	public void showDetails()
	{
		for(Employee emp:employeeList)
		{
			System.out.println(emp+"\n");
		}
	}
	
	
	
	

}
