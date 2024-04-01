package com.Morningsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



public class Testscript15 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByName("username").sendKeys("admin");
		driver.findElementByName("pwd").sendKeys("manager");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByLinkText("Reports").click();
		String main=driver.getWindowHandle();
		driver.switchTo().window(main);
		driver.findElementByXPath("//img[@alt='Click Here to Pick up the date']").click();
		java.util.Set<String> a1 = driver.getWindowHandles();
		
		for(String s:a1)
		{
			driver.switchTo().window(s);
			if(driver.getTitle().contains("Calendar"))
			{
				driver.findElementByXPath("//span[text()='5']").click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(main);
		driver.findElementByClassName("logoutImg").click();
		
	}

}
