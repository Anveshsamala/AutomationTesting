package com.realtimeexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook 
{
	@Test
public void facebook() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	Thread.sleep(2000);
	
	WebElement fstname=driver.findElement(By.xpath("//*[@id=\"u_1_b\"]"));
	fstname.sendKeys("8499099085");
	
	WebElement password=driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
	password.sendKeys("8499099085");
	Thread.sleep(2000);
	
	Select ref=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	ref.selectByVisibleText("30");
	Thread.sleep(2000);
	
	Select ref1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	ref1.selectByIndex(1);
	
	Select ref2=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	ref2.selectByValue("1994");
	Thread.sleep(2000);
	
	WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"u_1_2\"]"));
	checkbox.click();
	Thread.sleep(2000);
	
	WebElement signupbtn=driver.findElement(By.xpath("//*[@id=\"u_1_s\"]"));
	signupbtn.click();
	Thread.sleep(2000);
	
	driver.navigate().back();

	WebElement btn=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/table/tbody/tr[1]/td[1]/div/span/h3/a"));
	btn.click();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	
	
	
	
}
}
