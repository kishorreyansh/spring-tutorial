package com.springcore.autowire;

public class Employee {
	
	private Address address;

	public Employee() {
		super();
		System.out.println("Employee Construtor called");
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee Construtor called 1");
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address setter method called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	

}
