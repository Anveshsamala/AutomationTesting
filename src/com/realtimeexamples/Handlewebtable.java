package com.realtimeexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlewebtable 
{
	@Test
public void handlewebtable() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);
	
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	//*[@id="customers"]/tbody/tr[4]/td[1]
	
	//*[@id="customers"]/tbody/tr[7]/td[1]
	
	//table[@id="customers"]/tbody/tr
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
	int rowcount=rows.size();
	System.out.println("Total no of rows= "+rowcount);
	
	String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
	String afterxpath="]/td[1]";
	for(int i=2;i<=rowcount;i++)
	{
		String actualxpath=beforexpath+i+afterxpath;
		WebElement Companyname=driver.findElement(By.xpath(actualxpath));
		
		System.out.println(Companyname.getText());
		
	}
	System.out.println();
	
	String aftexpath="]/td[2]";
	for(int i=2;i<=rowcount;i++)
	{
		String actualxpath=beforexpath+i+aftexpath;
		WebElement Contact=driver.findElement(By.xpath(actualxpath));
		
		System.out.println(Contact.getText());
		
	}
	
System.out.println();
	
	String aftxpath="]/td[3]";
	for(int i=2;i<=rowcount;i++)
	{
		String actualxpath=beforexpath+i+aftxpath;
		WebElement Country=driver.findElement(By.xpath(actualxpath));
		
		System.out.println(Country.getText());
		
	}
}
}
