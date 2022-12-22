package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bin.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		try {
			Connection conn = StudentUtil.creatConnection();
			String sql = "insert into stu(fname,lname,email,mobile,address,gender) value(?,?,?,?,?,?) ";
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
		public static List<Student> getAllStudents(){
			List<Student>  List=new ArrayList<Student>();
			try {
				Connection conn=StudentUtil.creatConnection();
				String sql="Select * from Stu";
				PreparedStatement pst=conn.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					Student s=new Student();
					s.setId(rs.getInt("id"));
					s.setFname(rs.getString("fname"));
					s.setLname(rs.getString("lname"));
					s.setEmail(rs.getString("email"));
					s.setAddress(rs.getString("Address"));
				    s.setMobile(rs.getString("mobile"));
				    List.add(s);
				}
			} catch (Exception e) {
                e.printStackTrace();
			}
			return List;
		}
	

}
