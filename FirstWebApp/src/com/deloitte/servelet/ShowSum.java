package com.deloitte.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/show1")
public class ShowSum extends HttpServlet{
	public static final long serialVersionUID = 1L;
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int a =Integer.parseInt(req.getParameter("t1"));
		int b =Integer.parseInt(req.getParameter("t2"));
		int sum=0;
		sum=a+b;
		
		//*  HttpSession ssn= req.getSession();
		//RequestDispatcher rd= req.getRequestDispatcher("cube");
		//*  ssn.setAttribute("sum", sum);
		//rd.forward(req,res);
		
		Cookie cookie = new Cookie("deloitte.sum", String.valueOf(sum)); //creating cookie
		res.addCookie(cookie);
		res.sendRedirect("cube?sum="+sum);
		
	}
	
}
