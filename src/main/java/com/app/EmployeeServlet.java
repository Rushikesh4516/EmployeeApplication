package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/emp")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String batch=request.getParameter("batch");
		String[]courses=request.getParameterValues("course");
		PrintWriter out=response.getWriter();
		out.print("<html><body><center>");
		out.print("<h1>Employee Details</h1><table>");

		out.print("<tr><td>Name:</td><td>"+name+"</td></tr>");
		out.print("<tr><td>email:</td><td>"+email+"</td></tr>");

		out.print("<tr><td>password:</td><td>"+pass+"</td></tr>");

		out.print("<tr><td>gender:</td><td>"+gender+"</td></tr>");

		out.print("<tr><td>batch:</td><td>"+batch+"</td></tr>");

		out.print("<tr><td>courses:</td><td>");

		for(String s:courses) {
			
			out.print(s+" ");
			
			
		}
		out.print("</td></tr></table></body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
