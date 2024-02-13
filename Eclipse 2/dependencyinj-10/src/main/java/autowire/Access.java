package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=con.getBean(Employee.class);
		System.out.println(emp.getEmpId()+"\n"+ emp.getEmpName()+"\n"+ emp.getEmpEmail()+"\n"+ emp.getPancard());
	}
}
