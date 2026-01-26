package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Employee() {
		super();
		System.out.println("Employee Construtor called");
		// TODO Auto-generated constructor stub
	}
	
	
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee Construtor called 1");
	}



	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Address setter method called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	

}
