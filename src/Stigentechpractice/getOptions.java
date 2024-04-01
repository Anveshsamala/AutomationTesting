package Stigentechpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anvesh/Desktop/STIGENTECH/SELENIUM/HTML/HTML%20PAGES/TestIFramePage.html");
		
//		WebElement ref=driver.findElement(By.name("dropdown"));
//		Select select=new Select(ref);
//		List<WebElement> k=select.getOptions();
//		
//		for(WebElement e:k)
//		{
//			System.out.println(e.getText());
//		}

	}

}
