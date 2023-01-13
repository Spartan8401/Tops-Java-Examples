package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.util.ProjectUtil;

public class ProductDao {
    
	public static void addProduct(Product p) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into product(seller,product_category,product_name,product_price,product_desc,product_image) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, p.getSeller());
			pst.setString(2, p.getProduct_category());
			pst.setString(3, p.getProduct_name());
			pst.setInt(4, p.getProduct_price());
			pst.setString(5, p.getProduct_desc());
			pst.setString(6, p.getProduct_image());
			pst.executeUpdate();
		} catch (Exception e) {
               e.printStackTrace();
		 }
	}
	public static List<Product> getProductsBySeller(int seller){
		List<Product> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from product where seller=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, seller);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSeller(rs.getInt("seller"));
                p.setProduct_category(rs.getString("product_category"));
                p.setProduct_name(rs.getString("product_name"));
                p.setProduct_price(rs.getInt("product_price"));
                p.setProduct_desc(rs.getString("product_desc"));
                p.setProduct_image(rs.getString("product_image"));
                list.add(p);
			}
		} catch (Exception e) {
             e.printStackTrace();
		}
		return list;
	}
	public static Product getProductsByPid(int pid){
		Product p = null;
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSeller(rs.getInt("seller"));
                p.setProduct_category(rs.getString("product_category"));
                p.setProduct_name(rs.getString("product_name"));
                p.setProduct_price(rs.getInt("product_price"));
                p.setProduct_desc(rs.getString("product_desc"));
                p.setProduct_image(rs.getString("product_image"));
			}
		} catch (Exception e) {
             e.printStackTrace();
		}
		return p;
	}
	public static void updateProduct(Product p) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="update product set product_category=?,product_name=?,product_price=?,product_desc=?,product_image=? where seller=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, p.getProduct_category());
			pst.setString(2, p.getProduct_name());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_desc());
			pst.setString(5, p.getProduct_image());
			pst.setInt(6, p.getSeller());
			pst.setInt(7, p.getPid());
			pst.executeUpdate();
		} catch (Exception e) {
               e.printStackTrace();
		 }
	}
	public static void deleteProductsByPid(int pid){
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="delete from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
		} catch (Exception e) {
             e.printStackTrace();
		}
	}

	public static List<Product> getAllProducts(){
		List<Product> list=new ArrayList<>();
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="select * from product";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSeller(rs.getInt("seller"));
                p.setProduct_category(rs.getString("product_category"));
                p.setProduct_name(rs.getString("product_name"));
                p.setProduct_price(rs.getInt("product_price"));
                p.setProduct_desc(rs.getString("product_desc"));
                p.setProduct_image(rs.getString("product_image"));
                list.add(p);
			}
		} catch (Exception e) {
             e.printStackTrace();
		}
		return list;
	}
}
