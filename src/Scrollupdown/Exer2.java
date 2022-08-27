package Scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exer2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		 WebElement find1 = driver.findElement(By.className("nav-input nav-progressive-attribute"));
		 jk.executeScript("arguments[0].setAttribute('value','iphone')", find1);
		 
		 WebElement find2 = driver.findElement(By.id("nav-search-submit-button"));
		 jk.executeScript("arguments[0].click()", find2);
				
		 //WebElement find = driver.findElement(By.className("_3704LK"));
		 
		 //JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].setAttribute.'value','iphone'", find);
	}

}
