package com.homepractice25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\drivers.chromedriver");
ChromeDriver driver=new ChromeDriver();
driver.get("www.facebook.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementById("tf1").sendKeys("admin");
driver.findElementById("tf2").sendKeys("manager");
driver.findElementByXPath("//input[@value='Login']").click();

}
}
