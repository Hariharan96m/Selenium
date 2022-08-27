package com.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ever {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\library\\selenium-server-4.3.0 (1).jar");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
