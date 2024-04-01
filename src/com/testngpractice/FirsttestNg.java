package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirsttestNg 
{
@BeforeSuite
public void browser()
{
	System.out.println("browser test");
}
@BeforeClass
public void url()
{
	System.out.println("url test");
}
@BeforeMethod
public void operatingsystem()
{
	System.out.println("operating system test");
}
@Test
public void framework()
{
	System.out.println("framework test");
}
@Test
public void framework1()
{
	System.out.println("framework test1");
}
@AfterMethod
public void operatingsystem1()
{
	System.out.println("operating system test1");
}
@AfterClass
public void url1()
{
	System.out.println("url test1");
}
@AfterSuite
public void browser1()
{
	System.out.println("browser test1");
}
}
