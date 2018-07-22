package com.java.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HttpRequestsImpl implements HttpRequests {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String htmlPage = "";
		htmlPage += "<html>";
		htmlPage += "<head>";
		htmlPage += "<!--Css JS etc will come here -->";
		htmlPage += "</head>";
		htmlPage += "<body>";
		htmlPage += "Hello " + name + "</br>";
		htmlPage += "Hello " + name + "</br>";
		htmlPage += "<b>Hello</b> " + name + "</br>";
		htmlPage += "<i>Hello " + name + "</br>";
		htmlPage += "	Hello " + name + "</br></i>";
		htmlPage += "	<h1>Hello " + name + "</h1>";
		htmlPage += "	<strong>STRONG Man </strong>";
		htmlPage += "</body>";
		htmlPage += "</html>";
		out.print(htmlPage);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("YOU HAVE TO IMPLEMENT THIS METHOD FIRST");

	}

}
