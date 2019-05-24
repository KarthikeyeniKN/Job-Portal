package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

import com.chainsys.jobportal.exception.RegistrationException;
import com.chainsys.jobportal.model.Registration;
import com.chainsys.jobportal.util.ConnectionUtil;

/**
 * RegisterationDAO
 * @author kart2114
 *
 */
public class RegistrationDAO {
	static final Logger log = Logger.getLogger(RegistrationDAO.class);

	public int get_user_id(Registration registration) throws RegistrationException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int id = 0;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select login_id from login where user_name=? and password=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registration.getEmail());
			preparedStatement.setString(2, registration.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				id = resultSet.getInt("login_id");
			}
		} catch (SQLException e) {
			throw new RegistrationException("unable to select");
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
		return id;
	}

	public void addRegisteration(Registration register) throws RegistrationException {
		boolean success = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into trn_users(user_id,user_name,email,create_password,phone_no,created_date) values(trn_user_id_seq.NEXTVAL,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, register.getName());
			preparedStatement.setString(2, register.getEmail());
			preparedStatement.setString(3, register.getPassword());
			preparedStatement.setLong(4, register.getPhoneno());
			preparedStatement.setDate(5, Date.valueOf(register.getCreateddate()));
			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				success = true;
				String sql1 = "insert into login values(trn_user_id_seq.currval,?,?)";
				PreparedStatement preparedStatement2 = connection.prepareStatement(sql1);
				preparedStatement2.setString(1, register.getEmail());
				preparedStatement2.setString(2, register.getPassword());
				preparedStatement2.executeUpdate();
			}
			log.debug("Rows" + rows);
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			throw new RegistrationException("unable to insert");
		}
	}

	public boolean checkUser(int id) throws Exception {
		boolean isActive = false;
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select user_id from trn_users where user_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			isActive = true;
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return isActive;
	}
}
