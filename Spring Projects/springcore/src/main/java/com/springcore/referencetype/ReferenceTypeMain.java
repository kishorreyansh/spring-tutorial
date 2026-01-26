package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTypeMain{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referencetype/referencetypeconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println("A reference x: "+a.getX());
		System.out.println("A reference b: "+a.getB().getY());
		
		A a1 = (A) context.getBean("aref1");
		System.out.println("A reference x: "+a1.getX());
		System.out.println("A reference using ref attribute: "+a1.getB().getY());
		
		A a2 = (A) context.getBean("aref2");
		System.out.println("A reference x: "+a2.getX());
		System.out.println("A reference using p schema ref attribute: "+a2.getB().getY());
		
		
	}
}