package com.dec2020;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot1 
{
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	EventFiringWebDriver a=new EventFiringWebDriver(driver);
	File f1=a.getScreenshotAs(OutputType.FILE);
	File f2=new File("C://screenshot/bjdhfh.jpg");
	FileUtils.moveFile(f1, f2);
	
	}
}
