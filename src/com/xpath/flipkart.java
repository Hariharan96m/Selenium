package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart { 
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// to search
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("iphone 12");
		
		//to click search
	//	driver.findElement(By.xpath(xpathExpression));
		
	}

}
