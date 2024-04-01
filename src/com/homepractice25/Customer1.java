package com.homepractice25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Customer1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementByName("username").sendKeys("admin");
driver.findElementByName("pwd").sendKeys("manager");
driver.findElementByXPath("//input[@type='submit']").click();
driver.findElementByLinkText("Projects & Customers").click();
driver.findElementByXPath("//input[@value='Add New Customer']").click();
driver.findElementByName("name").sendKeys("RAHULS");
driver.findElementByXPath("//input[@value='Create Customer']").click();
driver.findElementByClassName("successmsg");
driver.findElementByClassName("logoutImg").click();
}
}
