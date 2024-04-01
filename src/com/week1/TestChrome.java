package com.week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
public static void main(String[] args) 
{
 
System.setProperty("webdriver.chrome.driver", "path of the exe file\\chromedriver.exe");
 
// Initialize browser
ChromeDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.facebook.com");
 String s1=driver.getTitle();
 System.out.println(s1);
// Maximize browser
 
driver.manage().window().maximize();
 
}
} 