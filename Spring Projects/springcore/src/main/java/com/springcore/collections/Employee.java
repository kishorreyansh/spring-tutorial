package com.springcore.collections;

import java.util.*;

public class Employee{
	
	private String name;
	private List<Integer> phones;
	private Set<String> addresses;
	private Map<Integer,String> courses;
	private Properties skills;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, List<Integer> phones, Set<String> addresses, Map<Integer, String> courses, Properties skills) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<Integer, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}

	public Properties getSkills() {
		return skills;
	}

	public void setSkills(Properties skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", skills=" + skills + "]";
	}
	
}