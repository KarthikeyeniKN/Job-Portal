package com.chainsys.jobportal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.jobportal.dao.UserSendMail;
import com.chainsys.jobportal.service.UserJobInfoService;

/**
 * Sending mail to short listed candidates
 * Servlet implementation class AdminSendMailServlet
 */
@WebServlet("/AdminSendMailServlet")
public class AdminSendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mail1 = (String) request.getParameter("Username");
		HttpSession session = request.getSession();
		int id =  (int) session.getAttribute("userId");
		String subject1 = "Job shortlisted information mail";
		String content1 = "<html><head></head><body>Your have been shortlisted for this job</body></html>";
		UserSendMail.sendHtmlMail1(subject1, content1, mail1);
		
		UserJobInfoService userJobInfoService = new UserJobInfoService();
			try {
				userJobInfoService.updateUserInfo(mail1,id);
				RequestDispatcher rd = request.getRequestDispatcher("AppliedServlet");
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
