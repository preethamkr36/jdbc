package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.WaterfallsDao;
import com.xworkz.jdbc.dto.WaterfallsDto;

public interface WaterfallsTrigger {
	public static void main(String[] args) {
		WaterfallsDto dto1=new WaterfallsDto(2, "Hebbe", "Chikmangalur", 168d, "Bhadra");
		WaterfallsDto dto2=new WaterfallsDto(3, "Shivanasamudra", "Chamarajanagar", 98d, "Kaveri");
		WaterfallsDao dao=new WaterfallsDao();
		//dao.save(dto1);
		//dao.save(dto2);
		dao.delete(3);
	}
}
