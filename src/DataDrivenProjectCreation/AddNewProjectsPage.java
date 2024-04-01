package DataDrivenProjectCreation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectsPage 
{
	@FindBy(name="customerId")
	private WebElement ClickOnCustomerDropDown;
	
	@FindBy(name="name")
	private WebElement EnterProjectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement ClickOnCreateProject;
	
	public AddNewProjectsPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void clickOnCustomerDropDown()
	{
		
		Select s1=new Select(ClickOnCustomerDropDown);
		s1.selectByVisibleText("111");
	}
	public void enterProjectNameTextField(String name)
	{
		EnterProjectNameTextField.sendKeys(name);
	}
	public void clickOnCreateProject()
	{
		ClickOnCreateProject.click();
	}
}
