package DataDrivenProjectCreation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellOperation 
{

	public static String readdata(String sheetname, int rownumber, int cellnumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C://test data/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String s=w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return s;
	}
	public static void writedata(String sheetname, int rownumber, int cellnumber, String celldata) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C://test data/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(celldata);
		FileOutputStream fos=new FileOutputStream("C://test data/userdata.xlsx");
		w1.write(fos);
	}
	
}
