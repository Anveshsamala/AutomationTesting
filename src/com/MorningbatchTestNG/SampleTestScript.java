package com.MorningbatchTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestScript 
{
@Test
public void testSampleTestScript()
{
Assert.assertTrue(5>3);	
Assert.assertTrue(3==3);
Assert.assertEquals("abc", "abc");
Assert.assertTrue(2>1);
Assert.assertEquals("abc", "abc", "its not matched");
}
}
