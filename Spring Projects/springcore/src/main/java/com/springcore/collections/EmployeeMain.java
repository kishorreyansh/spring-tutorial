package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println("Employee Object: "+employee);
		System.out.println("Employee Name: "+employee.getName());
		System.out.println("Employee Phones: "+employee.getPhones());
		System.out.println("Employee Addresses: "+employee.getAddresses());
		System.out.println("Employee Courses: "+employee.getCourses());
		System.out.println("Employee Skills: "+employee.getSkills());
		
	}
}