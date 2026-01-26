package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class LifeCycleUsingAnnotations{
	private double price;

	public LifeCycleUsingAnnotations() {
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
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method of Annotation");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method of Annotation");
	}
	
}