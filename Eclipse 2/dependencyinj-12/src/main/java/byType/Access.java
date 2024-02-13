package byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=con.getBean("emp1",Employee.class);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpEmail()+" "+emp.getPancard1());
		

	}
}
