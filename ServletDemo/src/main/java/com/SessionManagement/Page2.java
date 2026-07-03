package com.SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Page2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Cookie
		
		Cookie cookie[] = req.getCookies();

		PrintWriter out = res.getWriter();
		
		if(cookie.length != 0) {
			for(Cookie c : cookie) {
				out.println("<h1>Welcome <u> "+c.getValue()+"</u></h1>");
			}
		}else {
			out.println("<h1>Unauthenticated</h1>");
		}
		
		
		
		
		
		//Session Management
		
//		HttpSession session = req.getSession();
//
//		String name = (String) session.getAttribute("name");
//		
//		PrintWriter out = res.getWriter();
//		out.println("<h1>Welcome <u>"+name+"</u></h1>");
	
	
//		URL rewriting
//		String name = req.getParameter("name");
//		PrintWriter out = res.getWriter();
//		out.println("<h1>Hi <u>"+name+"</u>, you are eligible to vote.</h1>");
	}
}
