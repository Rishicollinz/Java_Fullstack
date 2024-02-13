package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=con.getBean("emp1",Employee.class);
		Employee emp2=con.getBean("emp2",Employee.class);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpEmail()+" "+emp.getPancard1());
		System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+" "+emp2.getEmpEmail()+" "+emp2.getPancard2());
		

	}

}
