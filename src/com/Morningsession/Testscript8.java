package com.Morningsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript8 
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
driver.findElementByLinkText("456789").click();
driver.findElementByXPath("//input[@value='Delete This Customer']").click();
String s=driver.switchTo().alert().getText();
System.out.println(s);
driver.switchTo().alert().accept();
}
}
