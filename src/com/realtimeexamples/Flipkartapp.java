package com.realtimeexamples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkartapp 
{
	@Test
public void flipkart() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ']").sendKeys("8499099085");
		driver.findElementByXPath("//input[@type='password']").sendKeys("8499099085");
		driver.findElementByClassName("_1avdGP").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("nokia keypad mobiles");
		Thread.sleep(2000);
		driver.findElementByClassName("vh79eN").click();
		
		
}
}
