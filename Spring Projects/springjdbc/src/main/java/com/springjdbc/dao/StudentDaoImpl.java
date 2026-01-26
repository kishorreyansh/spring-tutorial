package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int update = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}

	@Override
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int delete = jdbcTemplate.update(query,studentId);
		return delete;
	}

	@Override
	public Student fetchSingleRecords(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student studentRecord = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return studentRecord;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	//Anonymous Class
	/*public Student fetchSingleRecords(int studentId) {
		String query = "select * from student where id=?";
		Student studentRecord = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
			
		}, studentId);
		return studentRecord;
	}*/
	
	
	
	

}
