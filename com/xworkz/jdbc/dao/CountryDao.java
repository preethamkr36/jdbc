package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.Const;
import com.xworkz.jdbc.dto.CountryDto;
import com.xworkz.jdbc.util.SqlUtil;

public class CountryDao {
	public boolean save(CountryDto dto) {
		Connection connection = null;
		try {
			Class.forName(Const.DRIVER_CLASS);
			connection = DriverManager.getConnection(Const.URL, Const.USERNAME, Const.PASSWORD);
			String sqlQ = "insert into country values(" + dto.getId() + ",'" + dto.getName() + "'," + dto.getCode()
					+ ",'" + dto.getContinent() + "')";
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
			String sqlQ = "delete from country where id=" + id;
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
	
	public void display(int id) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select*from country where id=?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setObject(1, id);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				System.out.println(col1 + " " + col2 + " " + col3 + " " + col4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
	}

	public void displayAll() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select*from country";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				System.out.println(col1 + " " + col2 + " " + col3 + " " + col4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
	}

	public void getCount() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select count(*) from country";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				System.out.println(col1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
	}
}
