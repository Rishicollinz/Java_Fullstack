package com.dao;
import com.model.Student;
import java.util.*;

public interface StudentService {
	void addStu(Student stu);
	Student fetchStuById(int stuId);
	void delStuById(int stuId);
	void updateCourseById(String newCourse,int stuId);
	List<Student> fetchAllStudents();
}
