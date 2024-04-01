package MorningBatchDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateProject 
{
@Test
public void testCreateProject() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	//step1
	String url=ExcelOperation.readData("Sheet2", 1, 0);
	String un=ExcelOperation.readData("Sheet2", 1, 1);
	String psd=ExcelOperation.readData("Sheet2", 1, 2);
	String pn=ExcelOperation.readData("Sheet2", 1, 3);
	String Exp=ExcelOperation.readData("Sheet2", 1, 4);
	
	//step2
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByName("username").sendKeys(un);
	driver.findElementByName("pwd").sendKeys(psd);
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByLinkText("Projects & Customers").click();
	driver.findElementByXPath("//input[@value='Add New Project']").click();
	WebElement dropdown = driver.findElementByName("customerId");
	Select s1=new Select(dropdown);
	s1.selectByVisibleText("111");
	driver.findElementByName("name").sendKeys(pn);
	driver.findElementByName("createProjectSubmit").click();
	String Act=driver.findElementByClassName("successmsg").getText();
	System.out.println(Act);
	Thread.sleep(2000);
	driver.findElementByClassName("logoutImg").click();
	driver.close();
	
	//step3
	
	ExcelOperation.writeData("Sheet2", 1, 5, Act);
	
	//step4
	
	try
	{
		Assert.assertEquals(Exp, Act);
		ExcelOperation.writeData("Sheet2", 1, 6, "pass");
	}
	catch(AssertionError rv)
	{
		
		ExcelOperation.writeData("Sheet2", 1, 6, "fail");
	}
//	if(Exp.equals(Act))
//	{
//		ExcelOperation.writeData("Sheet2", 1, 6, "pass");
//	}
//	else
//	{
//		ExcelOperation.writeData("Sheet2", 1, 6, "fail");
//	}
}
}
