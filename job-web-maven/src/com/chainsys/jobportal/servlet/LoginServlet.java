package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.jobportal.dao.RegistrationDAO;
import com.chainsys.jobportal.exception.RegistrationException;
import com.chainsys.jobportal.model.Registration;
import com.chainsys.jobportal.service.RegisterationService;
import com.cs.auth.Authentication;


/**
 * Login Servlet
 * @author kart2114
 *
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("email");
		String password = request.getParameter("password");
		Registration registration = new Registration();
		registration.setEmail(userName);
		registration.setPassword(password);
		RegistrationDAO registrationdao = new RegistrationDAO();
		RegisterationService registerUserService = new RegisterationService();
		int id=0;
		try {
			id = registrationdao.get_user_id(registration);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		boolean successuser;
		boolean success;
		try {
			success = Authentication.isLogin(userName, password);
			successuser = registerUserService.check(id);
			if (success) {
				if (successuser) {
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);
					session.setAttribute("userId", id);
					RequestDispatcher rs = request.getRequestDispatcher("JobServlet");
					rs.forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);
					session.setAttribute("userId", id);
					System.out.println(id);
					RequestDispatcher rs = request.getRequestDispatcher("recruitersform.jsp");
					rs.forward(request, response);
				}
			} else {
				request.setAttribute("ERROR", "Invalid Email or Password. Try again");
				RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
				rs.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (RegistrationException e) {
			e.printStackTrace();
		}
	}
}
