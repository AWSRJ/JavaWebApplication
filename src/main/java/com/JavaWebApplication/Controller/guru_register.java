package com.JavaWebApplication.Controller;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class guru_register
 */
public class guru_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public guru_register() {
	     super();
     }
    
   /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getWriter().append("Served at: ").append(request.getContextPath());
  } 


  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
		PrintWriter out = response.getWriter();
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		out.println(first_name);
		out.println(last_name);
		out.println(username);
		
	}
 
}
