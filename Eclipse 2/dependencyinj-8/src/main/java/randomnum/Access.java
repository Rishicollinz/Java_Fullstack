package randomnum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		RandomNumberGenerator rng=con.getBean(RandomNumberGenerator.class);
		System.out.println(rng.getRandomNumber());
		System.out.println(rng.getPi());
		System.out.println(rng.getDataFromAnotherClass());
		System.out.println(rng.getGetValueFromAnotherFunction());

	}

}
