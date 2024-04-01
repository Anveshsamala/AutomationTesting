package com.Morningsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testscript10 
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
		WebElement w1 = driver.findElementByLinkText("Projects & Customers");
		Actions a1=new Actions(driver);
		a1.contextClick(w1).perform();
		
	}

}
