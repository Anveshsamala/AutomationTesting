package DataDrivenProjectCreation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage 
{
	
		
	@FindBy(className="successmsg")
	private WebElement SuccessMessage;
	
	@FindBy(xpath = "//input[@value='Add New Project']")
	private WebElement AddNewProjectButton;
	
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	public void addNewProjectbutton()
	{
		AddNewProjectButton.click();
	}
	public String retriveSuccessMessage()
	{
		String s=SuccessMessage.getText();
		return s;
	}
	
}
