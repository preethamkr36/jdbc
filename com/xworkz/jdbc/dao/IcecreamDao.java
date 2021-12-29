package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.Const;
import com.xworkz.jdbc.dto.IcecreamDto;

public class IcecreamDao {
	public boolean save(IcecreamDto dto) {
		Connection connection = null;
		try {
			Class.forName(Const.DRIVER_CLASS);
			connection = DriverManager.getConnection(Const.URL, Const.USERNAME, Const.PASSWORD);
			String sqlQ = "insert into icecream values(" + dto.getId() + ",'" + dto.getFlavour() + "','" + dto.getName()
					+ "'," + dto.getPrice() + ")";
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
			String sqlQ = "delete from icecream where id=" + id;
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
