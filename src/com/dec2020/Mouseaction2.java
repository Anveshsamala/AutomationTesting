package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseaction2 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
	
driver.findElement(By.xpath("//input[@type='submit']")).click();

WebElement abc=driver.findElement(By.linkText("Projects & Customers"));
Actions c=new Actions(driver);
c.contextClick(abc).perform();

}
}
