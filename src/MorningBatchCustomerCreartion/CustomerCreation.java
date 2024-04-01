package MorningBatchCustomerCreartion;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerCreation extends BaseClass
{
	@Test
public void testCustometCreation() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String cn=ExcelOperation.readdata("Sheet3", 1, 0);
	String Exp=ExcelOperation.readdata("Sheet3", 1, 1);
	OpenTaskPage otp=new OpenTaskPage();
	
	otp.clickOnProjectsAndCUstomersLink();
	
	ActivePProjectsAndCustomerPage apcp=new ActivePProjectsAndCustomerPage();
	apcp.clickOnAddNewCustomerButton();
	
	
	AddNewCustomerPage acp=new AddNewCustomerPage();
	acp.enterCustomerName(cn);
	acp.clickOnCreateCustomerButton();
	
	
	String Act=apcp.retriveSuccessMessage();
	
	ExcelOperation.writedata("Sheet3", 1, 2, Act);
	
	try
	{
		Assert.assertEquals(Exp, Act);
		ExcelOperation.writedata("Sheet3", 1, 3, "Pass");
	}
	catch(AssertionError rv)
	{
		ExcelOperation.writedata("Sheet3", 1, 3, "Fail");
	}
	
}
}
