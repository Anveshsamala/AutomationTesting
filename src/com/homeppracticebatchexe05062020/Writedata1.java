package com.homeppracticebatchexe05062020;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Writedata1 
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
{
	FileInputStream fis=new FileInputStream("C://test data/readwritedata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	w1.getSheet("sheet1").createRow(1).createCell(2).setCellValue("selenium");
	FileOutputStream fos=new FileOutputStream("C://test data/readwritedata.xlsx");
	w1.write(fos);
	System.out.println("execution success");
}
}
