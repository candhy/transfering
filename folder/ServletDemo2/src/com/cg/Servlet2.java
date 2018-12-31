package com.cg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		String message=(String) request.getAttribute("msg");
		String UserName=(String) request.getAttribute("name");
		String Password=(String) request.getAttribute("pass");
		if(UserName.equals("admin") && Password.equals("admin123") && message.equals("transfer"))
		{
			request.setAttribute("msg", "Success");
		}
		else
		{
			request.setAttribute("msg", "failure");
		}
		
	}
}



