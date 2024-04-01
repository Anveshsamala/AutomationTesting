package com.Morningsession;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript13 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Anvesh/Desktop/HTML/Checkbox.html");
	List<WebElement> a1=driver.findElementsByXPath("//input[@type='Checkbox']");
	for(int i=0;i<a1.size();i++)
	{
		a1.get(i).click();
	}

	}

}
