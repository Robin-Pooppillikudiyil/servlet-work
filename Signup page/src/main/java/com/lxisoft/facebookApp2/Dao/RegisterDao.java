package com.lxisoft.facebookApp2.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lxisoft.facebookApp2.bean.RegisterBean;
import com.lxisoft.facebookApp2.controller.RegisterServlet;
import com.lxisoft.facebookApp2.util.DBConnection;

public class RegisterDao {

	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(RegisterServlet.class);

	public String registerUser(RegisterBean registerBean) {

		String fullName = registerBean.getFullName();
		String email = registerBean.getEmail();
		String userName = registerBean.getUserName();
		String password = registerBean.getPassword();
		String role = registerBean.getRole();
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {

			sfl4jlogger.trace("data storage mechanism.");
			con = DBConnection.createConnection();

			/**
			 * Insert user details into the table 'USERS'
			 */
			String query = "insert into newUsers(SlNo,fullName,Email,userName,password,role) values (NULL,?,?,?,aes_encrypt(?,'key'),?)";
			/**
			 * Making use of prepared statements here to insert bunch of data
			 * 
			 */

			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, role);

			int i = preparedStatement.executeUpdate();

			if (i != 0) // Just to ensure data has been inserted into the
						// database
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Oops.. Something went wrong there..!"; // On failure, send a
														// message from here.
	}
}
