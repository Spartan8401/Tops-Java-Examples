package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.user1;
import com.util.ProjectUtil;

public class UserDao1 {
	public static void signup(user1 u ) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into user1(fname,lname,email,mobile,address,password,usertype) values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getPassword());
			pst.setString(7, u.getUsertype());
			pst.executeUpdate();
		} catch (Exception e) {

		   e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email)
	{
		boolean flag=false;
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from user1 where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
     public static user1 login(String email) {
    	 user1 u=null;
    	 try {
    	    Connection conn=ProjectUtil.creConnection();
 			String sql="Select * from user1 where email=?";
 			PreparedStatement pst=conn.prepareStatement(sql);
 			pst.setString(1, email);
 			ResultSet rs=pst.executeQuery();
 			if(rs.next()) {
 			     u=new user1();
 			     u.setUid(rs.getInt("uid"));
 			     u.setUsertype(rs.getString("usertype"));
 			     u.setFname(rs.getString("fname"));
 			     u.setLname(rs.getString("lname"));
 			     u.setEmail(rs.getString("email"));
 			     u.setMobile(rs.getString("mobile"));
 			     u.setAddress(rs.getString("address"));
 		    	 u.setPassword(rs.getString("password")); 			     			     
 			}
			
		} catch (Exception e) {
             e.printStackTrace();
		}
    	 return u;
    	 
     }
     
     public static void changePassword(String email,String password) {
    	 try {
			Connection conn=ProjectUtil.creConnection();
			String sql="update user1 set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, password);
			pst.setString(2, email);
			pst.executeUpdate();
		} catch (Exception e) {
            e.printStackTrace();
		}
     }

}
