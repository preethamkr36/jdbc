package com.xworkz.jdbc;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.dao.TrainDao;
import com.xworkz.jdbc.dto.TrainDto;

public class TrainTrigger {
	public static void main(String[] args) {
		Collection<TrainDto> collection = new ArrayList<TrainDto>();
		collection.add(new TrainDto(1, 6633, "Shimoga", "Bangaluru", 23, 115, "second", "Preetham"));
		collection.add(new TrainDto(2, 7754, "Bangaluru", "Shimoga", 65, 115, "second", "Preetham"));
		collection.add(new TrainDto(3, 7755, "Bangaluru", "Shimoga", 55, 115, "second", "Preetham"));
		TrainDao dao = new TrainDao();
		collection.forEach((e) -> System.out.println(dao.save(e)));
		dao.deleteByTrainNo(7755);
		dao.deleteByTrainNoAndId(7755, 3);
		TrainDto dto1 = dao.getByTrainNo(7754);
		System.out.println(dto1);
		Collection<TrainDto> dtoColl = dao.getAll();
		dtoColl.forEach((e) -> System.out.println(e));
		Collection<TrainDto> dtoColl2 = dao.getAllByBoarding("Bangaluru");
		dtoColl2.forEach((e) -> System.out.println(e));
		Collection<TrainDto> dtoColl3 = dao.getAllByDestination("Bangaluru");
		dtoColl3.forEach((e) -> System.out.println(e));
		dao.updateDestinationByTrainNo("Benaglore", 6633);
		dao.updateDestinationAndBoardingByTrainNo("Bangaluru", "Shivamogga", 6633);
		System.out.println(dao.getTotal());
		System.out.println(dao.getMaxPrice());
		System.out.println(dao.getMinPrice());
	}
}
