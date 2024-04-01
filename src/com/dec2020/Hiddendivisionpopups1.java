package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopups1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.linkText("Projects & Customers")).click();
	
	driver.findElement(By.linkText("CHINTU101")).click();
	
	driver.findElement(By.name("name")).clear();
	
	driver.findElement(By.linkText("Archives")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='Discard Changes']")).click();
	
	driver.findElement(By.className("logoutImg")).click();
}
}
