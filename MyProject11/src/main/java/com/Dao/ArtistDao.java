package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Artist;
import com.util.ProjectUtil;

public class ArtistDao {
	public static void addArtist(Artist a) {
		try {
			Connection conn=ProjectUtil.creConnection();
			String sql="insert into artist(artist,artist_catogory,artist_name,ticket_price,artist_desc,artist_image) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, a.getArtist());
			pst.setString(2, a.getArtist_catogory());
			pst.setString(3, a.getArtist_name());
			pst.setInt(4, a.getTickit_price());
			pst.setString(5, a.getArtist_desc());
			pst.setString(6, a.getArtist_image());
			pst.executeUpdate();
		} catch (Exception e) {
               e.printStackTrace();
		 }
	}
}
