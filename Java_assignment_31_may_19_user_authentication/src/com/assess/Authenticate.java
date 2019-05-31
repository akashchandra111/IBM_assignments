package com.assess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//Static username: akash, password: nopass
		if(request.getParameter("username")!=null && request.getParameter("username").equals("akash") && request.getParameter("password").equals("nopass"))	{
			response.getWriter().append("User Authenticated!");
			request.getRequestDispatcher("/index.html").include(request, response);
		}
		else	{
			response.getWriter().append("No user found!");
			request.getRequestDispatcher("/index.html").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
