package com.dao;

import com.model.Student;
import java.util.*;

public interface StudentDao {
	void insertStu(Student stu);
	Student getStuById(int stuId);
	void deleteStuById(int stuId);
	void updateStuCourseById(String newCourse,int stuId);
	List<Student> getAllStudents();

}
