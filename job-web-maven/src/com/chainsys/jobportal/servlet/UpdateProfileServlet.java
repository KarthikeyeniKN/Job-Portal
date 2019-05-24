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

import com.chainsys.jobportal.model.Profile;
import com.chainsys.jobportal.service.ProfileService;

/**
 * Update user profile details
 * Servlet implementation class UpdateProfileServlet
 */
@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		String marial_status = request.getParameter("marial");
		String education_degree = request.getParameter("degree");
		int yr_of_completion = Integer.parseInt(request.getParameter("year"));
		String college_name = request.getParameter("clgname");
		String relocate = request.getParameter("relocate");
		int userId = (int) session.getAttribute("userId");
		Profile profile = new Profile();

		profile.setDob(dob);
		profile.setGender(gender);
		profile.setAddress(address);
		profile.setPincode(pincode);
		profile.setMarial_status(marial_status);
		profile.setEducation_degree(education_degree);
		profile.setYr_of_completion(yr_of_completion);
		profile.setCollege_name(college_name);
		profile.setRelocate(relocate);
		profile.setUser_id(userId);
		profile.setCreated_by(userId);
		profile.setCreateddate(LocalDate.now());
		profile.setModified_by(userId);
		profile.setModified_date(LocalDate.now());
		ProfileService updateProfileService = new ProfileService();
		try {
			updateProfileService.updateProfile(profile);
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
