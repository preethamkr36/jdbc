package com.xworkz.excel;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.excel.dao.SportDao;
import com.xworkz.excel.dto.SportDto;

public class Trigger {
	public static int r = 1;

	public static void main(String[] args) {

		Collection<SportDto> collection = new ArrayList<SportDto>();

		SportDao dao = new SportDao();
		collection = dao.readFromExcel();
		collection.forEach((dto) -> System.out.println(dto));

		dao.writeToExcel(collection);
	}
}