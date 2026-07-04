package com.Abhinav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page1 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		ServletContext ctx = getServletContext();
		String data = ctx.getInitParameter("Name");
		
		ServletConfig config = getServletConfig();
		String configData = config.getInitParameter("page1");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>Example of ServletContext Page1</h1>");
		out.println("<h2><u>"+ data +"</u></h2>");
		
		out.println("<h1>Example of ServletConfig Page1</h1>");
		out.println("<h2><u>"+ configData +"</u></h2>");
		
	}
}
