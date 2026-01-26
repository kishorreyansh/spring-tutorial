package com.springcore.constructorinjection;

public class Addition{
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor of int,int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor of double,double");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor of String,String");
	}
	
	public void doSum() {
		System.out.println("Sum is : " +((this.a) + (this.b)));
	}
	
	
}