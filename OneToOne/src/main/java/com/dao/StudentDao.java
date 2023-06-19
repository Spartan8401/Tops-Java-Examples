package com.dao;

import java.util.List;

import com.bean.Student;
import com.bean.StudentInfo;
import com.util.StudentUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
	public static void insertStudent(StudentInfo e) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		
	}
	public static void insertStudent(Student e) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		
	}
	public static List<Student> getAllStudent(){
		Session session=StudentUtil.createSession();
		List<Student> list=session.createQuery("from Student").list();
		session.close();
		return list;
	}
	public static Student getStudent(int sid) {
		Session session=StudentUtil.createSession();
		Student s=session.get(Student.class, sid);
		session.close();
		return s;
	}

	public static void deleteStudent(int sid) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		Student s=session.get(Student.class, sid);
		session.delete(s);
		tr.commit();
		session.close();
		
	}

}
