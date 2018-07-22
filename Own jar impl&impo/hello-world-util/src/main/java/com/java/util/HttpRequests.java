package com.java.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HttpRequests {

	void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException;

	void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

}
