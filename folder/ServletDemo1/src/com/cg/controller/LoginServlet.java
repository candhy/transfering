package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void init(ServletConfig config) throws ServletException {
		System.out.println(" in init");
		
	}

	
	public void destroy() {
		System.out.println("in destroy");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("in doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("in doPost");
		String UserName=request.getParameter("uname").trim();
		String password=request.getParameter("pwd").trim();
		
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		if(UserName.equals("admin")&&password.equals("admin123")) 
		{
		pw.print("<html><body>"
				+"<h3>"
				+"welcome "+UserName+" !"
				+"<br/>"
				+"todays date: "+LocalDate.now()
				+"</h3>"
				+"</body></html>");
		}
		else
		{
			pw.print("<html><body>"
					+"<h3>"
					+"<b>invalid username and password......enter the correct one</b> <br/>"
					+"<a href='index.html'>go to login page </a>"
					+"<br/>"
					+"</h3>"
					+"</body></html>");
		}
	}

}
