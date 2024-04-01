package com.Morningsession;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Testscript11 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement w1 = driver.findElementById("draggable");
	WebElement w2 = driver.findElementById("droppable");
	Actions a1=new Actions(driver);
	a1.dragAndDrop(w1, w2).perform();
	}
}
