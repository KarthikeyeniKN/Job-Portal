package com.chainsys.jobportal.service;

import com.chainsys.jobportal.dao.RegistrationDAO;
import com.chainsys.jobportal.exception.RegistrationException;
import com.chainsys.jobportal.model.Registration;

public class RegisterationService {
	public void addRegister(Registration register) throws Exception {
	   RegistrationDAO registerationDAO = new RegistrationDAO();
	   registerationDAO.addRegisteration(register);
	}

	public boolean check(int id) throws RegistrationException {
		 RegistrationDAO registerationDAO = new RegistrationDAO();
		 boolean isvalue;
		try {
			isvalue = registerationDAO.checkUser(id);
		} catch (Exception e) {
			throw new RegistrationException(e.getMessage());
		}
		return isvalue;
	}	
}
