package com.Morningsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testscript7 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByName("username").sendKeys("admin");
	driver.findElementByName("pwd").sendKeys("manager");
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByLinkText("Reports").click();
	WebElement dropdown = driver.findElementByName("users");
	Select s1=new Select(dropdown);
	s1.selectByIndex(0);
	s1.selectByIndex(1);
	s1.selectByIndex(2);
	
	s1.deselectByIndex(0);
	}

}
