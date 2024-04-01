package com.amazon.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazonshopping 
{
	@Test
	public void amazon()
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia keyppad mobiles");
		
		driver.findElement(By.className("nav-input")).click();
		
		WebElement checkbox=driver.findElement(By.className("a-icon a-icon-checkbox"));
		Select s=new Select(checkbox);
		s.deselectByVisibleText("Nokia");
		
		driver.findElement(By.className("a-size-medium a-color-base a-text-normal")).click();
		
		
	}
}
