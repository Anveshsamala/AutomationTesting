package com.Morningsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataShortCut 
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
{
	//Rule:before,we call create(), we should open workbook in read mode
		//1.Use FileInputStream class to open workbook in read mode 
	FileInputStream fis=new FileInputStream("C://test data//userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);//w1 contains workbook controls
	//to get sheet control, we use getSheet(String),pass sheetname as string argument
	String s=w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(s);
}
}
