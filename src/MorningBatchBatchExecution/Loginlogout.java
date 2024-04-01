package MorningBatchBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import okio.Timeout;

public class Loginlogout 
{
	@Test
	public void testLoginLogout() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElementByName("username").sendKeys("admin");
driver.findElementByName("pwd").sendKeys("manager");
driver.findElementByXPath("//input[@type='submit']").click();
Thread.sleep(2000);
driver.findElementByClassName("logoutImg").click();
}
}