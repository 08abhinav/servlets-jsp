package com.SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page2 extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.println("<h1>Hi <u>"+name+"</u>, you are eligible to vote.</h1>");
	}
}
