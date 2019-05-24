package com.chainsys.jobportal.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.jobportal.dao.ViewNotificationDAO;
import com.chainsys.jobportal.model.AddVaccancy;

public class ViewNotificationService {
	public ArrayList<AddVaccancy> saveNotificationInfo(int userId) throws Exception {
		ViewNotificationDAO viewNotificationDAO = new ViewNotificationDAO();
		ArrayList<AddVaccancy> savedList = viewNotificationDAO.findSavedJob(userId);
		return savedList;
	}
	public List<AddVaccancy> applyNotificationInfo(int userId) throws Exception {
		ViewNotificationDAO viewNotificationDAO = new ViewNotificationDAO();
		ArrayList<AddVaccancy> applyList = viewNotificationDAO.findApplyJob(userId);
		return applyList;
	}
	public List<AddVaccancy> appliedUserInfo(int id) throws Exception {
		ViewNotificationDAO appliedInfoDAO = new ViewNotificationDAO();
		ArrayList<AddVaccancy> appliedUserList = appliedInfoDAO.findAppliedUser(id);
		return appliedUserList;
	}
	public List<AddVaccancy> shortListInfo(int id) throws SQLException {
		ViewNotificationDAO shortListInfoDAO = new ViewNotificationDAO();
		ArrayList<AddVaccancy> shortList = shortListInfoDAO.findShortListUser(id);
		return shortList;
	}
}
