package MorningBatchBaseClassDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsandCustomerPage 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement clickOnAddNewCustomerButton;
	
	@FindBy(className="successmsg")
	private WebElement RetriveSuccessMessage;
	
	public ActiveProjectsandCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void addNewCustomerButton()
	{
		clickOnAddNewCustomerButton.click();
	}
	
	public String retriveSuccessMessage()
	{
		String s=RetriveSuccessMessage.getText();
		return s;
	}	

}
