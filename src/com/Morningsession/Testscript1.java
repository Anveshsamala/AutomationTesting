package com.Morningsession;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testscript1 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:\\Users\\Anvesh\\Desktop\\HTML\\Sample.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("tf1").sendKeys("admin");
	driver.findElementById("tf2").sendKeys("manager@gmail.com");
	driver.findElementById("tf3").sendKeys("manager");
	driver.findElementByClassName("male").click();
	driver.findElement(By.xpath("//input[@value='Login'")).click();
	}
}
