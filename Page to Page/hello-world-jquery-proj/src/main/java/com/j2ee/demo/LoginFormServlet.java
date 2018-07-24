package com.j2ee.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginForm1")
public class LoginFormServlet extends HttpServlet {

	private static final long serialVersionUID = -8012933967006939232L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		request.setAttribute("username", "ROBIN");

		request.getSession().setAttribute("nameInSession", username);

		if ("java".equals(username) && "123".equals(password)) {

			RequestDispatcher view = request.getRequestDispatcher("homepage.jsp");
			view.forward(request, response);

			// response.sendRedirect("homepage.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("YOU HAVE TO IMPLEMENT THIS METHOD FIRST");

	}

}
