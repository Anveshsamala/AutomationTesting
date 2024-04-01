package MorningBatchCustomerCreartion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivePProjectsAndCustomerPage 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	public ActivePProjectsAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
	}
	public String retriveSuccessMessage()
	{
		String s=successMessage.getText();
		return s;
	}
}
