package MorningBatchTestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProject extends A
{
	@BeforeMethod
public void clickOnAddNewProject()
{
	System.out.println("Add  new project button is clicked");
}
@Test
public void testCreateProject()
{
	System.out.println("Project created successfull");
}
@AfterMethod
public void retriveSuccessMessageOfProject()
{
	System.out.println("Project Created message is retrived");
}
}
