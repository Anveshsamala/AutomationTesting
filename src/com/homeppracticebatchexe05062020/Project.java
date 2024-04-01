package com.homeppracticebatchexe05062020;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Project extends Baseclass1 
{
@Test
public void project() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String pn=Exceloperation1.readdata("Sheet2", 2, 0);
	String exp=Exceloperation1.readdata("Sheet2", 2, 1);
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
	
	WebElement dropdown = driver.findElement(By.name("customerId"));
	Select s1=new Select(dropdown);
	s1.selectByVisibleText("111");
	
	driver.findElement(By.name("name")).sendKeys(pn);
	driver.findElement(By.name("createProjectSubmit")).click();
	String act=driver.findElement(By.className("successmsg")).getText();
	Exceloperation1.writedata("Sheet2", 2, 2, act);
	if(exp.equals(act))
	{
		Exceloperation1.writedata("Sheet2", 2, 3, "pass");
	}
	else
	{
		Exceloperation1.writedata("Sheet2", 2, 3, "fail");
	}
}
}
