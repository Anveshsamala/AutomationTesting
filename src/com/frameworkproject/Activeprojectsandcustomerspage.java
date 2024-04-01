package com.frameworkproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activeprojectsandcustomerspage 
{
@FindBy(xpath = "//input[@value='Add New Project']")
private WebElement clickonaddnewprojectbutton;

@FindBy(className = "logoutImg")
private WebElement retrivesuccessmsg;

public String retrivesuccessmsg()
{
	String s=retrivesuccessmsg.getText();
	return s;
}

public void clickonaddnewproject()
{
	clickonaddnewprojectbutton.click();
}
public Activeprojectsandcustomerspage()
{
	PageFactory.initElements(Basicclas1.driver, this);
}
}
