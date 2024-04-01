package com.homepractice25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class User1 
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

driver.findElementByLinkText("Users").click();
driver.findElementByXPath("//input[@value='Add New User']").click();
driver.findElementByName("username").sendKeys("anvesh");
driver.findElementByName("passwordText").sendKeys("Rahul123@");
driver.findElementByName("passwordTextRetype").sendKeys("Rahul123@");
driver.findElementByName("firstName").sendKeys("samala");
driver.findElementByName("lastName").sendKeys("anvesh");
driver.findElementByXPath("//input[@value='   Create User   ']").click();
String s=driver.findElementByClassName("successmsg").getText();
System.out.println(s);
driver.findElementByClassName("logoutImg").click();
}
}
