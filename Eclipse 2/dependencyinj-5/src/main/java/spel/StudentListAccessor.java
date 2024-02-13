package spel;

import java.util.*;
public class StudentListAccessor {
	Student thirdStudentInList;
	List<Student> failedStudent;
	List<String> studentNames;
	public Student getThirdStudentInList() {
		return thirdStudentInList;
	}
	public void setThirdStudentInList(Student thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}
	public List<Student> getFailedStudent() {
		return failedStudent;
	}
	public void setFailedStudent(List<Student> failedStudent) {
		this.failedStudent = failedStudent;
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	
}
