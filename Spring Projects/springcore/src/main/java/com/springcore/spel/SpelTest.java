package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelObj")
public class SpelTest {
	//expressions
	@Value("#{17+23}")
	private int x;
	@Value("#{17+05}")
	private int y;
	//static methods
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double squareroot;
	//static variables
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	//objects
	@Value("#{new java.lang.String('Reyansh')}")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSquareroot() {
		return squareroot;
	}

	public void setSquareroot(double squareroot) {
		this.squareroot = squareroot;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SpelTest [x=" + x + ", y=" + y + ", squareroot=" + squareroot + ", pi=" + pi + ", name=" + name + "]";
	}

}
