package org.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		// to handle frames using index ; 0 = represents only one frame
		// ans   =  driver.switchTo().frame(0);
		
		// using name(String name)
		// ans =    driver.switchTo().frame("login_page");
		
		// to handle using webelement ref
		WebElement f = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(f);
		

		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("hari");
	}

}
