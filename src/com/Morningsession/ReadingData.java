package com.Morningsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException
{
	//Rule:before,we call create(), we should open workbook in read mode
	//1.Use FileInputStream class to open workbook in read mode 
FileInputStream fis=new FileInputStream("C://test data//userdata.xlsx");
Workbook w1 = WorkbookFactory.create(fis);//w1 contains workbook controls
//to get sheet control, we use getSheet(String),pass sheetname as string argument

Sheet s1 =w1.getSheet("Sheet1");//s1 contains Sheet controlls
//to get row control, we use getRow(int),pass row number as int argument
Row r1=((org.apache.poi.ss.usermodel.Sheet) s1).getRow(1);//r1 contains row controls
//to get cell control, we use getCell(int),pass cell number as int argument
Cell c1=r1.getCell(1); //c1 contains cell controls
//to read the data from the cell , we should use getStringCellValue():String
String s=c1.getStringCellValue();
System.out.println(s);
}
}
