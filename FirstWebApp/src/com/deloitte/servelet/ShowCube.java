package com.deloitte.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cube")
public class ShowCube extends HttpServlet
{
	//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
  {
    //* HttpSession ssn= req.getSession(); // session is for a particular browser..does not work in any other
	
	  int sum=0;
	  Cookie[] cookies= req.getCookies();
	  for(Cookie ck:cookies)
	  {
		  if(ck.getName().equals("deloitte.sum"))
		  {
			  sum= Integer.parseInt(ck.getValue());
			  break;
		  }
	  }
	//* int sum= (int)ssn.getAttribute("sum");
	//int sum= (int)req.getAttribute("sum");
	//int sum= Integer.parseInt(req.getParameter("sum"));
	  
	  
	int cube=0;
	cube= sum*sum*sum;
	HttpSession ssn= req.getSession();
	ssn.setAttribute("cube", cube);
	res.sendRedirect("jspFileDemo.jsp");
    
	
	
//*	PrintWriter out= res.getWriter();
//*	out.println("<div>");
//*  out.println("Answer= "+cube);
	
	
	//res.getWriter().println("Sum = "+sum);
	//res.getWriter().println("<br><br>Cube = "+cube);
	//ssn.invalidate(); // closing the session
  }
}

