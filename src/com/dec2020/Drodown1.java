package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drodown1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
	
driver.findElement(By.xpath("//input[@type='submit']")).click();


driver.findElement(By.linkText("Reports")).click();

WebElement drodown=driver.findElement(By.xpath("//*[@id=\"container\"]/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/label"));
Select s=new Select(drodown);

s.selectByIndex(0);
s.selectByIndex(1);
s.selectByIndex(2);

s.deselectByIndex(0);

}
}
