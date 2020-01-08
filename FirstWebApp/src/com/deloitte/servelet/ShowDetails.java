package com.deloitte.servelet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/show")
public class ShowDetails extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String name= req.getParameter("txtname");
		String gender= req.getParameter("gender");
		List<String> langs= Arrays.asList(req.getParameterValues("cbLang"));
		String country= req.getParameter("country");
		
		Person p1= new Person(name, gender, langs, country);
		
		RequestDispatcher rd= req.getRequestDispatcher("view.jsp");
		req.setAttribute("person", p1);
		rd.forward(req, res);
		
		
		
// No need to print here. send the values from this servlet to jsp and print it there to make it beautiful
//		PrintWriter out= res.getWriter();
//		out.println("Name : "+name+"<br><br>");
//		out.println("Gender : "+gender+"<br><br>");
//		out.println("Languages : ");
//		langs.forEach((l)->out.println(l));
//		out.println("<br><br>Country : "+country);
	}
	
}
