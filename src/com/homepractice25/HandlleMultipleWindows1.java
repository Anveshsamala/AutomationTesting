package com.homepractice25;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlleMultipleWindows1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElementByName("username").sendKeys("admin");
driver.findElementByName("pwd").sendKeys("manager");
driver.findElementByXPath("//input[@type='submit']").click();

driver.findElementByLinkText("Reports").click();
String main = driver.getWindowHandle();
driver.switchTo().window(main);

driver.findElementByXPath("//img[@alt='Click Here to Pick up the date']").click();
Set<String> a1 = driver.getWindowHandles();
for(String s:a1)
{
	driver.switchTo().window(s);
	if(driver.getTitle().contains("Calendar"))
	{
		//driver.findElementByClassName("calendarCurrentMonthWeekendDay").click();
		driver.findElementByXPath("//span[text()='31']").click();
		break;
		
	}
}
driver.switchTo().window(main);


}
}
