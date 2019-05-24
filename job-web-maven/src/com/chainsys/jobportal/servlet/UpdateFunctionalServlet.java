package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.jobportal.model.UserFunctional;
import com.chainsys.jobportal.service.ProfileService;

/**
 * Update user functional details
 * Servlet implementation class UpdateFunctionalServlet
 */
@WebServlet("/UpdateFunctionalServlet")
public class UpdateFunctionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String industry = request.getParameter("industry");
		String functional = request.getParameter("functional");
		String role = request.getParameter("role");
		String job_type = request.getParameter("jobtype");
		String employment_type = request.getParameter("employmenttype");
		String location = request.getParameter("location");
		int userId = (int) session.getAttribute("userId");
		UserFunctional userFunctional = new UserFunctional();
		userFunctional.setIndustry(industry);
		userFunctional.setFunctional(functional);
		userFunctional.setRole(role);
		userFunctional.setJob_type(job_type);
		userFunctional.setEmployment_type(employment_type);
		userFunctional.setLocation(location);
		userFunctional.setUser_id(userId);
		userFunctional.setCreated_by(userId);
		userFunctional.setCreated_date(LocalDate.now());
		userFunctional.setModified_by(userId);
		userFunctional.setModified_date(LocalDate.now());
		ProfileService updateFunctionalService = new ProfileService();
		try {
			updateFunctionalService.updateFunctional(userFunctional);
			RequestDispatcher rd = request.getRequestDispatcher("myprofile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
