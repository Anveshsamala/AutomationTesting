package com.framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer 
{
public AddNewCustomer()
{
	PageFactory.initElements(Base1.driver, this);
}
@FindBy(name = "name")
private WebElement customernametestfield;
@FindBy(name = "createCustomerSubmit")
private WebElement createcustomerbutton;

public void customernametextfield(String cname) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	
	customernametestfield.sendKeys(cname);
}
public void createcustomerbutton()
{
	createcustomerbutton.click();
}
}
