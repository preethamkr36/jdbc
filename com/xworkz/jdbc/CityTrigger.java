package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.CityDao;
import com.xworkz.jdbc.dto.CityDto;

public class CityTrigger {
	public static void main(String[] args) {
		CityDto dto[] = new CityDto[5];
		dto[0] = new CityDto(1, "Shimoga", 323000L, "Malnad");
		dto[1] = new CityDto(2, "Bangaluru", 8440000L, "IT Companies");
		dto[2] = new CityDto(3, "Mysore", 921000L, "Clean");
		dto[3] = new CityDto(4, "Delhi", 19000000L, "Food");
		dto[4] = new CityDto(5, "Chikmagalur", 118000L, "Nature");

		CityDao dao = new CityDao();

		for (int i = 0; i < dto.length; i++) {
			// System.out.println(dao.save(dto[i]));
		}

		for (int i = 0; i < dto.length; i++) {
			// System.out.println(dao.delete(dto[i].getId()));
		}

		dao.display(1);

		dao.displayAll();

		dao.getCount();
	}
}
