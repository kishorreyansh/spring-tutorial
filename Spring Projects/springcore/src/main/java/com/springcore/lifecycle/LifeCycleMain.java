package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain{
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();
		LifeCycleUsingXml lifecyclexml = (LifeCycleUsingXml)context.getBean("lifecyclexml");
		System.out.println("Life Cycle Using Xml: "+lifecyclexml);
		
		System.out.println("*******************************************");
		LifeCycleUsingJavaInterface lifecycleinterface = (LifeCycleUsingJavaInterface)context.getBean("lifecycleinterface");
		System.out.println("Life Cycle Using Interface: "+lifecycleinterface);
		
		System.out.println("*******************************************");
		LifeCycleUsingAnnotations lifecycleannotation = (LifeCycleUsingAnnotations)context.getBean("lifecycleannotations");
		System.out.println("Life Cycle Using Annotation: "+lifecycleannotation);
	}
}