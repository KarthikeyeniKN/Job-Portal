package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.chainsys.jobportal.exception.AddVaccancyException;
import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AddVaccancyDAO {
	static final Logger log = Logger.getLogger(AddVaccancyDAO.class);
	/**
	 * Adding the company vacancy details and selecting
	 * @param addVaccancy
	 * @throws Exception
	 */
	public void add(AddVaccancy addVaccancy) throws AddVaccancyException {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_recruiters(recruiters_id,recruiters_name,position,company_name,location,skill_required,vaccancy_position,vaccancy,about,criteria,perks) "
					+ "values(trn_recruiters_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, addVaccancy.getRecruiters_name());
			preparedStatement.setString(2, addVaccancy.getPosition());
			preparedStatement.setString(3, addVaccancy.getCompany_name());
			preparedStatement.setString(4, addVaccancy.getLocation());
			preparedStatement.setString(5, addVaccancy.getSkill_required());
			preparedStatement.setString(6, addVaccancy.getVaccancy_position());
			preparedStatement.setInt(7, addVaccancy.getVaccancy());
			preparedStatement.setString(8, addVaccancy.getAbout());
			preparedStatement.setString(9, addVaccancy.getCriteria());
			preparedStatement.setString(10, addVaccancy.getPerks());
			int rows = preparedStatement.executeUpdate();
			log.debug("Rows"+rows);
		} catch (SQLException e) {
			log.error("Exception caught"+e.getMessage());
			throw new AddVaccancyException("unable to insert");
		}
		finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	public ArrayList<AddVaccancy> findVaccancyCompany() throws Exception {
		AddVaccancy addVaccancy = null;
		ArrayList<AddVaccancy> vaccancyCompany = new ArrayList<>();
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select about,recruiters_name,position,company_name,location ,skill_required,vaccancy_position,vaccancy,criteria,perks from trn_recruiters";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				addVaccancy = new AddVaccancy();
				addVaccancy.setAbout(resultSet.getString("about"));
				addVaccancy.setCompany_name(resultSet.getString("company_name"));
				addVaccancy.setRecruiters_name(resultSet.getString("recruiters_name"));
				addVaccancy.setPosition(resultSet.getString("position"));
				addVaccancy.setLocation(resultSet.getString("location"));
				addVaccancy.setVaccancy_position(resultSet.getString("vaccancy_position"));
				addVaccancy.setSkill_required(resultSet.getString("skill_required"));
				addVaccancy.setVaccancy(resultSet.getInt("vaccancy"));
				addVaccancy.setCriteria(resultSet.getString("criteria"));
				addVaccancy.setPerks(resultSet.getString("perks"));
				vaccancyCompany.add(addVaccancy);
			}
			log.debug("VaccancyCompany"+vaccancyCompany);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		return vaccancyCompany;
	}

	public ArrayList<AddVaccancy> viewCompanyInfo(String companyname) throws Exception {
		AddVaccancy viewCompanyInfo = null;
		ArrayList<AddVaccancy> viewCompany = new ArrayList<>();
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select recruiters_id,about,company_name,location ,skill_required,vaccancy_position,vaccancy,criteria,perks from trn_recruiters where company_name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1, companyname);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				viewCompanyInfo = new AddVaccancy();
				viewCompanyInfo.setRecruiters_id(resultSet.getInt("recruiters_id"));
				viewCompanyInfo.setAbout(resultSet.getString("about"));
				viewCompanyInfo.setCompany_name(resultSet.getString("company_name"));
				viewCompanyInfo.setLocation(resultSet.getString("location"));
				viewCompanyInfo.setSkill_required(resultSet.getString("skill_required"));
				viewCompanyInfo.setVaccancy_position(resultSet.getString("vaccancy_position"));
				viewCompanyInfo.setVaccancy(resultSet.getInt("vaccancy"));
				viewCompanyInfo.setCriteria(resultSet.getString("criteria"));
				viewCompanyInfo.setPerks(resultSet.getString("perks"));
				viewCompany.add(viewCompanyInfo);
			}
			log.debug("ViewCompany"+viewCompany);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		return viewCompany;
	}

	public ArrayList<AddVaccancy> findSearchList(String companyname, String vaccancy_position, String location)
			throws Exception {
		AddVaccancy searchDAO = null;
		ArrayList<AddVaccancy> searchList = new ArrayList<>();
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select about,recruiters_name,position,company_name,location,skill_required,vaccancy_position,vaccancy from trn_recruiters"
					+ " where company_name=? or vaccancy_position=? or location=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1, companyname);
			preparedStatement.setString(2, vaccancy_position);
			preparedStatement.setString(3, location);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				searchDAO = new AddVaccancy();
				searchDAO.setAbout(resultSet.getString("about"));
				searchDAO.setRecruiters_name(resultSet.getString("recruiters_name"));
				searchDAO.setPosition(resultSet.getString("position"));
				searchDAO.setCompany_name(resultSet.getString("company_name"));
				searchDAO.setLocation(resultSet.getString("location"));
				searchDAO.setSkill_required(resultSet.getString("skill_required"));
				searchDAO.setVaccancy_position(resultSet.getString("vaccancy_position"));
				searchDAO.setVaccancy(resultSet.getInt("vaccancy"));
				searchList.add(searchDAO);
			}
			log.debug("SerachList"+searchList);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		return searchList;
	}
}
