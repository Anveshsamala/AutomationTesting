package MorningBatchBaseClassDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public static WebDriver driver;
	@BeforeTest
public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String url=EcellOperator.readdata("Sheet1",1,0);
	String browser=EcellOperator.readdata("Sheet1", 1, 3);
	if(browser.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	//ChromeDriver driver=new ChromeDriver();
	driver=new ChromeDriver();
	}
	else if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C://drivers/firefoxdriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
}
	@AfterTest
public void closeBrowser()
{
	driver.close();
}
	@BeforeClass
public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String un=EcellOperator.readdata("Sheet1", 1, 1);
	String psd=EcellOperator.readdata("Sheet1", 1, 2);
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(psd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
	@AfterClass
public void logout()
{
	driver.findElement(By.className("logoutImg")).click();
}
}
