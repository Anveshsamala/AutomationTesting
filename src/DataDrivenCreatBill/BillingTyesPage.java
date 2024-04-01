package DataDrivenCreatBill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import DataDrivenProjectCreation.ExcellOperation;

public class BillingTyesPage 
{
@FindBy(xpath="//input[@value='Add New Billing Type']")
private WebElement ClickOnAddNewBillingType;

@FindBy(className="successmsg")
private WebElement SuccessMessage;

public BillingTyesPage()
{
	PageFactory.initElements(BasClass.driver, this);
}

public void clickonaddnewbillingtype()
{
	ClickOnAddNewBillingType.click();
}
public String retriveSuccessMessage()
{
	String s=SuccessMessage.getText();
	return s;
}
}
