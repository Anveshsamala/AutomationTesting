package com.Morningsession;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataintoCellShotcut 
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
{
	
FileInputStream fis=new FileInputStream("C://test data//userdata.xlsx");
Workbook w1 = WorkbookFactory.create(fis);
w1.getSheet("Sheet1").createRow(3).createCell(4).setCellValue("Java completed");
FileOutputStream fos=new FileOutputStream("C://test data//userdata.xlsx");
w1.write(fos);
System.out.println("Execution finished");

}
}
