package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.StateDao;
import com.xworkz.jdbc.dto.StateDto;

public class StateTrigger {
	public static void main(String[] args) {
		StateDto dto[] = new StateDto[5];
		dto[0] = new StateDto(1, "Karnataka", "080", "Bangaluru");
		dto[1] = new StateDto(2, "Gujarat", "079", "Gandhinagar");
		dto[2] = new StateDto(3, "Himachal Pradesh", "091", "Shimla");
		dto[3] = new StateDto(4, "Kerala", "494", "Thiruvananthapuram");
		dto[4] = new StateDto(5, "Punjab", "016", "Chandigarh");

		StateDao dao = new StateDao();

		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.save(dto[i]));
		}

		for (int i = 0; i < dto.length; i++) {
			//System.out.println(dao.delete(dto[i].getId()));
		}
	}
}
