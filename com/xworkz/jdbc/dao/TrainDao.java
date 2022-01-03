package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.dto.TrainDto;
import com.xworkz.jdbc.util.SqlUtil;

public class TrainDao {
	public boolean save(TrainDto dto) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "insert into train values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dto.getId());
			preparedStatement.setObject(2, dto.getTrainNo());
			preparedStatement.setObject(3, dto.getBoarding());
			preparedStatement.setObject(4, dto.getDestination());
			preparedStatement.setObject(5, dto.getSeatNo());
			preparedStatement.setObject(6, dto.getPrice());
			preparedStatement.setObject(7, dto.getCls());
			preparedStatement.setObject(8, dto.getName());
			int row = preparedStatement.executeUpdate();
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public boolean deleteByTrainNo(int trainNo) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "delete from train where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			int row = preparedStatement.executeUpdate();
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public boolean deleteByTrainNoAndId(int trainNo, int id) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "delete from train where trainNo=? and id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			preparedStatement.setObject(2, id);
			int row = preparedStatement.executeUpdate();
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public TrainDto getByTrainNo(int trainNo) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select*from train where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, trainNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return null;
	}

	public Collection<TrainDto> getAll() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String sql = "select*from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
			return collection;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return null;
	}

	public Collection<TrainDto> getAllByBoarding(String boarding) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String sql = "select*from train where boarding=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, boarding);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
			return collection;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return null;
	}

	public Collection<TrainDto> getAllByDestination(String destination) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String sql = "select*from train where destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, destination);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDto dto = new TrainDto();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
			return collection;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return null;
	}

	public boolean updateDestinationByTrainNo(String newDestination, int trainNo) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "update train set destination=? where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, newDestination);
			preparedStatement.setObject(2, trainNo);
			int row = preparedStatement.executeUpdate();
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public boolean updateDestinationAndBoardingByTrainNo(String newDestination, String newBoarding, int trainNo) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "update train set destination=?,boarding=? where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, newDestination);
			preparedStatement.setObject(2, newBoarding);
			preparedStatement.setObject(3, trainNo);
			int row = preparedStatement.executeUpdate();
			return row > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public int getTotal() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select count(*) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int rows = resultSet.getInt(1);
				return rows;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return 0;
	}
	
	public int getMaxPrice() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select max(price) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int price = resultSet.getInt(1);
				return price;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return 0;
	}
	
	public int getMinPrice() {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select min(price) from train";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int price = resultSet.getInt(1);
				return price;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return 0;
	}
}