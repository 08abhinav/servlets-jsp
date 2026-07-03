package com.SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Page1 extends HttpServlet{
	private final String tempPassword = "123456789";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Cookies
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(password.equals(tempPassword)) {
			Cookie cookie = new Cookie("name", name);
			res.addCookie(cookie);
			res.sendRedirect("page2");
		}else {
			PrintWriter out = res.getWriter();
			out.println("<h1> Invalid Password </h1>");
		}
		
		
		
		//Session Management
//		String name = req.getParameter("name");
//		String password = req.getParameter("password");
//		
//		HttpSession session = req.getSession();
//		
//		if(password.equals(tempPassword)) {
//			session.setAttribute("name", name);
//			res.sendRedirect("page2");
//		}else {
//			PrintWriter out = res.getWriter();
//			out.println("<h1> Invalid Password </h1>");
//		}

		
		//URL rewriting
//		String name = req.getParameter("name");
//		int age     = Integer.parseInt(req.getParameter("age"));
		
//		if(age >= 18) {
//			res.sendRedirect("page2?= " + name);
//		}else {
//			PrintWriter out = res.getWriter();
//			out.println("<h1>Hi <u>"+name+"</u>, you are not eligible to vote.</h1>");
//		}
		
		
	}
}
