package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAndRightClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement textUser = driver.findElement(By.id("email"));
	textUser.sendKeys("haran6357");
	
	
	// to perform the actions 
	Actions act = new Actions(driver);
	
	// to perform the double click actions
	act.doubleClick(textUser).perform();
	
	Thread.sleep(4000);
	
	// to perform the right click actions
	act.contextClick(textUser).perform();
	


}
	
	
}
