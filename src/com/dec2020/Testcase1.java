package com.dec2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/table/tbody/tr/td[8]/a")).click();
	
	driver.findElement(By.xpath("//input[@value='Add New User']")).click();
	
	driver.findElement(By.name("username")).sendKeys("priyanka");
	driver.findElement(By.name("passwordText")).sendKeys("priyanka");
	driver.findElement(By.name("passwordTextRetype")).sendKeys("priyanka");
	driver.findElement(By.name("firstName")).sendKeys("PriyanKa");
	driver.findElement(By.name("lastName")).sendKeys("DUDEM");
	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	
	String s=driver.findElement(By.className("successmsg")).getText();
	System.out.println(s);
	
	
	}

}
