package com.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.StudentDao;
import com.model.Student;

public class StudentDaoImpl implements StudentDao {
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate=new JdbcTemplate(datasource);
	}

	public void insertStu(Student stu) {
		// TODO Auto-generated method stub
		String s="insert into student(sname,course,fee) values(?,?,?)";
		int insert=jdbcTemplate.update(s, new Object[] {stu.getSname(),stu.getCourse(),stu.getFee()});
		if(insert>0) {
			System.out.println("Data inserted");
		}
		
	}

	public Student getStuById(int stuId) {
		// TODO Auto-generated method stub
		String s="select * from student where id=?";
		Student stu=jdbcTemplate.queryForObject(s, new StudentRowMapper(),stuId);
		return stu;
	}

	public void deleteStuById(int stuId) {
		// TODO Auto-generated method stub
		String s="delete from student where id=?";
		int q=jdbcTemplate.update(s, stuId);
		if(q>0) {
			System.out.println("Deleted the data successfully");
		}
		
		
	}

	public void updateStuCourseById(String newCourse, int stuId) {
		// TODO Auto-generated method stub
		String s="update student set course=? where id=?";
		int q=jdbcTemplate.update(s, newCourse, stuId);
		if(q>0) {
			System.out.println("Updated the data successfully");
		}
		
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String s="select * from student";
		List<Student> stus=jdbcTemplate.query(s, new StudentRowMapper());
		return stus;
	}
	
	
	
	
}
