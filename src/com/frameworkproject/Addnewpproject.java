package com.frameworkproject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Addnewpproject 
{
	@FindBy(name = "name")
	private WebElement enterprojectname;
	
	@FindBy(name = "customerId")
	private WebElement selectcustomername;
	
	@FindBy(name = "createProjectSubmit")
	private WebElement clickoncreatebutton;
	
	public void enterprojectname(String pname)
	{
		enterprojectname.sendKeys(pname);
	}
	
	public void selectcustomername()
	{
		Select s1=new Select(selectcustomername);
		s1.selectByVisibleText("111");
	}
	
	public void clickoncreateprojectbutton()
	{
		clickoncreatebutton.click();
	}
}
