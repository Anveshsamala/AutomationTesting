package com.MorningbatchTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTestScript1 
{
@Test
public void testSamppleTestScript()
{
	SoftAssert sa=new SoftAssert();
	sa.assertTrue(3<1, "1st statement is wrong");
	sa.assertTrue(3>1);
	System.out.println("2nd statement is true");
	sa.assertEquals("abc", "abc");
	System.out.println("3rd statement is true");
	sa.assertTrue(2==2);
	System.out.println("4rth statement is true");
	sa.assertAll();
}
}
