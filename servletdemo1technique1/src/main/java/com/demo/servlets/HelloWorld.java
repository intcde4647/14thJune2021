package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// What kind of content we want to send to the client ( browser)
		   response.setContentType("text/html");
		   PrintWriter pw=response.getWriter();
		   pw.print("<html>");
		   pw.print("<body>");
		   pw.print("<b>Hello World!!!!!</b>");
		   pw.print("</body>");
		   pw.print("</html>");
		   pw.close();
		
	}

}
