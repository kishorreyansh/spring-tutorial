package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentObj")
@Scope("prototype")
public class Student {
	
	@Value("Reyansh")
	private String name;
	@Value("Hyderabad")
	private String city;
	
	@Value("#{mymarks}")
	private List<Integer> marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	

}
