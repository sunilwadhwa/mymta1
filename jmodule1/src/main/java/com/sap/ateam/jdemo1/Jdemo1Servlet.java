package com.sap.ateam.jdemo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdemo1Servlet
 */
@WebServlet("/username")
@ServletSecurity(@HttpConstraint(rolesAllowed = { "Display" }))
public class Jdemo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Jdemo1Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at URI: ").append(request.getRequestURI()).println();
		// response.getWriter().append("PathInfo: " + request.getPathInfo()).println();
		
		if (request.getUserPrincipal() != null) {
			response.getWriter().append("Application User: " + request.getUserPrincipal().getName()).println();
			response.getWriter().append("Bank balance    : $99.50").println();
		} else {
			response.getWriter().append("Application User: null").println();
			response.getWriter().append("Bank balance    : unknown").println();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
