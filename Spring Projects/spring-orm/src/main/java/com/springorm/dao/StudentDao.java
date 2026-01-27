package com.springorm.dao;

import com.springorm.entities.Student;
//import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import java.util.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class StudentDao {
	
	
	//private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;
	
	@Transactional
	public int insert(Student student) {
		//Integer i = (Integer)this.hibernateTemplate.save(student);
		Session session = sessionFactory.getCurrentSession();
		Integer id = (Integer) session.save(student);
		return id;
	}
	
	@Transactional(readOnly = true)
	public Student getStudent(int studentId) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, studentId);
		return student;
	}
	
	@Transactional(readOnly = true)
	public List<Student> getStudents(){
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Student> cq = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root);
        System.out.println("Fetching all students...");
        return session.createQuery(cq).getResultList();
	}
	
	@Transactional
	public void deleteStudent(int studentId) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class,studentId);
        if (student != null) {
            session.remove(student); // Deletes the record
        }
	}
	
	@Transactional
	public void updateRecords(int studentId,String newStudentName,String newStudentCity){
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, studentId); // Fetch the entity
        if (student != null) {
            student.setStudentName(newStudentName); // Update fields
            student.setStudentCity(newStudentCity);
            session.merge(student); // Use `merge` to update the entity
            System.out.println("Student with ID " + studentId + " updated.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
