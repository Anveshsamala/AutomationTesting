package homepracticetestng01062020;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomerAtng2  extends A
{
	@BeforeMethod
public void clickonaddnewcustomerbutton()
{
	System.out.println("Click on add new customer open");
}
	@Test
public void createcustomer()
{
	System.out.println("Create customer");
}
	@AfterMethod
public void retrivesuccessmsg()
{
	System.out.println("Retrive success message page open");
}
}
