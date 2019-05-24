package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.AddVaccancyDAO;
import com.chainsys.jobportal.model.AddVaccancy;

/**
 * Listing the company vacancies in to user
 * Servlet implementation class JobServlet
 */
@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AddVaccancyDAO addVaccancydao = new AddVaccancyDAO();
		try {
			ArrayList<AddVaccancy> vaccancyList = addVaccancydao.findVaccancyCompany();
			request.setAttribute("VACCANCYLIST", vaccancyList);
			RequestDispatcher rd = request.getRequestDispatcher("job.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AddVaccancyDAO addVaccancydao = new AddVaccancyDAO();
		try {
			ArrayList<AddVaccancy> vaccancyList = addVaccancydao.findVaccancyCompany();
			request.setAttribute("VACCANCYLIST", vaccancyList);
			RequestDispatcher rd = request.getRequestDispatcher("job.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
