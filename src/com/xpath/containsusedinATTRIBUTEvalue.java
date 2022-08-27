package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsusedinATTRIBUTEvalue {
	public static void main(String[] args) {
		// configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		// FORMULA = //input[contains(@AttributeName,'AtrributrValue')]
		WebElement containsAttribute = driver
				.findElement(By.xpath("//h1[contains(@title,'Selenium  Training in Chennai')]"));

		String text = containsAttribute.getText();
		System.out.println(text);

		// to print the Attribute value
		String attribute = containsAttribute.getAttribute("title");
		System.out.println(attribute);
		driver.close();
		driver.quit();

	}
}
