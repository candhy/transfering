package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String UserName=request.getParameter("uname").trim();
		String Password=request.getParameter("pwd").trim();
		
		
		RequestDispatcher dispatcher=null;
		
		
		if(UserName.length()>3 && Password.length()>3)
		{
			request.setAttribute("msg", "transfer");
			request.setAttribute("name", UserName);
			request.setAttribute("pass", Password);
			
	         dispatcher=request.getRequestDispatcher("/Servlet2");
	         dispatcher.include(request, response);
	         
	         String msg=(String) request.getAttribute("msg");
	         if(msg.equals("success"))
	         {
	        	 dispatcher=request.getRequestDispatcher(("/SuccessServlet"));
	        	 dispatcher.include(request, response);
	         }
	         else  if(msg.equals("failure"))
	         {
	        	 dispatcher=request.getRequestDispatcher(("/ErrorServlet"));
	        	 dispatcher.include(request, response);
	         }
	         
		 }else
		    {
			dispatcher=request.getRequestDispatcher("/ErrorServlet");
		   
	        dispatcher.include(request, response);
		    }
	}

}
