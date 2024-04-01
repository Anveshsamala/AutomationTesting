package com.homeppracticebatchexe05062020;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Customer extends Baseclass1
{
	@Test
public void customer() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String cn=Exceloperation1.readdata("Sheet2", 1, 0);
	String exp=Exceloperation1.readdata("Sheet2", 1, 1);
	
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys(cn);
	driver.findElement(By.name("createCustomerSubmit")).click();
	String act=driver.findElement(By.className("successmsg")).getText();
	Exceloperation1.writedata("Sheet2", 1, 2, act);
	
	if(exp.equals(act))
	{
		Exceloperation1.writedata("Sheet2", 1, 3, "pass");
	}
	else
	{
		Exceloperation1.writedata("Sheet2", 1, 3, "fail");
	}
}
}
