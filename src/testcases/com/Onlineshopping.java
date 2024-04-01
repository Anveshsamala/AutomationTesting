package testcases.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onlineshopping 
{
	
@FindBy(xpath = "//input[@type='text']")
private WebElement entersearchelement;

public Onlineshopping()
{
	PageFactory.initElements(Baseclass5.driver, this);
}
public void entersearchelement()
{
	entersearchelement.sendKeys("nokia keypad phone");
}
}
