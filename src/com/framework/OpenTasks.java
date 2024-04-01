package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasks 
{
public OpenTasks()
{
	PageFactory.initElements(Base1.driver, this);
}
@FindBy(linkText = "Projects & Customers")

private WebElement projectsandcustomerslink;
public void projectsandcustomerslink()
{
	projectsandcustomerslink.click();
}
}
