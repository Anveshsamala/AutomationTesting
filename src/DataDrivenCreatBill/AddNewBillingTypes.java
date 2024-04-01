package DataDrivenCreatBill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewBillingTypes 
{
	@FindBy(name="name0")
private WebElement BillingTypeName;
	
	@FindBy(xpath="//input[@value='Create Billing Type(s)']")
private WebElement ClickOnCreateBillingType;
	
	public AddNewBillingTypes() 
	{
		
			PageFactory.initElements(BasClass.driver, this);
		
	}

public void billingtypename(String name)
{
	BillingTypeName.sendKeys(name);
}
public void clickoncreatebillingtype()
{
	ClickOnCreateBillingType.click();
}
}
