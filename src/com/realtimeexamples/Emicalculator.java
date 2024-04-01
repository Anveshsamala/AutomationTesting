package com.realtimeexamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Emicalculator 
{
	@Test
	public void Emicalsi() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		Actions ref=new Actions(driver);
		Thread.sleep(2000);
		WebElement loanamt=driver.findElementById("loanamountslider");
		WebElement loanintrest=driver.findElementById("loaninterestslider");
		WebElement loanterms=driver.findElementById("loantermslider");
		
		ref.dragAndDropBy(loanamt, 82, 0).build().perform();
		Thread.sleep(2000);
		ref.dragAndDropBy(loanintrest, 86, 0).build().perform();
		Thread.sleep(2000);
		ref.dragAndDropBy(loanterms, -110, 0).build().perform();
		Thread.sleep(2000);
		
		WebElement emiamt=driver.findElementByXPath("//span[text()='92,439']");
		String emi=emiamt.getText();
		
		Assert.assertEquals("92,439", emiamt);
				
	}
}
