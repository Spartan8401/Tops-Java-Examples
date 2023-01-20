package com.Controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.Dao.ArtistDao;
import com.bean.Artist;

@WebServlet("/artistController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024 * 512) // 512MB

public class artistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String extractfilenameString(Part file) {
		String cd=file.getHeader("content-disposition");
		System.out.println(cd);//form-data; name="product_image; filename="any.jpg"
	    String[] items=cd.split(";");
	    for(String string : items) {
	    	if(string.trim().startsWith("filename")) {
	    		return string.substring(string.indexOf("=") + 2, string.length()-1);
	    	}
	    }
	    return "";
		}
    
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action=request.getParameter("action");
         if(action.equalsIgnoreCase("add consert")) {
        	 
        	 String savePath ="C:\\Users\\hpanc\\eclipse-workspace\\MyProject\\src\\main\\webapp\\artist_images";
        	 File fileSaveDir=new File(savePath);
        	 if(!fileSaveDir.exists()) {
        		 fileSaveDir.mkdir();
        	 }
        	 Part file1 =request.getPart("artist_image");
        	 String fileName=extractfilenameString(file1);
        	 file1.write(savePath + File.separator + fileName);
        	 String filePath = savePath + File.separator + fileName;
        	 
        	 String savePath2 = "C:\\Users\\hpanc\\eclipse-workspace\\MyProject11\\src\\main\\webapp\\artist_images";
        	 File imgSaveDir =new File(savePath2);
        	 if(imgSaveDir.exists()) {
        		 imgSaveDir.mkdir();
        	 }
        	 
        	 Artist a=new Artist();
        	 a.setArtist(Integer.parseInt(request.getParameter("artist")));
        	 a.setArtist_catogory(request.getParameter("artist_catogory"));
           	 a.setArtist_name(request.getParameter("artist_name"));
           	 a.setTickit_price(Integer.parseInt(request.getParameter("ticket_price")));
           	 a.setArtist_desc(request.getParameter("artist_desc"));
           	 a.setArtist_image(fileName);
           	 ArtistDao.addArtist(a);
           	 request.setAttribute("msg", "Artist Add Successfully");
           	 request.getRequestDispatcher("artist-add-consert.jsp").forward(request, response);
         }
        
	
	}
}
