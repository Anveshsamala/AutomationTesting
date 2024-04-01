package com.Morningsession;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class WritingDataIntoExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException
{
	FileInputStream fis=new FileInputStream("C://test data//userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	Sheet s1 = w1.getSheet("Sheet1");
	Row r1 = s1.createRow(2);
	Cell c1 = r1.createCell(3);
	c1.setCellValue("Selenium");
	
FileOutputStream fos=new FileOutputStream("C://test data//userdata.xlsx");
w1.write(fos);
System.out.println("Execution success");
}
}
