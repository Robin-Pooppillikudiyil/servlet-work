package com.j2ee.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.util.HttpRequestsImpl;
import com.java.util.HttpRequests;

@WebServlet("/loginForm1")
public class LoginFormServlet extends HttpServlet {

	private static final long serialVersionUID = -8012933967006939232L;

	protected HttpRequests httpRequest = new HttpRequestsImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		httpRequest.doPost(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		httpRequest.doGet(req, resp);
	}

}
