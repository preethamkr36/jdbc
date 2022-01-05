package com.xworkz.excel.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.excel.Trigger;
import com.xworkz.excel.dto.SportDto;

public class SportDao {
	public Collection<SportDto> readFromExcel() {
		File file = new File("D:\\X Workz\\excel\\sport.xlsx");
		Collection<SportDto> collection = new ArrayList<SportDto>();
		XSSFWorkbook workbook = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowcount = sheet.getPhysicalNumberOfRows();
			for (int i = 1; i < rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				SportDto dto = new SportDto();
				dto.setId(row.getCell(0).getNumericCellValue());
				dto.setSport(row.getCell(1).getStringCellValue());
				dto.setPlayer(row.getCell(2).getStringCellValue());
				dto.setCountry(row.getCell(3).getStringCellValue());
				dto.setAge(row.getCell(4).getNumericCellValue());
				collection.add(dto);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return collection;
	}

	public void writeToExcel(Collection<SportDto> collection) {
		File file = new File("D:\\X Workz\\excel\\s.xlsx");
		XSSFWorkbook workbook = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("sport");
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("Id");
			sheet.getRow(0).createCell(1).setCellValue("Sport");
			sheet.getRow(0).createCell(2).setCellValue("Player");
			sheet.getRow(0).createCell(3).setCellValue("Country");
			sheet.getRow(0).createCell(4).setCellValue("Age");
			collection.forEach((dto) -> {
				sheet.createRow(Trigger.r);
				sheet.getRow(Trigger.r).createCell(0).setCellValue(dto.getId());
				sheet.getRow(Trigger.r).createCell(1).setCellValue(dto.getSport());
				sheet.getRow(Trigger.r).createCell(2).setCellValue(dto.getPlayer());
				sheet.getRow(Trigger.r).createCell(3).setCellValue(dto.getCountry());
				sheet.getRow(Trigger.r).createCell(4).setCellValue(dto.getAge());
				Trigger.r = Trigger.r + 1;
			});

			workbook.write(fileOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
