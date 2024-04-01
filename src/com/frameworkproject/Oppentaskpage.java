package com.frameworkproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oppentaskpage 
{
@FindBy(linkText = "Projects & Customers")
private WebElement clikonprojectsandcustomerslink;



public Oppentaskpage()
{
	PageFactory.initElements(Basicclas1.driver, this);
}
public void clickonprojectsandcustomerlink()
{
	clikonprojectsandcustomerslink.click();
}

}
