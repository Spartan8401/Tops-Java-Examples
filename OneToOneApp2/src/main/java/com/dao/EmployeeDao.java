package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.EmployeeInfo;
import com.bean.Employees;
import com.util.EmployeeUtil;

public class EmployeeDao {

	public static void insertEmployeeinfo(EmployeeInfo e) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
	
	public static void insertEmployees(Employees e) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
	public static List<EmployeeInfo> getAllEmployeeInfo(int epid){
		Session session=EmployeeUtil.createSession();
		List<EmployeeInfo> list=session.createQuery("from EmployeeInfo").list();
		session.close();
		return list;
	}
	public static List<Employees> getAllEmployees(int eid){
		Session session=EmployeeUtil.createSession();
		List<Employees> list=session.createQuery("from Employees").list();
		session.close();
		return list;
	}
	public static EmployeeInfo getEmployeeInfo(int epid) {
		Session session=EmployeeUtil.createSession();
		EmployeeInfo  s=session.get(EmployeeInfo.class, epid);
		session.close();
		return s;
	}
	public static Employees getEmployees(int eid) {
		Session session=EmployeeUtil.createSession();
		Employees  s=session.get(Employees.class, eid);
		session.close();
		return s;
	}
}
