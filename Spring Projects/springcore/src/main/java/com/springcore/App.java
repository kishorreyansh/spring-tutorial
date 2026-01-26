package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Application Starts!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student)context.getBean("studentObject");
        Student student1 = (Student)context.getBean("studentObject1");
        Student student2 = (Student)context.getBean("studentObject2");
        System.out.println("Student Object: "+student);
        System.out.println("Student Object1: "+student1);
        System.out.println("Student Object2: "+student2);

    }
}
