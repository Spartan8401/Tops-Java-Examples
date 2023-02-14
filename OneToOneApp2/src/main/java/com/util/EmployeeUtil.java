package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.EmployeeInfo;
import com.bean.Employees;

public class EmployeeUtil {
	
	public static Session createSession() {
		
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(EmployeeInfo.class)
				.addAnnotatedClass(Employees.class)
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}

}
