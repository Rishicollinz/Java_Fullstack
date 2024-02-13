package rec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Perimeter peri=(Perimeter)con.getBean("periObj");
		System.out.println(peri.getPerimeter());

	}

}
