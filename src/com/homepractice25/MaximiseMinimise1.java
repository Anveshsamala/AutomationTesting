package com.homepractice25;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseMinimise1 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
driver.manage().window().maximize();
Dimension d=new Dimension(500, 500);
driver.manage().window().setSize(d);
}
}