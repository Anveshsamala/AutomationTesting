package com.homepractice25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 
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
driver.findElementByXPath("//input[@value='Add New Project']").click();
WebElement dropdown = driver.findElementByName("customerId");
Select s1=new Select(dropdown);
s1.selectByVisibleText("chintu");
driver.findElementByName("name").sendKeys("Manual");
driver.findElementByName("createProjectSubmit").click();
String s=driver.findElementByClassName("successmsg").getText();
System.out.println(s);
driver.findElementByClassName("logoutImg").click();
}
}
