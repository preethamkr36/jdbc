package com.xworkz.mobile.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.xworkz.mobile.constants.Const.*;

public class SqlUtil {
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}