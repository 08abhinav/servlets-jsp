package com.Abhinav.InterviewPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice3 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setAttribute("id", 100);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view.jsp");
		rd.forward(req, res);
	}

}
