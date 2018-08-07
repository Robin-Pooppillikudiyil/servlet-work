package com.test.signup.util;

import java.sql.Connection;
import java.sql.DriverManager;
import com.test.signup.controller.RegisterServlet;

/**
 * @author Robin_Pooppillikudiyil
 * @version 1.0.1
 */

public class DBConnection {
	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(RegisterServlet.class);

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/security";//security as database name
		String username = "root"; // MySQL username
		String password = "root"; // MySQL password

		sfl4jlogger.trace("database connection ready to use");
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver"); // loading MySQLdrivers.
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			con = DriverManager.getConnection(url, username, password); // attempting
																		// to
																		// connect
																		// to
																		// MySQL
																		// database
			System.out.println("Printing connection object " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
