package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.chainsys.jobportal.model.UserJobInfo;
import com.chainsys.jobportal.util.ConnectionUtil;

/**
 * Info about the user jobs save or applied
 * @author kart2114
 *
 */
public class UserJobInfoDAO {
	static final Logger log = Logger.getLogger(UserJobInfoDAO.class);
	public void applyJobInfo(UserJobInfo userJobInfo) throws Exception {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_user_jobinfo(jobinfo_id,user_id,company_id,save_job,apply_job,created_by,created_date) values(jobinfo_id_seq.NEXTVAL,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userJobInfo.getUser_id());
			preparedStatement.setInt(2, userJobInfo.getCompany_id());
			preparedStatement.setInt(3, userJobInfo.getSave_job());
			preparedStatement.setInt(4, userJobInfo.getApply_job());
			preparedStatement.setInt(5, userJobInfo.getCreated_by());
			preparedStatement.setDate(6, Date.valueOf(userJobInfo.getCreated_date()));
			@SuppressWarnings("unused")
			int rows = preparedStatement.executeUpdate();
			log.debug("Rows"+rows);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	public void saveJobInfo(UserJobInfo userJobInfo) throws Exception {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_user_jobinfo(jobinfo_id,user_id,company_id,save_job,apply_job,created_by,created_date) values(jobinfo_id_seq.NEXTVAL,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userJobInfo.getUser_id());
			preparedStatement.setInt(2, userJobInfo.getCompany_id());
			preparedStatement.setInt(3, userJobInfo.getSave_job());
			preparedStatement.setInt(4, userJobInfo.getApply_job());
			preparedStatement.setInt(5, userJobInfo.getCreated_by());
			preparedStatement.setDate(6, Date.valueOf(userJobInfo.getCreated_date()));
			@SuppressWarnings("unused")
			int rows = preparedStatement.executeUpdate();
			log.debug("Rows"+rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}	
	}

	public String updateShortlistService(String mail1, int id) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = " update trn_user_jobinfo set shortlist='1' "
					+ "where user_id = (select user_id from trn_users where email =? and company_id=?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1,mail1);
			preparedStatement.setInt(2,id);
			@SuppressWarnings("unused")
			int rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to update");
		}
		return mail1;
	}
}
