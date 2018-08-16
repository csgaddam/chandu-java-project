package com.banking.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banking.service.AdminLogin;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

public class AdminServlet extends HttpServlet {

	static String uname;
	static String password;
	static boolean b;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String name = request.getParameter("username");
		String pswd = request.getParameter("password");

		AdminLogin conn = new AdminLogin();
		try {
			b = conn.login(name, pswd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (b == true) {
			RequestDispatcher rd = request.getRequestDispatcher("./customerdetails");
			rd.forward(request, response);
		} else {
			out.println("please enter a valid username and password");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
		}

		out.close();

	}

}
