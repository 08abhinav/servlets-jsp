package com.Abhinav.MVCDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Abhinav.MVCDemo.Model.StudentModel;

public class Controller extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("sname");
		int age = Integer.parseInt(req.getParameter("sage"));
		int mobile = Integer.parseInt(req.getParameter("smobile"));
		String add = req.getParameter("sadd");
		
		StudentModel sm = new StudentModel();
		sm.setName(name);
		sm.setAge(age);
		sm.setMobile(mobile);
		sm.setAddress(add);
		
		req.setAttribute("studentdata", sm);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/student.jsp");
		rd.forward(req, res);
	}
}
