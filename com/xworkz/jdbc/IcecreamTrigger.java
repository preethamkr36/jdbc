package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.IcecreamDao;
import com.xworkz.jdbc.dto.IcecreamDto;

public class IcecreamTrigger {
	public static void main(String[] args) {
		IcecreamDto dto[] = new IcecreamDto[5];
		dto[0] = new IcecreamDto(1, "Strawberry", "Corenetto", 120);
		dto[1] = new IcecreamDto(2, "Mango", "Stonyfield", 80);
		dto[2] = new IcecreamDto(3, "ButterScotch", "Graeters", 110);
		dto[3] = new IcecreamDto(4, "Vanilla", "Amul", 90);
		dto[4] = new IcecreamDto(5, "Chocolate", "Arun", 70);

		IcecreamDao dao = new IcecreamDao();
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.save(dto[i]));
		}

		for (int i = 0; i < dto.length; i++) {
			// System.out.println(dao.delete(dto[i].getId()));
		}

		dao.display(1);

		dao.displayAll();

		dao.getCount();
	}
}
