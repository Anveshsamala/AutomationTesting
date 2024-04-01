package Stigentechpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("fsgfhg");	
		String source=driver.getPageSource();
		String url=driver.getCurrentUrl();
		int titlelength=driver.getTitle().length();
		String title=driver.getTitle();
		System.out.println(source);
		System.out.println(url);
		System.out.println(titlelength);
		System.out.println(title);
		
	}
}
