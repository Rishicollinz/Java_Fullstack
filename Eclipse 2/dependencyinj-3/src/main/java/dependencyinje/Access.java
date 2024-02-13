package dependencyinje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Question q1=context.getBean(Question.class);
		q1.display();
		

	}

}
