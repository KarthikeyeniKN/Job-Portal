package com.chainsys.jobportal.service;

import com.chainsys.jobportal.dao.AddVaccancyDAO;
import com.chainsys.jobportal.exception.AddVaccancyException;
import com.chainsys.jobportal.model.AddVaccancy;

public class AddVacancyService {
	public void addVacancy(AddVaccancy addVaccancy) throws AddVaccancyException {
		AddVaccancyDAO addVaccancyDAO = new AddVaccancyDAO();
		try {
			addVaccancyDAO.add(addVaccancy);
		} catch (AddVaccancyException e) {
			throw new AddVaccancyException(e.getMessage());
		}
	}
}
