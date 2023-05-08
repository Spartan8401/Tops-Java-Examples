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
			String sql = "insert into lib(bname,aname,quntity,prize,issuedate,submitedate) value(?,?,?,?,?,?) ";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getBname());
			pst.setString(2, s.getAname());
			pst.setString(3, s.getQuntity());
			pst.setString(4, s.getPrize());
			pst.setString(5, s.getIssuedate());
			pst.setString(6, s.getSubmitedate());
			
			pst.executeUpdate();
		} catch (Exception e) {
              e.printStackTrace();
		}
	}
		public static List<Student> getAllStudents(){
			List<Student>  List=new ArrayList<Student>();
			try {
				Connection conn=StudentUtil.creatConnection();
				String sql="Select * from lib";
				PreparedStatement pst=conn.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					Student s=new Student();
					s.setId(rs.getInt("id"));
					s.setBname(rs.getString("bname"));
					s.setAname(rs.getString("aname"));
					s.setQuntity(rs.getString("quntity"));					
				    s.setPrize(rs.getString("prize"));
				    s.setIssuedate(rs.getString("issuedate"));
				    s.setSubmitedate(rs.getString("submitedate"));
				    
				    List.add(s);
				}
			} catch (Exception e) {
                e.printStackTrace();
			}
			return List;
		}
		public static Student getStudents(int id){
			Student s=null;
			try {
				Connection conn=StudentUtil.creatConnection();
				String sql="Select * from lib where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					s=new Student();
					s.setId(rs.getInt("id"));
					s.setBname(rs.getString("bname"));
					s.setAname(rs.getString("aname"));
					s.setQuntity(rs.getString("quntity"));					
				    s.setPrize(rs.getString("prize"));
				    s.setIssuedate(rs.getString("issuedate"));
				    s.setSubmitedate(rs.getString("submitedate"));
				    
				   
				  
				   
				}
			} catch (Exception e) {
                e.printStackTrace();
			}
			return s;
		}
		public static void updateStudent(Student s) {
			try {
				Connection conn =StudentUtil.creatConnection();
				String sql="update lib set bname=?,aname=?,quntity=?,prize=?,issuedate=?,submitedate=? where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1, s.getBname());
				pst.setString(2, s.getAname());
				pst.setString(3, s.getQuntity());
				pst.setString(4, s.getPrize());
				pst.setString(5, s.getIssuedate());
				pst.setString(6, s.getSubmitedate());
                pst.setInt(7, s.getId());
				pst.executeUpdate();
			} catch (Exception e) {
                e.printStackTrace();
			}
		}
		
		public static void deleteStudent(int id) {
			try {
				Connection conn=StudentUtil.creatConnection();
				String sql="delete from lib where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
				
				
						
				
			} catch (Exception e) {
                e.printStackTrace();
			}
		}
	

}
