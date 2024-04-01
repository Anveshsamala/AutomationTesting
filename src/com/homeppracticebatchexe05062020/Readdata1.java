package com.homeppracticebatchexe05062020;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Readdata1 
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C://test data/readwritedata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	String s=w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(s);
	System.out.println("execution success");
}
}
 