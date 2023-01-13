package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.ProjectUtil;

public class WishListDao {

	public static void add_to_wishlist(Wishlist w) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into wishlist(pid,uid) values(?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
	        pst.setInt(1, w.getPid());
	        pst.setInt(2, w.getUid());
	        pst.executeUpdate();
		} catch (Exception e) {
                e.printStackTrace();
		 }
		
				
	}
	
	public static List<Wishlist> getWishlistsByUser(int uid){
		List<Wishlist> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from wishlist where uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Wishlist w=new Wishlist();
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
}
