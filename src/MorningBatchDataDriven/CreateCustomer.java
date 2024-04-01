package MorningBatchDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCustomer 
{
@Test
public void testCreateCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
{
String url = ExcelOperation.readData("Sheet1", 1, 0)	;
String un=ExcelOperation.readData("Sheet1", 1, 1);
String psd=ExcelOperation.readData("Sheet1", 1, 2);
String cn=ExcelOperation.readData("Sheet1", 1, 3);
String Exp=ExcelOperation.readData("Sheet1", 1, 4);
//Step2 convert test case into test Script
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementByName("username").sendKeys(un);
driver.findElementByName("pwd").sendKeys(psd);
driver.findElementByXPath("//input[@type='submit']").click();
driver.findElementByLinkText("Projects & Customers").click();
driver.findElementByXPath("//input[@value='Add New Customer']").click();
driver.findElementByName("name").sendKeys(cn);
driver.findElementByName("createCustomerSubmit").click();
String act=driver.findElementByClassName("successmsg").getText();
System.out.println(act);
driver.findElementByClassName("logoutImg").click();
driver.close();
//step3 write actual result in excel sheet
ExcelOperation.writeData("Sheet1", 1, 5, act);
//step4 compare exp and act result write result in Excel sheet

if(Exp.equals(act))
{
	ExcelOperation.writeData("Sheet1", 1, 6, "pass");
}
else
{
	ExcelOperation.writeData("Sheet1", 1, 6, "Fail");	
}
}
}
