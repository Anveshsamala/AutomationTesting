package testcases.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nokia105 
{
	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addtocart;
	public Nokia105()
	{
		PageFactory.initElements(Baseclass5.driver, this);
	}
	public void addtocart()
	{
		addtocart.click();	
	}
}
