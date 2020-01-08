package com.deloitte.servelet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show2")
public class ShowServelet extends HttpServlet{
 
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name= req.getParameter("t1");
		res.getWriter().println("Hello "+name);
	}
	
}
