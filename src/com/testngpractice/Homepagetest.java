package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepagetest 
{
	WebDriver driver;
@BeforeClass
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("open browser");
}
@BeforeMethod
public void enterurl()
{
	driver.get("http://www.google.com");
	System.out.println("enter url");
}
@Test(priority = 1)
public void titletest()
{
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println("title test");
	
}
@Test(priority = 2,dependsOnMethods = "titletest")
public void logotest()
{
	String logo=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).getText();
	System.out.println(logo);
	System.out.println("logo test");
}
@Test(priority = 3,dependsOnMethods = "titletest")
public void texttest()
{
	String text=driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(text);
	System.out.println("text test");
}
@AfterMethod
public void enterurl1()
{
	System.out.println("enter url 1 test");
}
@AfterClass
public void closebrowser()
{
	System.out.println("close test");
	driver.close();
}
}
