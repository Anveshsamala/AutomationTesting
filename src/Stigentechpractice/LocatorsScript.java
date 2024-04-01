package Stigentechpractice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anvesh/Desktop/STIGENTECH/SELENIUM/HTML/HTML%20PAGES/TestIFramePage.html");
		//delay for 2 seconds
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//maximise the screen
		driver.manage().window().maximize();
		//delay for 2 seconds
		Thread.sleep(2000);
		//read text or retrive the text
//		String gettext=driver.findElement(By.xpath("/html/body/h2")).getText();
//		System.out.println(gettext);
//		//click action
//		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
//		//isenabled method
//		boolean b=driver.findElement(By.xpath("/html/body/form[2]/input[2]")).isEnabled();
//		System.out.println(b);
//		//isdisplayed method
//		boolean c=driver.findElement(By.xpath("/html/body/form[2]/input[1]")).isDisplayed();
//		System.out.println(c);
//		//isselected method
//		boolean d=driver.findElement(By.xpath("/html/body/form[2]/input[1]")).isSelected();
//		System.out.println(d);
		
		//minimise the screen
//		Dimension dim=new Dimension(500, 500);
//		driver.manage().window().setSize(dim);
		
		//back,refresh,forward,dropdown,getattribute
		
//		//navigate to new url
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(2000);
//		//navigate to previous page
//		driver.navigate().back();
//		Thread.sleep(2000);
//		//navigate to next page
//		driver.navigate().forward();
//		//refresh the current page
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		//retrive text 
//		String header=driver.findElement(By.xpath("/html/body/h3")).getText();
//		System.out.println(header);
//		//retrive data inside text box
//		String data=driver.findElement(By.name("fname1")).getAttribute("value");
//		System.out.println(data);
//	//dropdown for singlle selection	
//		WebElement drop = driver.findElement(By.xpath("/html/body/select[1]"));
//		Select sel=new Select(drop);
//		sel.selectByIndex(3);
		//dropdown for multiple selection
		WebElement mul=driver.findElement(By.name("multi"));
		Select one=new Select(mul);
		one.selectByIndex(0);
		one.selectByVisibleText("Test2");
		one.selectByValue("t3");
		List<WebElement> ref= one.getAllSelectedOptions();
		
		for(WebElement e:ref)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
	}

}
