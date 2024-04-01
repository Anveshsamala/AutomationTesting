package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement abc=driver.findElement(By.className("sf-with-ul"));

Actions a=new Actions(driver);

a.moveToElement(abc).perform();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.linkText("T-shirts")).click();



}
}
