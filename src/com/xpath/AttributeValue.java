package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//h1[contains(@title,'Selenium Training in Chennai')]"));
		String text = findElement.getText();
		System.out.println(text);
		String attribute = findElement.getAttribute("title");
		System.out.println(attribute);
	}

}
