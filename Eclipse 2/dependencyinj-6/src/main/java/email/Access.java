package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		EmailValidator ev=con.getBean(EmailValidator.class);
		System.out.println(ev.getIsValidEmail());
	}
}
