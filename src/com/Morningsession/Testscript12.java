package com.Morningsession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testscript12 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		EventFiringWebDriver rv1=new EventFiringWebDriver(driver);
		File f1 = rv1.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Screenshot//Login.jpg");
		FileUtils.moveFile(f1, f2);
		
		

	}

}
