/*Thread safety in ServletContext*/
package com.Abhinav.InterviewPractice;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice2 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletContext ctx = getServletContext();
		Integer count;
		
		synchronized(ctx) {
			count = (Integer) ctx.getAttribute("count");
			if(count == null) {
				count = 0;
			}
			
			count += 1;
			ctx.setAttribute("count", count);
		}
		
		res.getWriter().println("Hits: " + count);
	}
}
