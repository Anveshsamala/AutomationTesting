package testcases.com;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Nokiakeypadmobile 
{
	@FindBy(xpath = "//div[text()='Nokia 105 SS']")
	private WebElement clickonnokia105ss;
	
	@FindBy(xpath = "//span[text()='']")
	private WebElement amountconfirmation;
	
	public void clickonnokiamobile()
	{
		clickonnokia105ss.click();
	}

	public String amountconfirmation()
	{
		String act=amountconfirmation.getText();
		return act;
	}
}
