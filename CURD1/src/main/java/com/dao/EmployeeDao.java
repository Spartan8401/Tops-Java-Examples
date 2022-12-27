package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bin.Employee;
import com.util.EmployeeUtil;


public class EmployeeDao {
	public static void insertEmployee(Employee s) {
		try {
			Connection conn = EmployeeUtil.creatConnection();
			String sql="insert into employee(fname,lname,email,mobile,address,gender) value(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setString(6, s.getGender());
			pst.executeUpdate();
		} catch (Exception e) {
            e.printStackTrace();
		}
	}

}
