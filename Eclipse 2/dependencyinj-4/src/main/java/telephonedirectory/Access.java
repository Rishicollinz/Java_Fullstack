package telephonedirectory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		TelephoneDir t=(TelephoneDir)con.getBean("telephoneDirectoryObject");
		System.out.println(t.getPhoneNumber());
		System.out.println(t.getPhoneNumber2());
		

	}

}
