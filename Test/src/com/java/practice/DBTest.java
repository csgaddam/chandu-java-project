package com.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from CUSTOMER where ACCT_NO=12345 and  LastName='gaddam'");

		while (rs.next()) {
			int accno = rs.getInt(1);
			String s1 = rs.getString(2);
			String s2 = rs.getString(3);
			int ssn = Integer.parseInt(rs.getString(4));
			String address = rs.getString(5);
			String city = rs.getString(6);
			String state = rs.getString(7);
			int zipcode = rs.getInt(8);
			System.out.println(accno + "    " + s1 + "    " + s2 + "    " + ssn + "    " + address + "    " + city
					+ "     " + state + "      " + zipcode);
		}
		con.close();
	}
}
