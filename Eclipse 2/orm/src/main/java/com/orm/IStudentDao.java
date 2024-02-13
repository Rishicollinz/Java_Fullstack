package com.orm;

import java.util.List;

public interface IStudentDao {
	void saveStudent(Student student);
	void updateStudent(Student student);
	Student getStudentById(int id);
	List<Student> getAllStudents();
	void deleteStudent(int id);
	
}
