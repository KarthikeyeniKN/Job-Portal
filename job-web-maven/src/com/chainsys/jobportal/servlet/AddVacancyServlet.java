package com.chainsys.jobportal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.exception.JobPortalException;
import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.service.AddVacancyService;

/** 
 * Adding the vacancy details by company user
 * Servlet implementation class AddVacancyServlet
 */
@WebServlet("/AddVacancyServlet")
public class AddVacancyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String recruiters_name = request.getParameter("Name");
		String position = request.getParameter("Position");
		String company_name = request.getParameter("Cname");
		String location = request.getParameter("Location");
		String skill_required = request.getParameter("Skills");
		String vaccancy_position = request.getParameter("Vposition");
		int vaccancy = Integer.parseInt(request.getParameter("Vaccancy"));
		String about = request.getParameter("About");
		String criteria = request.getParameter("Criteria");
		String perks = request.getParameter("Perks");
		AddVaccancy addVaccancy = new AddVaccancy();
		addVaccancy.setRecruiters_name(recruiters_name);
		addVaccancy.setPosition(position);
		addVaccancy.setCompany_name(company_name);
		addVaccancy.setLocation(location);
		addVaccancy.setSkill_required(skill_required);
		addVaccancy.setVaccancy_position(vaccancy_position);
		addVaccancy.setVaccancy(vaccancy);
		addVaccancy.setAbout(about);
		addVaccancy.setCriteria(criteria);
		addVaccancy.setPerks(perks);
		AddVacancyService addVaccancyService = new AddVacancyService();
		try {
			addVaccancyService.addVacancy(addVaccancy);
			RequestDispatcher rd = request.getRequestDispatcher("recruitersform.jsp");
			rd.forward(request, response);
		} catch (JobPortalException e) {
			String add = e.getMessage();
			request.setAttribute("add", add);
			RequestDispatcher rd = request.getRequestDispatcher("recruitersform.jsp");
			rd.forward(request, response);	
		}
	}
}
