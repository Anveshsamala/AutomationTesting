package homepracticetestng01062020;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A 
{
	@BeforeTest
public void openBrowser()
{
	System.out.println("Browser open successfully");
}
	@AfterTest
public void closeBrowser()
{
	System.out.println("Browser closed successfully");
}
	@BeforeClass
public void login()
{
	System.out.println("Login successfully");
}
	@AfterClass
public void logout()
{
	System.out.println("Logout successfully");
}
}
