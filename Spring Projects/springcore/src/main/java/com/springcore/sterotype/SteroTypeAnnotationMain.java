package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collections.Person;

public class SteroTypeAnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotypeannotationconfig.xml");
		//Student student = context.getBean("student",Student.class);
		Student student = context.getBean("studentObj",Student.class);
		System.out.println("Student Object: "+student);
		System.out.println("Marks: "+student.getMarks());
		System.out.println("Student Object Hashcode: "+student.hashCode());
		
		Student student1 = context.getBean("studentObj",Student.class);
		System.out.println("Student1 Object Hashcode: "+student1.hashCode());
		
		Teacher teacher = context.getBean("teacher",Teacher.class);
		System.out.println("Teacher Object Hashcode: "+teacher.hashCode());
		
		Teacher teacher1 = context.getBean("teacher",Teacher.class);
		System.out.println("Teacher1 Object Hashcode: "+teacher1.hashCode());
		
		

	}

}
