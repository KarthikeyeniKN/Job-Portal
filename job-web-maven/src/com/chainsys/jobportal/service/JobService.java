package com.chainsys.jobportal.service;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.jobportal.dao.AddVaccancyDAO;
import com.chainsys.jobportal.model.AddVaccancy;

public class JobService {
	public List<AddVaccancy> searchService(String search,String search1, String search2) throws Exception {
		AddVaccancyDAO searchDAO = new AddVaccancyDAO();
		ArrayList<AddVaccancy> searchList = searchDAO.findSearchList(search,search1,search2);
		return searchList;
	}
}
