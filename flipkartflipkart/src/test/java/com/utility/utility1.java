package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility1 {
	public static void main(String[] args) throws IOException
	{
	File src= new File("C:\\exceldata\\TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	int rowcount=sh.getLastRowNum();
	System.out.println("the total number of rows is:"+(rowcount+1));
	for(int i=0;i<=rowcount;i++)
	{
		String data=sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println("test data from excel is"+data);
				wb.close();
	}

}
}
