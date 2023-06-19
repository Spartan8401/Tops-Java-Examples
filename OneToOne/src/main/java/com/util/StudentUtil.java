package com.util;

import com.bean.Student;
import com.bean.StudentInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentUtil {

public static Session createSession() {
		
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(StudentInfo.class)
				.addAnnotatedClass(Student.class)
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}
}
