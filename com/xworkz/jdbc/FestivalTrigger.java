package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.FestivalDao;
import com.xworkz.jdbc.dto.FestivalDto;

public class FestivalTrigger {
	public static void main(String[] args) {
		FestivalDto dto[] = new FestivalDto[5];
		dto[0] = new FestivalDto(1, "Shankranthi", "2022-01-14", "Karnataka");
		dto[1] = new FestivalDto(2, "Holli", "2022-03-18", "Karnataka");
		dto[2] = new FestivalDto(3, "Dipavalli", "2022-10-22", "Karnataka");
		dto[3] = new FestivalDto(4, "Ugadi", "2022-04-02", "Karnataka");
		dto[4] = new FestivalDto(5, "Gamesh Chatruthi", "2022-08-31", "Karnataka");

		FestivalDao dao = new FestivalDao();
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