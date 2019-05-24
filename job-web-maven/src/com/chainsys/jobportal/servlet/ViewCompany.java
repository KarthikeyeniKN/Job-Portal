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
 * View the company to save or apply
 * Servlet implementation class ViewCompany
 */

@WebServlet("/ViewCompany")
public class ViewCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String companyname;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		companyname = request.getParameter("companyname");
		AddVaccancyDAO addVaccancydao = new AddVaccancyDAO();
		try {
			ArrayList<AddVaccancy> viewCompany = addVaccancydao.viewCompanyInfo(companyname);
			request.setAttribute("VIEWCOMPANY", viewCompany);
			RequestDispatcher rd = request.getRequestDispatcher("companyinfo.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
