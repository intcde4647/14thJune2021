package com.cts.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String uname=request.getParameter("username");
	 String pass=request.getParameter("password");	 
     RequestDispatcher dispatcher=null; // IT will help in redirecting either to success or error page
      //depending on user's choice
     if(uname.equals("admin") && pass.equals("admin"))
     
     {
    	 dispatcher=request.getRequestDispatcher("success.jsp");
        
     }
     else
     {
    	 dispatcher=request.getRequestDispatcher("error.jsp");
    	 
     }
     dispatcher.forward(request, response);	 
     
	}

}
