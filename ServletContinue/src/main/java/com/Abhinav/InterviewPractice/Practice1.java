/*What if both service() and doGet() are overridden, which one is executed ?*/

package com.Abhinav.InterviewPractice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1 extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Service method called");
		super.service(req, res);
		res.getWriter().println("Service method called");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("get called");
		res.getWriter().println("Get method called");
	}

}
