package com.MorningbatchTestNG;

import org.testng.annotations.Test;

public class Testscript01 
{
	@Test(priority=2)
public void testBB()
{
	System.out.println("BB method executed");
}
	@Test(priority=3)
public void testAA()
{
	System.out.println("AA method executed");
}
	@Test(priority=1)
public void testCC()
{
	System.out.println("CC method executed");
}
}
