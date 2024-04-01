package DataDrivenCreatBill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPag 
{
	@FindBy(linkText="Settings")
private WebElement ClickOnSttingsLink;
	
	public OpenTaskPag()
	{
		PageFactory.initElements(BasClass.driver, this);
	}
public void clickonsettingslink()
{
	ClickOnSttingsLink.click();
}
}
