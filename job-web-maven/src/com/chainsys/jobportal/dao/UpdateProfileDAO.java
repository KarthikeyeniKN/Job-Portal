package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.chainsys.jobportal.model.Profile;
import com.chainsys.jobportal.model.UserFunctional;
import com.chainsys.jobportal.model.UserLanguage;
import com.chainsys.jobportal.model.UserProject;
import com.chainsys.jobportal.util.ConnectionUtil;

/**
 * Updating the user profile 
 * @author kart2114
 *
 */
public class UpdateProfileDAO {
	static final Logger log = Logger.getLogger(UpdateProfileDAO.class);
	public void updateProfile(Profile profile) throws Exception {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_users_profile(profile_id,date_of_birth,gender,address,pincode,marial_status,education_degree,yr_of_completion,college_name,"
					+ "relocate,user_id,created_by,created_date,modified_by,modified_date)"
					+ " values(trn_profile_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDate(1, Date.valueOf(profile.getDob()));
			preparedStatement.setString(2, profile.getGender());
			preparedStatement.setString(3, profile.getAddress());
			preparedStatement.setInt(4, profile.getPincode());
			preparedStatement.setString(5, profile.getMarial_status());
			preparedStatement.setString(6, profile.getEducation_degree());
			preparedStatement.setInt(7, profile.getYr_of_completion());
			preparedStatement.setString(8, profile.getCollege_name());
			preparedStatement.setString(9, profile.getRelocate());
			preparedStatement.setInt(10, profile.getUser_id());
			preparedStatement.setInt(11, profile.getCreated_by());
			preparedStatement.setDate(12, Date.valueOf(profile.getCreateddate()));
			preparedStatement.setInt(13, profile.getModified_by());
			preparedStatement.setDate(14, Date.valueOf(profile.getModified_date()));
			int rows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	public void updateFunctional(UserFunctional userFunctional) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_users_functional(functional_id,industry,department,role,job_type,employment_type,location,user_id,"
					+ "created_by,created_date,modified_by,modified_date)"
					+ " values(trn_functional_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userFunctional.getIndustry());
			preparedStatement.setString(2, userFunctional.getFunctional());
			preparedStatement.setString(3, userFunctional.getRole());
			preparedStatement.setString(4, userFunctional.getJob_type());
			preparedStatement.setString(5, userFunctional.getEmployment_type());
			preparedStatement.setString(6, userFunctional.getLocation());
			preparedStatement.setInt(7, userFunctional.getUser_id());
			preparedStatement.setInt(8, userFunctional.getCreated_by());
			preparedStatement.setDate(9, Date.valueOf(userFunctional.getCreated_date()));
			preparedStatement.setInt(10, userFunctional.getModified_by());
			preparedStatement.setDate(11, Date.valueOf(userFunctional.getModified_date()));
			int rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}
	}

	public void updateLanguage(UserLanguage userLanguage) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_users_language(language_id,language_known,proficiency,user_id,"
					+ "created_by,created_date,modified_by,modified_date)"
					+ " values(trn_language_id_seq.NEXTVAL,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userLanguage.getLanguageknown());
			preparedStatement.setString(2, userLanguage.getProficiency());
			preparedStatement.setInt(3, userLanguage.getUser_id());
			preparedStatement.setInt(4, userLanguage.getCreated_by());
			preparedStatement.setDate(5, Date.valueOf(userLanguage.getCreated_date()));
			preparedStatement.setInt(6, userLanguage.getModified_by());
			preparedStatement.setDate(7, Date.valueOf(userLanguage.getModified_date()));
			int rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}
	}

	public void updateProject(UserProject userProject) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_users_project(project_id,title,duration,details,skills,user_id,"
					+ "created_by,created_date,modified_by,modified_date)"
					+ " values(trn_project_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userProject.getTitle());
			preparedStatement.setString(2, userProject.getDuration());
			preparedStatement.setString(3, userProject.getDetails());
			preparedStatement.setString(4, userProject.getSkills());
			preparedStatement.setInt(5, userProject.getUser_id());
			preparedStatement.setInt(6, userProject.getCreated_by());
			preparedStatement.setDate(7, Date.valueOf(userProject.getCreated_date()));
			preparedStatement.setInt(8, userProject.getModified_by());
			preparedStatement.setDate(9, Date.valueOf(userProject.getModified_date()));
			int rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}
	}
}
