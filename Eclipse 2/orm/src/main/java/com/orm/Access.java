package com.orm;

import java.util.List;

public class Access {

	public static void main(String[] args) {
		IStudentDao studentDao=new StudentDao();
//		Student student=new Student("Mouli","S","mouli@gmail.com");
//		Student student1=new Student("Mohammed","Jammer","jammer@gmail.com");
//		studentDao.saveStudent(student);
//		studentDao.saveStudent(student1);
		
		List<Student> s1=studentDao.getAllStudents();
		for(Student s:s1) {
			System.out.println(s);
		}
//		Student student3=studentDao.getStudentById(student.getId());
//		System.out.println(student3);
//		
//		student.setFirstName("Rishi");
//		studentDao.updateStudent(student);
		
//		studentDao.deleteStudent(19);
		
	}

}
