package com.lxisoft.facebookApp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.facebookApp2.Dao.RegisterDao;
import com.lxisoft.facebookApp2.bean.RegisterBean;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = -7411975908906080224L;
	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(RegisterServlet.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * Copying all the input parameters in to local variables
		 */
		sfl4jlogger.trace("Entered RegisterServlet dopost method");
		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		sfl4jlogger.trace("username:{}", userName);

		RegisterBean registerBean = new RegisterBean();

		/**
		 * Using Java Beans - An easiest way to play with group of related data
		 */
		registerBean.setFullName(fullName);
		registerBean.setEmail(email);
		registerBean.setUserName(userName);
		registerBean.setPassword(password);
		registerBean.setRole("user");

		RegisterDao registerDao = new RegisterDao();

		/**
		 * The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		 *
		 */
		String userRegistered = registerDao.registerUser(registerBean);
		/**
		 *  On success, you can display a message to user on UserLogin page
		 */
		if (userRegistered.equals("SUCCESS")) {
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
	}
}