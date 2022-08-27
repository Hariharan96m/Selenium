package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	
	// to inpect the username webElement based on xpath
	driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']")).sendKeys("iphone 13");
	
	// to find findElement of search
	driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
	
	driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
	
	
	
    //	to find the mobile
	driver.findElement(By.xpath("(//span[@class ='a-truncate-cut'])")).click();
	
	driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Blue")).click();
	
	
	

	
}
}
