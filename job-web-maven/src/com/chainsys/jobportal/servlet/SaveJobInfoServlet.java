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

import com.chainsys.jobportal.model.UserJobInfo;
import com.chainsys.jobportal.service.UserJobInfoService;

/**
 * Save the job by user
 * Servlet implementation class SaveJobInfoServlet
 */
@WebServlet("/SaveJobInfoServlet")
public class SaveJobInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		int userId = (int) session.getAttribute("userId");
		int saveJob = 1;
		UserJobInfo userJobInfo = new UserJobInfo();
		userJobInfo.setUser_id(userId);
		userJobInfo.setCompany_id(companyId);
		userJobInfo.setSave_job(saveJob);
		userJobInfo.setCreated_by(userId);
		userJobInfo.setCreated_date(LocalDate.now());
		UserJobInfoService saveJobInfoService = new UserJobInfoService();
		try {
			saveJobInfoService.saveJobInfo(userJobInfo);
			RequestDispatcher rd = request.getRequestDispatcher("JobServlet");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
