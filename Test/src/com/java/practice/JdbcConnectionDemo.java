package com.java.practice;

import java.sql.*;

public class JdbcConnectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(" com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		while (rs.next()) {
			System.out.println(rs.getInt(0) + "......" + rs.getString(1) + "......." + rs.getString(2));
			con.close();
		}
	}

}
