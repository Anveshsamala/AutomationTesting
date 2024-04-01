package homepracticetestng01062020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Createprojecttng1 
{
@Test
public void createproject()
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByName("username").sendKeys("admin");
	driver.findElementByName("pwd").sendKeys("manager");
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByLinkText("Projects & Customers").click();
	driver.findElementByXPath("//input[@value='Add New Project']").click();
	
	WebElement dropdown = driver.findElementByName("customerId");
	Select s=new Select(dropdown);
	s.selectByVisibleText("111");
	
	driver.findElementByName("name").sendKeys("TESTNG1");
	
	driver.findElementByXPath("//input[@value='Create Project']").click();
	String s1=driver.findElementByClassName("successmsg").getText();
	System.out.println(s1);
}
}
