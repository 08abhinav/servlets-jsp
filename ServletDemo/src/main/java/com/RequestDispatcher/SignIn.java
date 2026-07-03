package com.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignIn extends HttpServlet{
	private final String tempPassword = "123456789";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String uname    = req.getParameter("uname");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if(password.equals(tempPassword)) {
			req.setAttribute("uname", uname);
			req.getRequestDispatcher("home").forward(req, res);
		}else {
			out.println("Invalid password");
		}
	}

}
