package DataDrivenCreatBill;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBill extends BasClass
{
@Test
public void creatbill() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String bn=ExcelOperatio.readdata("Sheet4", 1, 0);
	String Exp=ExcelOperatio.readdata("Sheet4", 1, 1);
	
	OpenTaskPag ot=new OpenTaskPag();
	ot.clickonsettingslink();
	
	BillingTyesPage bt=new BillingTyesPage();
	bt.clickonaddnewbillingtype();
	
	AddNewBillingTypes ad=new AddNewBillingTypes();
	ad.billingtypename(bn);
	ad.clickoncreatebillingtype();
	
	String Act=bt.retriveSuccessMessage();
	
	ExcelOperatio.writedata("Sheet4", 1, 2, Act);
	
	try
	{
		Assert.assertEquals(Exp, Act);
		ExcelOperatio.writedata("Sheet4", 1, 3, "Pass");
	}
	catch(AssertionError rv)
	{
		ExcelOperatio.writedata("Sheet4", 1, 3, "Fail");
	}
}
}
