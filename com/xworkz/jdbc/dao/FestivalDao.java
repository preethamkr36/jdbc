package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.Const;
import com.xworkz.jdbc.dto.FestivalDto;

public class FestivalDao {
	public boolean save(FestivalDto dto) {
		Connection connection = null;
		try {
			Class.forName(Const.DRIVER_CLASS);
			connection = DriverManager.getConnection(Const.URL, Const.USERNAME, Const.PASSWORD);
			String sqlQ = "insert into festival values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getDate()
					+ "','" + dto.getState() + "')";
			System.out.println(sqlQ);
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sqlQ);
			if (rows == 1) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean delete(int id) {
		Connection connection = null;
		try {
			Class.forName(Const.DRIVER_CLASS);
			connection = DriverManager.getConnection(Const.URL, Const.USERNAME, Const.PASSWORD);
			String sqlQ = "delete from festival where id=" + id;
			System.out.println(sqlQ);
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sqlQ);
			if (rows == 1) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
}