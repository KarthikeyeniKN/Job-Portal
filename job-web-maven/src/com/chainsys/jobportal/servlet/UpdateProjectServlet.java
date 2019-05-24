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

import com.chainsys.jobportal.model.UserProject;
import com.chainsys.jobportal.service.ProfileService;

/**
 * Update user project details 
 * Servlet implementation class UpdateProjectServlet
 */
@WebServlet("/UpdateProjectServlet")
public class UpdateProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String title = request.getParameter("title");
		String duration = request.getParameter("duration");
		String details = request.getParameter("details");
		String skills = request.getParameter("skills");
		int userId = (int) session.getAttribute("userId");
		UserProject userProject = new UserProject();
		userProject.setTitle(title);
		userProject.setDuration(duration);
		userProject.setDetails(details);
		userProject.setSkills(skills);
		userProject.setUser_id(userId);
		userProject.setCreated_by(userId);
		userProject.setCreated_date(LocalDate.now());
		userProject.setModified_by(userId);
		userProject.setModified_date(LocalDate.now());
		ProfileService updateProjectService = new ProfileService();
		try {
			updateProjectService.updateProject(userProject);
			RequestDispatcher rd = request.getRequestDispatcher("myprofile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
