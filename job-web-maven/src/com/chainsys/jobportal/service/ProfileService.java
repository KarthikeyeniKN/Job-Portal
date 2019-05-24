package com.chainsys.jobportal.service;

import com.chainsys.jobportal.dao.UpdateProfileDAO;
import com.chainsys.jobportal.model.Profile;
import com.chainsys.jobportal.model.UserFunctional;
import com.chainsys.jobportal.model.UserLanguage;
import com.chainsys.jobportal.model.UserProject;

public class ProfileService {
	public void updateProfile(Profile profile) throws Exception {
			UpdateProfileDAO updateProfileDAO = new UpdateProfileDAO();
			 updateProfileDAO.updateProfile(profile);
	}

	public void updateFunctional(UserFunctional userFunctional) throws Exception {
		UpdateProfileDAO updateProfileDAO = new UpdateProfileDAO();
		 updateProfileDAO.updateFunctional(userFunctional);	
	}

	public void updateLanguage(UserLanguage userLanguage) throws Exception {
		UpdateProfileDAO updateProfileDAO = new UpdateProfileDAO();
		 updateProfileDAO.updateLanguage(userLanguage);	
	}

	public void updateProject(UserProject userProject) throws Exception {
		UpdateProfileDAO updateProfileDAO = new UpdateProfileDAO();
		 updateProfileDAO.updateProject(userProject);	
	}
}
