package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain{
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorinjectionconfig.xml");
		Person p = (Person)context.getBean("person");
		System.out.println("Person Object: "+p);
		
		Person p1 = (Person)context.getBean("person1");
		System.out.println("Person Object1: "+p1);
		
		Person p2 = (Person)context.getBean("person2");
		System.out.println("Person Object1: "+p2);
		
		Addition add = (Addition)context.getBean("add");
		add.doSum();
		
	}
}