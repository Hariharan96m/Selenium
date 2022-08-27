package com.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentURL {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	// to print the URL of the page
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	// to print the title of the page
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	driver.quit();
}

}
