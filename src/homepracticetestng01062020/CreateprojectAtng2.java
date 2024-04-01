package homepracticetestng01062020;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateprojectAtng2  extends A
{
	@BeforeMethod
	public void Createaddnewproject()
	{
		System.out.println("Create new Project page open");
	}
		@Test
	public void createproject()
	{
		System.out.println("Create New Project");
	}
		@AfterMethod
	public void retrivesuccessmessage()
	{
		System.out.println("Retrive success message");
	}
}
