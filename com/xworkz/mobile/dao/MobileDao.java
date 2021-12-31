package com.xworkz.mobile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.util.SqlUtil;

public class MobileDao {
	public boolean save(MobileDto dto) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "insert into mobile values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dto.getId());
			preparedStatement.setObject(2, dto.getName());
			preparedStatement.setObject(3, dto.getModel());
			preparedStatement.setObject(4, dto.getSerialNumber());
			preparedStatement.setObject(5, dto.getPrice());
			preparedStatement.setObject(6, dto.getNoOfCamera());
			preparedStatement.setObject(7, dto.getMemory());
			int row = preparedStatement.executeUpdate();
			System.out.println(row);
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public void getAll() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select*from mobile";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				Object col5 = resultSet.getObject(5);
				Object col6 = resultSet.getObject(6);
				Object col7 = resultSet.getObject(7);
				System.out.println(col1 + " " + col2 + " " + col3 + " " + col4 + " " + col5 + " " + col6 + " " + col7);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
	}

	public boolean deleteById(int id) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "delete from mobile where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, id);
			int row = preparedStatement.executeUpdate();
			System.out.println(row);
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public void updateBySerialNumber(String serialNo, Integer noOfCamera) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "update mobile set no_of_camera=? where serial_number=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, noOfCamera);
			preparedStatement.setObject(2, serialNo);
			int row = preparedStatement.executeUpdate();
			System.out.println(row);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			SqlUtil.closeConnection(connection);
		}

	}
	
	public void getAllByName(String name) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select*from mobile where name=?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setObject(1, name);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				Object col5 = resultSet.getObject(5);
				Object col6 = resultSet.getObject(6);
				Object col7 = resultSet.getObject(7);
				System.out.println(col1 + " " + col2 + " " + col3 + " " + col4 + " " + col5 + " " + col6 + " " + col7);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
	}
}