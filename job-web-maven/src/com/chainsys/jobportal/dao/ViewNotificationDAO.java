package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.util.ConnectionUtil;

/**
 * View the saved and apply job by user
 * @author kart2114
 *
 */
public class ViewNotificationDAO {
	static final Logger log = Logger.getLogger(ViewNotificationDAO.class);
	public ArrayList<AddVaccancy> findSavedJob(int userId) throws Exception {
		AddVaccancy savedJob = new AddVaccancy();
		ArrayList<AddVaccancy> savedJobList = new ArrayList<>();
		Connection connection = ConnectionUtil.getConnection();
		String sql1 = "select r.company_name as company_name, r.vaccancy_position as vaccancy_position,r.skill_required as skill_required,\r\n"
				+ "r.location as location,r.criteria as criteria,r.perks as perks\r\n"
				+ "from trn_user_jobinfo j join trn_users u on u.user_id = j.user_id \r\n"
				+ "join  trn_recruiters r on r.recruiters_id = j.company_id where j.user_id=? and j.save_job=1";
		PreparedStatement preparedStatement = connection.prepareStatement(sql1);
		preparedStatement.setInt(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			savedJob = new AddVaccancy();
			savedJob.setCompany_name(resultSet.getString("company_name"));
			savedJob.setVaccancy_position(resultSet.getString("vaccancy_position"));
			savedJob.setSkill_required(resultSet.getString("skill_required"));
			savedJob.setLocation(resultSet.getString("location"));
			savedJob.setCriteria(resultSet.getString("criteria"));
			savedJob.setPerks(resultSet.getString("perks"));
			savedJobList.add(savedJob);
		}
		log.debug("SavedJob" + savedJob);
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return savedJobList;
	}

	public ArrayList<AddVaccancy> findApplyJob(int userId) throws Exception {
		AddVaccancy applyJob = new AddVaccancy();
		ArrayList<AddVaccancy> applyJobList = new ArrayList<>();
		Connection connection = ConnectionUtil.getConnection();
		String sql1 = "select r.company_name as company_name, r.vaccancy_position as vaccancy_position,r.skill_required as skill_required,\r\n"
				+ "r.location as location,r.criteria as criteria,r.perks as perks\r\n"
				+ "from trn_user_jobinfo j join trn_users u on u.user_id = j.user_id \r\n"
				+ "join  trn_recruiters r on r.recruiters_id = j.company_id where j.user_id=? and j.apply_job=1";
		PreparedStatement preparedStatement = connection.prepareStatement(sql1);
		preparedStatement.setInt(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			applyJob = new AddVaccancy();
			applyJob.setCompany_name(resultSet.getString("company_name"));
			applyJob.setVaccancy_position(resultSet.getString("vaccancy_position"));
			applyJob.setSkill_required(resultSet.getString("skill_required"));
			applyJob.setLocation(resultSet.getString("location"));
			applyJob.setCriteria(resultSet.getString("criteria"));
			applyJob.setPerks(resultSet.getString("perks"));
			applyJobList.add(applyJob);
		}
		log.debug("ApplyJob" + applyJob);
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return applyJobList;
	}

	public ArrayList<AddVaccancy> findAppliedUser(int id) throws Exception {
		AddVaccancy appliedUserInfo = new AddVaccancy();
		ArrayList<AddVaccancy> appliedUserList = new ArrayList<>();
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select user_name,email,company_name,skill_required,vaccancy_position,location from trn_users u join trn_user_jobinfo j on\r\n"
					+ "j.user_id = u.user_id join trn_recruiters r on r.recruiters_id = j.company_id\r\n"
					+ "where j.apply_job=1 and j.shortlist=0 and r.recruiters_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				appliedUserInfo = new AddVaccancy();
				appliedUserInfo.setUsername(resultSet.getString("user_name"));
				appliedUserInfo.setEmail(resultSet.getString("email"));
				appliedUserInfo.setCompany_name(resultSet.getString("company_name"));
				appliedUserInfo.setVaccancy_position(resultSet.getString("vaccancy_position"));
				appliedUserInfo.setSkill_required(resultSet.getString("skill_required"));
				appliedUserInfo.setLocation(resultSet.getString("location"));
				appliedUserList.add(appliedUserInfo);
			}
			log.debug("ApplyUser" + appliedUserInfo);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		return appliedUserList;
	}

	public ArrayList<AddVaccancy> findShortListUser(int id) throws SQLException {
		AddVaccancy appliedUserInfo = new AddVaccancy();
		ArrayList<AddVaccancy> appliedUserList = new ArrayList<>();
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select user_name,email,company_name,skill_required,vaccancy_position,location from trn_users u join trn_user_jobinfo j on\r\n" + 
					"j.user_id = u.user_id join trn_recruiters r on r.recruiters_id = j.company_id\r\n" + 
					"where j.apply_job=1 and j.shortlist=1 and r.recruiters_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				appliedUserInfo = new AddVaccancy();
				appliedUserInfo.setUsername(resultSet.getString("user_name"));
				appliedUserInfo.setEmail(resultSet.getString("email"));
				appliedUserInfo.setCompany_name(resultSet.getString("company_name"));
				appliedUserInfo.setVaccancy_position(resultSet.getString("vaccancy_position"));
				appliedUserInfo.setSkill_required(resultSet.getString("skill_required"));
				appliedUserInfo.setLocation(resultSet.getString("location"));
				appliedUserList.add(appliedUserInfo);
			}
			log.debug("ApplyUser" + appliedUserInfo);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		return appliedUserList;
	}
}
