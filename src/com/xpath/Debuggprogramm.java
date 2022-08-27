package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debuggprogramm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    // to inspect the  create new account webelement
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
	    // 
	
	}

}
