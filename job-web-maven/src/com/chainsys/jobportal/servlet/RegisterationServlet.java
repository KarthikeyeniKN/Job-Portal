package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.exception.JobPortalException;
import com.chainsys.jobportal.model.Registration;
import com.chainsys.jobportal.service.RegisterationService;

/**
 * Registration Servlet
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterationServlet")
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("fname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		long phoneno = Long.parseLong(request.getParameter("phoneno"));
		Registration register = new Registration();
		register.setName(name);
		register.setEmail(email);
		register.setPassword(password);
		register.setPhoneno(phoneno);
		register.setCreateddate(LocalDate.now());
		RegisterationService registerService = new RegisterationService();
		try {
			registerService.addRegister(register);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			String add = e.getMessage();
			request.setAttribute("add", add);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);	
		}
	}
}
