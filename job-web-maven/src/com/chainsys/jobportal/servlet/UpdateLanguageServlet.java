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

import com.chainsys.jobportal.model.UserLanguage;
import com.chainsys.jobportal.service.ProfileService;

/**
 * Update user language details
 * Servlet implementation class UpdateLanguageServlet
 */
@WebServlet("/UpdateLanguageServlet")
public class UpdateLanguageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String languageknown = request.getParameter("language");
		String proficiency = request.getParameter("proficiency");
		int userId = (int) session.getAttribute("userId");
		UserLanguage userLanguage = new UserLanguage();
		userLanguage.setLanguageknown(languageknown);
		userLanguage.setProficiency(proficiency);
		userLanguage.setUser_id(userId);
		userLanguage.setCreated_by(userId);
		userLanguage.setCreated_date(LocalDate.now());
		userLanguage.setModified_by(userId);
		userLanguage.setModified_date(LocalDate.now());
		ProfileService updateLanguageService = new ProfileService();
		try {
			updateLanguageService.updateLanguage(userLanguage);
			RequestDispatcher rd = request.getRequestDispatcher("myprofile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
