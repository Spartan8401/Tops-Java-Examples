package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.WishList1;
import com.util.ProjectUtil;

public class WishListDao1 {
	
	public static void add_to_wishlist(WishList1 w) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into wishlist1(pid,uid) values(?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setInt(1, w.getPid());
	        pst.setInt(2, w.getUid());
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}
	
	public static void remove_from_wishlist(WishList1 w) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="delete from wishlist1 where pid=? and uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setInt(1, w.getPid());
	        pst.setInt(2, w.getUid());
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}
	
	public static List<WishList1> getWishlistsByUser(int uid){
		List<WishList1> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from wishlist1 where uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				WishList1 w=new WishList1();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
		} catch (Exception e) {
            e.printStackTrace();
		}
		return list;
	}
	public static boolean cheakWishlist(int uid,int pid) {
	   boolean	flag=false;
	   try {
		    Connection conn=ProjectUtil.creConnection();
		    String sql="select * from wishlist1 where uid=? and pid=?";
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

}
