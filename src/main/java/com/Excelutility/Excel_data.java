package com.Excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data {
	public  String excel_username(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\Testdata\\swag.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheetAt(0);
		 /*  int count=sheet.getLastRowNum();
		      System.out.println(count);
		      XSSFRow row =sheet.getRow(a);
			  XSSFCell cell=row.getCell(0);*/
			  String un=sheet.getRow(a).getCell(0).getStringCellValue();
			  return un;
}
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\Testdata\\swag.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheetAt(0);
		  //int count=sheet.getLastRowNum();
		 /* System.out.println(count);
		  XSSFRow row =sheet.getRow(b);
		  XSSFCell cell1=row.getCell(1);*/
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  return pwd;
}
}