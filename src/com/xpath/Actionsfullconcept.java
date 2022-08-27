package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsfullconcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("samsung");
		
		// to double click
		act.doubleClick(findElement).perform();
		
		// to right click 
		act.contextClick(findElement).perform();
		
		driver.navigate().refresh();
		
		// to get another browser
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		
		
		
		
		
	}

}
