package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		StudentListAccessor sla=con.getBean(StudentListAccessor.class);
		System.out.println(sla.getThirdStudentInList().getName()+" "+sla.getThirdStudentInList().getMarks());
		List<Student> failedstudents=sla.getFailedStudent();
		System.out.println("Failed students:");
		for(Student s:failedstudents) {
			System.out.println(s.getName()+" "+s.getMarks());
		}
		List<String> snames=sla.getStudentNames();
		System.out.println("student names:");
		for(String s:snames) {
			System.out.println(s);
		}
		
		

	}

}
