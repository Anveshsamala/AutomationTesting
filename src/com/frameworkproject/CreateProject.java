 package com.frameworkproject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateProject extends Basicclas1
{
@Test
public void createproject() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String pname=Excelop2.readdata("Sheet3", 1, 0);
	String exp=Excelop2.readdata("Sheet3", 1, 1);
	
	Oppentaskpage opt=new Oppentaskpage();
	opt.clickonprojectsandcustomerlink();
	
	Activeprojectsandcustomerspage apcp=new Activeprojectsandcustomerspage();
	apcp.clickonaddnewproject();
	
	Addnewpproject anp=new Addnewpproject();
	anp.selectcustomername();
	anp.enterprojectname(pname);
	anp.clickoncreateprojectbutton();
	String act=apcp.retrivesuccessmsg();
	
	Excelop2.writedata("Sheet3", 1, 2, act);
	try
	{
		Assert.assertEquals(act, exp);
		Excelop2.writedata("Sheet3", 1, 3, "pass");
	}
	catch (AssertionError rv) 
	{
		Excelop2.writedata("Sheet3", 1, 3, "fail");
	} 
}
}
