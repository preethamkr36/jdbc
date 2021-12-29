package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.WaterfallsConstant;
import com.xworkz.jdbc.dto.WaterfallsDto;

public class WaterfallsDao {
	public boolean save(WaterfallsDto dto) {
		Connection connection = null;

		try {
			Class.forName(WaterfallsConstant.DRIVER_CLASS);
			connection = DriverManager.getConnection(WaterfallsConstant.URL, WaterfallsConstant.USERNAME,
					WaterfallsConstant.PASSWORD);
			String sql = "insert into water_falls values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getLocation() + "','" + dto.getRiver() + "'," + dto.getHeight() + ")";
			Statement statement = connection.createStatement();
			int updated = statement.executeUpdate(sql);
			if (updated == 1) {
				System.out.println("One row updated");
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
			Class.forName(WaterfallsConstant.DRIVER_CLASS);
			connection = DriverManager.getConnection(WaterfallsConstant.URL, WaterfallsConstant.USERNAME,
					WaterfallsConstant.PASSWORD);
			String sql = "delete from water_falls where w_id=" + id;
			Statement statement = connection.createStatement();
			int updated = statement.executeUpdate(sql);
			if (updated == 1) {
				System.out.println("one row deleted");
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
