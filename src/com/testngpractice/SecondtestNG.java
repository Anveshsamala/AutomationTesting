package com.testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondtestNG 
{
@BeforeMethod
public void open()
{
	System.out.println("open test");
}
@Test
public void sum()
{
	int a=10;
	int b=25;
	int c=a+b;
	System.out.println(c);
}
@AfterMethod
public void close()
{
	System.out.println("close test");
}
}
