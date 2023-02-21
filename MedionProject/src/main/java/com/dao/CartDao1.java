package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart1;
import com.util.ProjectUtil;

public class CartDao1 {
	public static void addTocart1(Cart1 c) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into cart1(uid,pid,product_price,product_qty,total_price,payment_status) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getPid());
			pst.setInt(3, c.getProduct_price());
			pst.setInt(4, c.getProduct_qty());
			pst.setInt(5, c.getTotal_price());
			pst.setString(6, c.getPayment_status());
			pst.executeUpdate();
			
		} catch (Exception e) {
             e.printStackTrace();
		 
		}
	}
	
	public static List<Cart1> getcart1ByUser(int uid){
		String payment_status="pending";
		List<Cart1> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from cart1 where uid=? and payment_status=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Cart1 c=new Cart1();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setPid(rs.getInt("pid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
		return list;
	}
	
	public static List<Cart1> getMyOrder(int uid){
		String payment_status="paid";
		List<Cart1> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from cart1 where uid=? and payment_status=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Cart1 c=new Cart1();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setPid(rs.getInt("pid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
		return list;
	}
	public static boolean cheakcart1(int uid,int pid) {
		   boolean	flag=false;
		   try {
			    Connection conn=ProjectUtil.creConnection();
			    String sql="select * from cart1 where uid=? and pid=?";
			    PreparedStatement pst=conn.prepareStatement(sql);
			    pst.setInt(1, uid);
			    pst.setInt(2, pid);
			    ResultSet rs=pst.executeQuery();
			    if(rs.next()) {
			    	flag=true;
			    }
		} catch (Exception e) {
	        e.printStackTrace();
		}
		   return flag;
			
		}
	
	public static void remove_from_cart1(int uid,int pid) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="delete from cart1 where pid=? and uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setInt(1, pid);
	        pst.setInt(2, uid);
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}
	public static Cart1 getcart1ByCid(int cid){
        Cart1 c=null;
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from cart1 where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
			    c=new Cart1();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setPid(rs.getInt("pid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
		return c;
	}
	
	public static void updatecart1(int cid,int product_qty,int total_price) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="update cart1 set  product_qty=?,total_price=? where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setInt(1, product_qty);
	        pst.setInt(2, total_price);
	        pst.setInt(3, cid);
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}
	public static void updatePaymentStatus(int cid) {
		String payment_status="paid";
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="update cart1 set  payment_status=? where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setString(1, payment_status);
	        pst.setInt(2, cid);
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}

}
