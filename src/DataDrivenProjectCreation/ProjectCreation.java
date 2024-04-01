package DataDrivenProjectCreation;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectCreation extends BaseClass
{
@Test
public void projectCreation() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	
	String pn=ExcellOperation.readdata("Sheet2", 1, 0);
	String Exp=ExcellOperation.readdata("Sheet2", 1, 1);
	
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnPProjectsAndCustomersLink();
	
	
	ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
	apcp.addNewProjectbutton();
	
	
	AddNewProjectsPage anpp=new AddNewProjectsPage();
	anpp.clickOnCustomerDropDown();
	anpp.enterProjectNameTextField(pn);
	anpp.clickOnCreateProject();
	
	String Act=apcp.retriveSuccessMessage();

	ExcellOperation.writedata("Sheet2", 1, 2, Act);
	
	try
	{
		Assert.assertEquals(Exp, Act);
		ExcellOperation.writedata("Sheet2", 1, 3, "Pass");
	}
	catch(AssertionError rv)
	{
		ExcellOperation.writedata("Sheet2", 1, 3, "Fail");
	}
	}
}
