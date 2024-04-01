package testcases.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart 
{
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement clickonplaceorder;
public Shoppingcart()
{
	PageFactory.initElements(Baseclass5.driver, this);
}
public void clickonplaceorder()
{
	clickonplaceorder.click();
}
}
