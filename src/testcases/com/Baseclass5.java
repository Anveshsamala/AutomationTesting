package testcases.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass5 
{
	public static WebDriver driver;
	@BeforeTest
public void openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String browser=Exceloperation5.readdata("Sheet1", 1, 3);
	String url=Exceloperation5.readdata("Sheet1", 1, 0);
	
	
	if(browser.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
	@AfterTest
public void closebrowser()
{
	driver.close();
}
	@BeforeMethod
public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
{
		String un=Exceloperation5.readdata("Sheet1", 1, 1);
		String psd=Exceloperation5.readdata("Sheet1", 1, 2);
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
	@AfterMethod
public void logout()
{
	WebElement w1 = driver.findElement(By.linkText("s. anvesh"));
	Actions a1=new Actions(driver);
	a1.moveToElement(w1).perform();
	driver.findElement(By.linkText("Logout")).click();
}
}
