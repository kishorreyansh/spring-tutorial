package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class AppJdbcConfigMain 
{
    public static void main( String[] args )
    {
        System.out.println( "My Spring JDBC Starts....." );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
        
        
        // Insert into DB
        Student student1 = new Student();
        student1.setId(17041);
        student1.setName("Abhishek Sharma");
        student1.setCity("Hyderabad");
        
        int result1 = studentdao.insert(student1);
        System.out.println("Record Inserted in DB"); 
        
        //Update in DB
        /*Student student2 = new Student();
        student2.setId(1704);
        student2.setName("Abhishek Sharma SRH");
        student2.setCity("India");
        int change = studentdao.change(student2);
        System.out.println("Recorded Updated");*/
        
        //Delete in DB
        /*Student student3 = new Student();
        int delete = studentdao.delete(849);
        System.out.println("Record Deleted");*/
        
        //Fetch Single Record
        /*Student singleRecord = studentdao.fetchSingleRecords(23);
        System.out.println(singleRecord);*/
        
        //Fetch Multiple Record
        /*List<Student> allStudents = studentdao.getAllStudents();
        for(Student s: allStudents) {
        	System.out.println(s);
        }*/
        
    }
}
