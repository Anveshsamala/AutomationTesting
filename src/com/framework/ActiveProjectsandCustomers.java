package com.framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsandCustomers
{
	public  ActiveProjectsandCustomers() 
	{
		PageFactory.initElements(Base1.driver, this);
	}
	@FindBy(xpath = "//input[@value='Add New Customer']")
private WebElement AddNewCustomer;
	@FindBy(className = "successmsg")
private WebElement retrivesuccessmsg;
	
	public void addnewcustomer()
	{
		AddNewCustomer.click();
	}
	public String retrivesuccessmsg() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String act=retrivesuccessmsg.getText();
		
		return  act;
		
	}
}
