package MorningBatchBaseClassDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerpage 
{
	@FindBy(name="name")
	private WebElement CustomerNameTextField;
		
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerButton;
	
	public AddNewCustomerpage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void enterCustomerName(String name)
	{
		CustomerNameTextField.sendKeys(name);
	}
	public void createCustomerButton()
	{
		CreateCustomerButton.click();
	}
	
}
