package com.chainsys.jobportal.service;

import com.chainsys.jobportal.dao.UserJobInfoDAO;
import com.chainsys.jobportal.model.UserJobInfo;

public class UserJobInfoService {
	public void applyJobInfo(UserJobInfo userJobInfo) throws Exception {
		UserJobInfoDAO userJobInfoDAO = new UserJobInfoDAO();
		userJobInfoDAO.applyJobInfo(userJobInfo);
	}
	
	public void saveJobInfo(UserJobInfo userJobInfo) throws Exception {
		UserJobInfoDAO userJobInfoDAO = new UserJobInfoDAO();
		userJobInfoDAO.saveJobInfo(userJobInfo);
	}

	public void updateUserInfo(String mail1, int id) throws Exception {
		UserJobInfoDAO userJobInfoDAO = new UserJobInfoDAO();
		userJobInfoDAO.updateShortlistService(mail1,id);	
	}
}
