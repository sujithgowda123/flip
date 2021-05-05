package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class Excelutility {
	public static void main(String[] args) throws IOException
	{
		File src= new File("C:\\exceldata\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String data=c.toString();
		System.out.println(data);
		wb.close();
	}
	

}
