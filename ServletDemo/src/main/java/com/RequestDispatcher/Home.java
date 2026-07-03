package com.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Home extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			PrintWriter out = res.getWriter();
			String uname = (String) req.getAttribute("uname");
			
			out.println("<h1>Login Successfull</h1>");
			out.println("\n");
			out.print("<h1>Welcome <u>" + uname + "</u></h1>");
			
		}
}
