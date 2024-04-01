package com.frameworkproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Basicclas1 
{
	public static WebDriver driver;
	WebElement browser;
	@BeforeTest
public void openbroswer() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String url=Excelop2.readdata("Sheet1", 3, 0);
	String browser=Excelop2.readdata("Sheet1", 3, 3);
	
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C://drivers.geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String un=Excelop2.readdata("Sheet1", 3, 1);
		String psd=Excelop2.readdata("Sheet1", 3, 2);
		
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
