package com.java.practice;

import java.sql.*;

public class JdbcConnectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_db", "root", "CHAndu@123");


		
		/*PreparedStatement pstmt = con.prepareStatement(
		 * "insert into employee values(?,?,?)");
		pstmt.setInt(1, 105);
		pstmt.setString(2, "tim");
		pstmt.setString(3, "tim@gmail.com");
		int i =pstmt.executeUpdate();*/
		
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from USER");
		while (rs.next()) {
			System.out.println(rs.getString("USERNAME") + "......" + rs.getString("PASSWORD") );
		}
		con.close();
	}

}
