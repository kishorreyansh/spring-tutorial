package com.springcore.lifecycle;

public class LifeCycleUsingXml{
	private double price;

	public LifeCycleUsingXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifeCycleUsingXml [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Init Method of XML");
	}
	
	public void destroy() {
		System.out.println("Destroy Method of XML");
	}
	
}