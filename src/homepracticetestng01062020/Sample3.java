package homepracticetestng01062020;

import org.testng.annotations.Test;

public class Sample3 
{
	@Test(priority=2)
public void BB()
{
	System.out.println("BB");
}
	@Test(priority=3)
public void AA()
{
	System.out.println("AA");
}
	@Test(priority=1)
public void CC()
{
	System.out.println("CC");
}
}
