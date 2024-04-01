package com.dec2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplecheckbox1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Anvesh/Desktop/HTML/Checkbox.html");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
	List <WebElement> a=driver.findElements(By.xpath("//input[@type='Checkbox']"));
	for(int i=0;i<a.size();i++)
	{
		a.get(i).click();
	}
}
}
