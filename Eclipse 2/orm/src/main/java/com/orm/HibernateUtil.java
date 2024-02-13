package com.orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class HibernateUtil {
	static SessionFactory sessionfactory;
	static SessionFactory getSessionfactory() {
		if(sessionfactory ==null) {
			try {
				Configuration config=new Configuration();
				config.configure().addAnnotatedClass(Student.class);
				ServiceRegistry servicereg=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
				sessionfactory=config.buildSessionFactory(servicereg);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sessionfactory;
	}
}