package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class StandaloneColectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalonecollectionsconfig.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println("Person List: "+person);
		System.out.println("Person List Name: "+person.getCricketers().getClass().getName());
		System.out.println("Person List: "+person.getScores());
		System.out.println("Person Set Name: "+person.getScores().getClass().getName());
		System.out.println("Person List: "+person.getTeams());
		System.out.println("Person Map Name: "+person.getTeams().getClass().getName());
		System.out.println("Person List: "+person.getProperties());
		

	}

}
