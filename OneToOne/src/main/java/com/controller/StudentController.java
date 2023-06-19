package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.bean.StudentInfo;
import com.dao.StudentDao;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action=request.getParameter("action");

		if(action.equalsIgnoreCase("insert"))
		{
			StudentInfo einfo=new StudentInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			StudentDao.insertStudent(einfo);
	    	
			Student e=new Student();
			e.setSubject(request.getParameter("subject"));
			e.setType(request.getParameter("type"));
			e.setId(einfo);
			
			StudentDao.insertStudent(e);                 
			response.sendRedirect("Show.jsp");
	    }
		else if(action.equalsIgnoreCase("edit")) {
			int sid=Integer.parseInt(request.getParameter("sid"));
			Student s=StudentDao.getStudent(sid);
			request.setAttribute("e", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			StudentInfo einfo=new StudentInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			Student e=new Student();
			
			e.setSid(Integer.parseInt(request.getParameter("sid")));
			e.setSubject(request.getParameter("subject"));
			e.setType(request.getParameter("type"));
			e.setId(einfo);
			
			StudentDao.insertStudent(e);                 
			response.sendRedirect("Show.jsp");
	    }
		else if(action.equalsIgnoreCase("delete")) {
			int sid=Integer.parseInt(request.getParameter("sid"));
			StudentDao.deleteStudent(sid);
			response.sendRedirect("Show.jsp");
			
		}
	}
}
