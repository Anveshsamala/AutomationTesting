package com.homeppracticebatchexe05062020;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass1
{
	public static WebDriver driver;
	@BeforeTest
public void openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
{
		String url=Exceloperation1.readdata("Sheet1", 1, 0);
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String un=Exceloperation1.readdata("Sheet1", 1, 1);
		String psd=Exceloperation1.readdata("Sheet1", 1, 2);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
}
