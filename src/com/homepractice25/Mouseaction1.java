package com.homepractice25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement w1 = driver.findElementByClassName("sf-with-ul");
Actions a1=new Actions(driver);
a1.moveToElement(w1).perform();
driver.findElementByLinkText("T-shirts").click();
}
}
