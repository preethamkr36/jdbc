package com.xworkz.jdbc;

import java.sql.*;

public class Trigger {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoked driver class");
			String url = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "361999@Pp";
			Connection sqlConnection = DriverManager.getConnection(url, username, password);
			if (!sqlConnection.isClosed()) {
				System.out.println("Connection is successfull");
				String q = "insert into water_falls.water_falls values (1,'JogFalls','Sagar','Saravathi',850)";
				Statement stm = sqlConnection.createStatement();
				int up = stm.executeUpdate(q);
				System.out.println(up);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}
}