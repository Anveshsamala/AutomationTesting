package com.dec2020;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailscript 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://gmail.com/");
	driver.findElement(By.id("identifierId")).sendKeys("anveshsamala5949@gmail.com");
	
	
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	driver.findElement(By.className("password")).sendKeys("8499099085");
	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	
	
	
	
}
}
