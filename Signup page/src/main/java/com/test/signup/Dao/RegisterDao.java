package com.test.signup.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.test.signup.bean.RegisterBean;
import com.test.signup.controller.RegisterServlet;
import com.test.signup.util.DBConnection;

/**
 * @author Robin_Pooppillikudiyil
 * @version 1.0.1
 */
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
			 * Insert user details into the table 'NEWUSERS' & password put into database encrypted form
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

			if (i != 0) // Just to ensure data has been inserted into the database
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Oops.. Something went wrong there..!"; // On failure, send message from here.
	}
}
