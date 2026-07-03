package com.SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page1 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		int age     = Integer.parseInt(req.getParameter("age"));
		
		
		if(age >= 18) {
			//URL rewriting
			res.sendRedirect("page2?= " + name);
		}else {
			PrintWriter out = res.getWriter();
			out.println("<h1>Hi <u>"+name+"</u>, you are not eligible to vote.</h1>");
		}
	}
}
