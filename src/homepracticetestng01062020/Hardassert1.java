package homepracticetestng01062020;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Hardassert1 
{
@Test
public void hardassert()
{
	Assert.assertTrue(10>3);
	Assert.assertTrue(2<6, "no error message");
	Assert.assertFalse(2>5);
	Assert.assertFalse(20<6, "error message");
	Assert.assertEquals("a", "a");
	Assert.assertEquals("a", "a", "no error message");
}
}
