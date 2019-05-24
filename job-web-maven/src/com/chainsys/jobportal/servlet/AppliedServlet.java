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
 * Selecting applied job list by particular company
 * Servlet implementation class AppliedServlet
 */
@WebServlet("/AppliedServlet")
public class AppliedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int id =  (int) session.getAttribute("userId");
		ViewNotificationService appliedService = new ViewNotificationService();
		List<AddVaccancy> appliedlist = new ArrayList<>();
		try {
			appliedlist = appliedService.appliedUserInfo(id);
			if (appliedlist.size() > 0) {
			request.setAttribute("APPLIEDLIST", appliedlist);
			}
			else {
				request.setAttribute("NOTFOUND", "No Records Found");
			}
			RequestDispatcher rd = request.getRequestDispatcher("appliedlist.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
}
