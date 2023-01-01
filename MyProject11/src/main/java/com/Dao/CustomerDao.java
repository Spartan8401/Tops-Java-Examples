package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Customer;
import com.util.ProjectUtil;

public class CustomerDao {
	public static void signup(Customer c ) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into customer(fname,lname,email,mobile,address,password) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, c.getFname());
			pst.setString(2, c.getLname());
			pst.setString(3, c.getEmail());
			pst.setString(4, c.getMobile());
			pst.setString(5, c.getAddress());
			pst.setString(6, c.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {

		   e.printStackTrace();
		}
		
	}
	 public static boolean checkEmail(String email) {
    	 boolean flag=false;
    	 try {
			Connection conn=ProjectUtil.creConnection();
			String sql="Select * from user where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, "email");
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				flag=true;
			}
			
			
		} catch (Exception e) {
            e.printStackTrace();
		}
    	 return flag;
     }
     public static Customer login(String email) {
    	 Customer u=null;
    	 try {
    	    Connection conn=ProjectUtil.creConnection();
 			String sql="Select * from user where email=?";
 			PreparedStatement pst=conn.prepareStatement(sql);
 			pst.setString(1, email);
 			ResultSet rs=pst.executeQuery();
 			if(rs.next()) {
 			     u=new Customer();
 			     u.setCid(rs.getInt("uid"));
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
	

}
