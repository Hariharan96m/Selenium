package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		// to find the element 
		WebElement source = driver.findElement(By.id("credit2"));
		
		// to find the destination
		WebElement destination = driver.findElement(By.id("bank"));
		
		// to perform the drag and drop function
		Actions act = new Actions (driver);
		
		Thread.sleep(5000);
		
		act.dragAndDrop(source, destination).perform();
		
		WebElement source1 = driver.findElement(By.id("credit1"));
		
		WebElement destination1 = driver.findElement(By.id("loan"));
		act.dragAndDrop(source1, destination1 ).perform();
		
		
		
		
		
	
	
	}

}
