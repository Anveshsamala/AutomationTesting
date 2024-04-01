package MorningBatchBaseClassDataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerCreation extends BaseClass
{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	String cn=EcellOperator.readdata("Sheet3", 1, 0);
	String Exp=EcellOperator.readdata("Sheet3", 1, 1);
	
		OpenTaskPage otp=new  OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		
		AddNewCustomerpage ancp=new AddNewCustomerpage();
		ancp.enterCustomerName(cn);
		ancp.createCustomerButton();
		
		ActiveProjectsandCustomerPage apcp=new ActiveProjectsandCustomerPage();
		apcp.addNewCustomerButton();
		String Act=apcp.retriveSuccessMessage();

	
	EcellOperator.writedata("Sheet3", 1, 2, Act);
	
	try
	{
		Assert.assertEquals(Act, Exp);
		EcellOperator.writedata("Sheet3", 1, 3, "pass");
		
	}
	catch(AssertionError rv)
	{
		EcellOperator.writedata("Sheet3", 1, 3, "fail");
	}
	
}
}
