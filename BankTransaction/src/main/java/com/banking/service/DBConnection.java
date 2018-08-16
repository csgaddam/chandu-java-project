package com.banking.service;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection implements Serializable{
	int  accountnumber;


	public DBConnection(int accountnumber) {
		this.accountnumber = accountnumber;
		
	}

	public Customer connect() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from CUSTOMER where ACCT_NO="+ accountnumber);
		Customer details = new Customer();
		
		while (rs.next()) {
			details.setaccountNo(rs.getInt(1));
			details.setLastName(rs.getString(2));
			details.setFirstName(rs.getString(3));
			details.setSSN(Integer.parseInt(rs.getString(4)));
			details.setAddress(rs.getString(5));
			details.setCity(rs.getString(6));
			details.setState(rs.getString(7));
			details.setZipCode(rs.getInt(8));
             
		}
		con.close();
		return details;
	}

}
