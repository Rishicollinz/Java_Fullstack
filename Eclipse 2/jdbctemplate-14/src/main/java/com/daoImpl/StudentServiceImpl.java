package com.daoImpl;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentService;
import com.model.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void addStu(Student stu) {
		// TODO Auto-generated method stub
		studentDao.insertStu(stu);
		
	}

	public Student fetchStuById(int stuId) {
		// TODO Auto-generated method stub
		return studentDao.getStuById(stuId);
	}

	public void delStuById(int stuId) {
		// TODO Auto-generated method stub
		studentDao.deleteStuById(stuId);
		
	}

	public void updateCourseById(String newCourse, int stuId) {
		// TODO Auto-generated method stub
		studentDao.updateStuCourseById(newCourse, stuId);
		
	}

	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}
	
	
}
