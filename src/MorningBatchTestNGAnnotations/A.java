package MorningBatchTestNGAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
public class A 
{
	@BeforeTest
public void openBrowser()
{
	System.out.println("Browser opened");
	System.out.println("Enter URL");
}
	@AfterTest
public void closeBrowser()
{
	System.out.println("Browser closed");
}
	@BeforeClass
public void login()
{
	System.out.println("login successfull");
}
	@AfterClass
public void logout()
{
	System.out.println("logout successfull");
}
}
