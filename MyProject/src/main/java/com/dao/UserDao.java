package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.user;
import com.util.ProjectUtil;

public class UserDao {
	public static void signup(user u ) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into user(fname,lname,email,mobile,address,password) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {

		   e.printStackTrace();
		}
	}

}
