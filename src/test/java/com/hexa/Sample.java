package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Sample {
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\kaushiikk.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Datee");
	Row r = s.getRow(3);
	org.apache.poi.ss.usermodel.Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	if(value.equals("Suresh"))
			{
		c.setCellValue("Automation");
			}
	FileOutputStream fOut = new FileOutputStream(f);
	w.write(fOut);
	System.out.println("Done");

	

	
	}
}