package com.framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Customer1  extends Base1
{
@Test
public void customercreation() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String cn=Excel1.readdata("Sheet2", 1, 0);
	String exp=Excel1.readdata("Sheet2", 1, 1);
	OpenTasks ot=new OpenTasks();
	ot.projectsandcustomerslink();
	ActiveProjectsandCustomers apc=new ActiveProjectsandCustomers();
	apc.addnewcustomer();
	AddNewCustomer anc=new AddNewCustomer();
	anc.customernametextfield(cn);
	anc.createcustomerbutton();
	String act=apc.retrivesuccessmsg();
	Excel1.writedata("Sheet2", 1, 2, act);
	
	try
	{
		Assert.assertTrue(exp.equals(act));
		Excel1.writedata("Sheet2", 1, 3, "pass");
	}
	catch (AssertionError rv) 
	{
		Excel1.writedata("Sheet2", 1, 3, "fail");
	}
}
}
