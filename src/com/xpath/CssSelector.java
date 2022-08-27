package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.className("logo"));
		String cssValue = findElement.getCssValue("padding");
		System.out.println(cssValue);
		WebElement findElement2 = driver.findElement(By.xpath("//img[@alt='Hotel Image 3']"));
		String cssValue2 = findElement2.getCssValue("text-align");
		System.out.println(cssValue2);
	}
}
