package com.homepractice25;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class GtScreenshoteventfiring1 
{
public static void main(String[] args) throws IOException 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElementByName("username").sendKeys("admin");
driver.findElementByName("pwd").sendKeys("manager");
driver.findElementByXPath("//input[@type='submit']").click();

EventFiringWebDriver rv1=new EventFiringWebDriver(driver);
File f1 = rv1.getScreenshotAs(OutputType.FILE);
File f2=new File("C:\\Screenshot/login8.jpg");
FileUtils.moveFile(f1, f2);

}
}
