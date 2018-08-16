package com.banking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html></body>");

		int accountNo = Integer.parseInt(request.getParameter("accno"));
		String lastName = request.getParameter("lname");
		String firstName = request.getParameter("fname");
		int ssn = Integer.parseInt(request.getParameter("ssn"));
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zipcode = Integer.valueOf(request.getParameter("zipcode"));

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");
			stmt = con.prepareStatement("insert into CUSTOMER values(?,?,?,?,?,?,?,?)");
			stmt.setInt(1, accountNo);
			stmt.setString(2, lastName);
			stmt.setString(3, firstName);
			stmt.setInt(4, ssn);
			stmt.setString(5, address);
			stmt.setString(6, city);
			stmt.setString(7, state);
			stmt.setInt(8, zipcode);
			int i = stmt.executeUpdate();
			out.println("You have successfully entered the record");
			con.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		out.println("</body></html>");

	}

}
