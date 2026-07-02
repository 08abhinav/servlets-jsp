package com.Abhinav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle implements Servlet{
	
	ServletConfig config = null;
	
	public void init(ServletConfig sc) {
		config = sc;
		System.out.println("inside init");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<h1>Hello from Service method invoked from Servlet's lifecycle</h1>");
		System.out.println("inside service");
		
	}
	
	public void destroy()
    {
        System.out.println("in destroy");
    }
	
    public String getServletInfo()
    {
        return "LifeCycleServlet";
    }
    
    public ServletConfig getServletConfig()
    {
        return config; 
    }
	
}
