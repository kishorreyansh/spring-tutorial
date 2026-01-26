package com.springcore.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireconfig.xml");
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println("Employee Object: "+emp);
	}

}
