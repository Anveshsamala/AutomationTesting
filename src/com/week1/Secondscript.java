package com.week1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Secondscript 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
String s1=driver.getPageSource();
String s2=driver.getTitle();
String s3=driver.getCurrentUrl();
//driver.close();
//driver.quit();

}
}
