package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropactions1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement d1=driver.findElement(By.id("draggable"));
	WebElement d2=driver.findElement(By.id("droppable"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(d1, d2).perform();
}
}
