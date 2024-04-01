package com.realtimeexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart 
{
	@Test
	public void flipkart()
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']"));
		username.sendKeys("8499099085");
		
		WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("8499099085");
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c' ]"));
		loginbtn.click();
		
		
		
				
	}
}
