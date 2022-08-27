package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	WebElement courseMouse = driver.findElement(By.id("icp-nav-flyout"));
	
	Actions act = new Actions(driver);
	
	// to prefer the mouse over actions
	act.moveToElement(courseMouse).perform();
	
	//Thread.sleep(5000);
	
	//WebElement masterMouse = driver.findElement(By.xpath(ltr));
	
	// to perform the Mouse Over Actions
	//act.moveToElement(masterMouse).perform();
	
	
	}

}
