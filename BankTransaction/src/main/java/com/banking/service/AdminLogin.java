package com.banking.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLogin {
	static boolean b;

	public boolean login(String user,String password) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");
			PreparedStatement statement = con.prepareStatement("select * from USER where USERNAME=? and PASSWORD=?");
			statement.setString(1, user);
			statement.setString(2, password);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				b = true;
			}else
			{
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

}
