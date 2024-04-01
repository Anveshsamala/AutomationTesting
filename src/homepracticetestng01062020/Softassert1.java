package homepracticetestng01062020;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Softassert1 
{
	@Test
public void softassert()
{
		SoftAssert s=new SoftAssert();
	s.assertTrue(1>0);
	s.assertTrue(10<20, "error");
	System.out.println("assertion pass");
	s.assertFalse(1<10);
	s.assertFalse(2<20, "no error msg");
	System.out.println("assertion true");
	s.assertEquals("1", "1");
	s.assertEquals("e", "e", "no error msg");
	s.assertAll();
}
}
