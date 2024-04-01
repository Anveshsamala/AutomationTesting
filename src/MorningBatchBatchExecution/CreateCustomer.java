package MorningBatchBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer 
{
@Test
public void testCreateCustomer()
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElementByName("username").sendKeys("admin");
	driver.findElementByName("pwd").sendKeys("manager");
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByLinkText("Projects & Customers").click();
	driver.findElementByXPath("//input[@value='Add New Customer']").click();
	driver.findElementByName("name").sendKeys("Srinivasswapna");
	driver.findElementByName("createCustomerSubmit").click();
	String s=driver.findElementByClassName("successmsg").getText();
	System.out.println(s);
	driver.findElementByClassName("logoutImg").click();
	
}
}
