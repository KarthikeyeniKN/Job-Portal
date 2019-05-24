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

import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.service.JobService;

/**
 * Search function
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String search = request.getParameter("search");
		JobService jobService = new JobService();
		List<AddVaccancy> list = new ArrayList<>();
		try {
			list = jobService.searchService(search, search, search);
			if (list.size() > 0) {
				request.setAttribute("SEARCHLIST", list);
			} else {
				request.setAttribute("NOTFOUND", "No Records Found");
			}
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
