package coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		BookCollection bcoll=(BookCollection)con.getBean("fantasy");
		BookCollection bcoll2=(BookCollection)con.getBean("fantasy2");
		System.out.println("Collection:");
		for(Book a:bcoll.getBookList()) {
			System.out.println(a.getBookId()+" "+a.getBookName());
		}
		for(Book a:bcoll2.getBookList()) {
			System.out.println(a.getBookId()+" "+a.getBookName());
		}
		System.out.println();
		BookLibrary bl=(BookLibrary)con.getBean("bl1");
		BookLibrary b2=(BookLibrary)con.getBean("bl2");
		System.out.println("Library:");
		for(Book a:bl.getAllBooks()) {
			System.out.println(a.getBookId()+" "+a.getBookName());
		}
		System.out.println("First Book");
		System.out.println(bl.getGetFirstBook().getBookId()+" "+bl.getGetFirstBook().getBookName());
		
		System.out.println();
		
		for(Book a:b2.getAllBooks()) {
			System.out.println(a.getBookId()+" "+a.getBookName());
		}
		System.out.println("First Book");
		System.out.println(b2.getGetFirstBook().getBookId()+" "+b2.getGetFirstBook().getBookName());
	}

}
