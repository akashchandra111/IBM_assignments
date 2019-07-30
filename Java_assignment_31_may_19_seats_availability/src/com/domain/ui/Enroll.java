package com.domain.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.service.DatabaseService;


@WebServlet("/enroll")
public class Enroll extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DatabaseService dbService = new DatabaseService();
		String id = request.getParameter("id");
		
		dbService.reduceSeatByOne(id);
		response.getWriter().println("Hi! you are successfully enrolled for the "+ new DatabaseService().getTrainingName(id) +" training");
		
//		response.sendRedirect("trainings_available");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
