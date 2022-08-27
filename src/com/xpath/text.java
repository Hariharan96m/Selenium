package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {
  public static void main(String[] args) {
	// configure the browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		// to inspect the webelement based on Text  FORMULA : //tagname[text()='text value']
		
		WebElement text = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
		
		// to print the value on the console
		String text2 =text.getText();
		System.out.println(text2);
		
		// to inspect the paragraph text    FORMULA : //tagname[contains(text(),'partially text,)]
		
		WebElement paraText = driver.findElement(By.xpath("//p[contains(text(),'Learn')]"));
		
		// to print text value on console
		String text3 = paraText.getText();
		System.out.println(text3);
		
		driver.close();
		driver.quit();
		
		
}
}
