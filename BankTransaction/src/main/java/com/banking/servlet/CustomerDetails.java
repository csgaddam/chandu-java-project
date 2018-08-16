package com.banking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banking.service.Customer;
import com.banking.service.DBConnection;

public class CustomerDetails extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		int accountnumber = Integer.parseInt(request.getParameter("accno"));

		DBConnection con = new DBConnection(accountnumber);
		try {
			Customer customer = con.connect();
			 out.print("<table border='1' width='100%'");  
		     out.print("<tr><th>AccountNumber</th><th>LastNameName</th><th>FirstNameName</th><th>SSN</th><th>Address</th><th>City</th><th>State</th><th>Zipcode</th></tr>");  
			/*out.println("Account Number:" + customer.getaccountNO() + "<br>");
			out.println("LastName:      " + customer.getLastName() + "<br>");
			out.println("FirstName:     " + customer.getFirstName() + "<br>");
			out.println("SSN:           " + customer.getSSN() + "<br>");
			out.println("Address:       " + customer.getAddress() + "<br>");
			out.println("City:          " + customer.getCity() + "<br>");
			out.println("State:         " + customer.getState() + "<br>");
			out.println("ZipCode:       " + customer.getZipCode() + "<br>");*/
		     
		     out.print("<tr><td>"+customer.getaccountNO()+"</td>"+"<td>"+customer.getLastName()+
		    		 "</td>"+"<td>"+customer.getFirstName()+"<td>"+customer.getSSN()+"</td>"+
		    		 "<td>"+customer.getAddress()+"</td>"+"<td>"+customer.getCity()+"</td>"+
		    		 "<td>"+customer.getState()+"</td>"+"<td>"+customer.getZipCode()+"</td>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
