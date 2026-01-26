package com.springcore.autowire;

public class Address {
	
	private String street;
	private String city;
	
	public Address() {
		super();
		System.out.println("Address Construtor called");
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		System.out.println("Address Construtor called 1");
	}



	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("Street setter method called");
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		System.out.println("City setter method called");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
