package com.xworkz.mobile;

import com.xworkz.mobile.dao.MobileDao;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.exception.IdException;

public class MobileTrigger {
	public static void main(String[] args) {
		MobileDto dto[] = new MobileDto[3];
		dto[0] = new MobileDto(1, "realme", "7", "EAMRQK9THI5TGEZ5", 14999, 4, 64);
		dto[1] = new MobileDto(2, "vivo", "Y93", "JDBFKHBSD2J23JW5", 13000, 2, 64);
		dto[2] = new MobileDto(3, "redmi", "Note 4", "LKSDNFJSHF4JLJDF4", 12999, 1, 64);

		MobileDao dao = new MobileDao();

		for (int i = 0; i < dto.length; i++) {
			dao.save(dto[i]);
		}

		dao.getAll();

		int id = 5;
		if (id == 0) {
			throw new IdException();
		} else {
			System.out.println(dao.deleteById(id));
		}

		dao.updateBySerialNumber("LKSDNFJSHF4JLJDF4", 2);

		dao.getAllByName("vivo");
	}
}