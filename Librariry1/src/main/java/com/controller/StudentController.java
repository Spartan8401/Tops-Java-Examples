package com.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Student;
import com.dao.StudentDao;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String action = request.getParameter("action");
	      if(action.equalsIgnoreCase("insert")) {
	    	  Student s=new Student();
	    	  s.setBname(request.getParameter("bname"));
	    	  s.setAname(request.getParameter("aname"));
	    	  s.setQuntity(request.getParameter("quntity"));
	    	  s.setPrize(request.getParameter("prize"));
	    	  s.setIssuedate(request.getParameter("issuedate"));
	    	  s.setSubmitedate(request.getParameter("submitedate"));
	    	  
	    	  StudentDao.insertStudent(s);
	    	  request.setAttribute("msg", "Data Insert Successfully");
	    	  request.getRequestDispatcher("Show.jsp").forward(request, response);
	      }
	      else if(action.equalsIgnoreCase("edit")) {
	    	  int id=Integer.parseInt(request.getParameter("id"));
	    	  Student s=StudentDao.getStudents(id);
	    	  request.setAttribute("s", s);
	    	 request.getRequestDispatcher("update.jsp").forward(request, response);
	      }
	      
	      else if(action.equalsIgnoreCase("update")) {
	    	  Student s=new Student();
	    	  s.setId(Integer.parseInt(request.getParameter("id")));
	    	  s.setBname(request.getParameter("bname"));
	    	  s.setAname(request.getParameter("aname"));
	    	  s.setQuntity(request.getParameter("quntity"));
	    	  s.setPrize(request.getParameter("prize"));
	    	  s.setIssuedate(request.getParameter("issuedate"));
	    	  s.setSubmitedate(request.getParameter("submitedate"));
	    	  StudentDao.updateStudent(s);
	    	  response.sendRedirect("Show.jsp");
	      }
	      else if(action.equalsIgnoreCase("delete")) {
	    	  int id=Integer.parseInt(request.getParameter("id"));
	    	  StudentDao.deleteStudent(id);
	    	  response.sendRedirect("Show.jsp");
	    	  
	      }
	}

}
