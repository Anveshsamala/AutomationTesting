package com.frameworkproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excelop2 
{
public static String readdata(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C://test data/readwritedata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	String s=w1.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return s;
}
public static void writedata(String sheetname, int rownum, int cellnum, String celldata) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C://test data/readwritedata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	w1.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(celldata);
	FileOutputStream fos=new FileOutputStream("C://test data/readwritedata.xlsx");
	w1.write(fos);
}

}
