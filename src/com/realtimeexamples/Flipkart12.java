package com.realtimeexamples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;



public class Flipkart12 
{
	@Test
public void flipkart12() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.flipkart.com/");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	EventFiringWebDriver rv1=new EventFiringWebDriver(driver);
	File f1=rv1.getScreenshotAs(OutputType.FILE);
	File f2=new File("C://Screenshot/image.jpg");
	FileUtils.moveFile(f1, f2);
	
	
	
	
	
}
}
