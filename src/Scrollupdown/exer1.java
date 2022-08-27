package Scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exer1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.id("toggle-new"));

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", findElement);

		WebElement find = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));

		Thread.sleep(3000);
		// JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", find);
		
		WebElement find1 = driver.findElement(By.xpath("//a[text()='Corporate Training']"));
		
		j.executeScript("arguments[0].scrollIntoView(true)", find1);

	}

}
