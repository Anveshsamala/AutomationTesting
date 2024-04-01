package com.framework;
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
public class Base1 
{
public static WebDriver driver;	
WebElement browser;
@BeforeTest
public void openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String url=Excel1.readdata("Sheet1", 1, 0);
	String browser=Excel1.readdata("Sheet1", 1, 3);
	
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
	String un=Excel1.readdata("Sheet1", 1, 1);
	String psd=Excel1.readdata("Sheet1", 1, 2);
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
