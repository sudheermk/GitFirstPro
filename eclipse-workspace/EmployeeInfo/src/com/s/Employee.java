package com.s;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		if(uname.equals("sudheer") && password.equals("s"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/sucess.jsp");
			rd.forward(request, response);
		}
		
	}

	
}
