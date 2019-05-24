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

import com.chainsys.jobportal.dao.UserSendMail;
import com.chainsys.jobportal.model.UserJobInfo;
import com.chainsys.jobportal.service.UserJobInfoService;

/**
 * User apply job confirmation mail
 * Servlet implementation class UserSendMail
 */
@WebServlet("/UserSendMailServlet")
public class UserSendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String mail = (String) session.getAttribute("userName");
		String subject = "Job applied conformation mail";
		String content = "<html><head></head><body>Your have applied for the job</body></html>";
		UserSendMail.sendHtmlMail(subject, content, mail);
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		int userId = (int) session.getAttribute("userId");
		int applyJob = 1;
		UserJobInfo userJobInfo = new UserJobInfo();
		userJobInfo.setUser_id(userId);
		userJobInfo.setCompany_id(companyId);
		userJobInfo.setApply_job(applyJob);
		userJobInfo.setCreated_by(userId);
		userJobInfo.setCreated_date(LocalDate.now());

		UserJobInfoService userJobInfoService = new UserJobInfoService();
		try {
			userJobInfoService.applyJobInfo(userJobInfo);
			RequestDispatcher rd = request.getRequestDispatcher("JobServlet");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
