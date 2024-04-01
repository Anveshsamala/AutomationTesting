package MorningBatchTestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomer extends A 
{
	@BeforeMethod
public void clickOnAddNewCustomer()
{
	System.out.println("Add new Customer button is clicked");
}
@Test
public void testCreateCustomer()
{
	System.out.println("Customer created successfully");
}
@AfterMethod
public void retriveSuccessMessageOfCustomer()
{
	System.out.println("customer creation success message is retrived");
}
}
