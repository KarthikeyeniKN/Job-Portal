package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.service.ViewNotificationService;

/**
 * Listing applied job by user
 * Servlet implementation class ViewApplyJobServlet
 */
@WebServlet("/ViewApplyJobServlet")
public class ViewApplyJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		int userId = (int) session.getAttribute("userId");
		ViewNotificationService viewNotificationService = new ViewNotificationService();
		List<AddVaccancy> list = new ArrayList<>();
		try {
			list = viewNotificationService.applyNotificationInfo(userId);
			request.setAttribute("APPLYLIST", list);
			request.setAttribute("show", "ANAV");
			RequestDispatcher rd = request.getRequestDispatcher("notification.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
