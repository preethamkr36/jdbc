package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.CountryDao;
import com.xworkz.jdbc.dto.CountryDto;

public class CountryTrigger {
	public static void main(String[] args) {
		CountryDto dto[] = new CountryDto[5];
		dto[0] = new CountryDto(1, "India", 91, "Asia");
		dto[1] = new CountryDto(2, "USA", 01, "North America");
		dto[2] = new CountryDto(3, "Kenya", 254, "Africa");
		dto[3] = new CountryDto(4, "Japan", 81, "Asia");
		dto[4] = new CountryDto(5, "Belgium", 32, "Europe");

		CountryDao dao = new CountryDao();
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.save(dto[i]));
		}

		for (int i = 0; i < dto.length; i++) {
			 //System.out.println(dao.delete(dto[i].getId()));
		}
	}
}