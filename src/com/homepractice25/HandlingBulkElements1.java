package com.homepractice25;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBulkElements1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Anvesh/Desktop/HTML/Multiplecheckboxes.html");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

List<WebElement> a1 = driver.findElementsByXPath("//input[@type='CheckBox']");
for(int i=0;i<a1.size();i++)
{
	a1.get(i).click();
}
}
}
