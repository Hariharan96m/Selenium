package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	WebElement cl = driver.findElement(By.xpath("//a[text()='All Branches']"));
	
	JavascriptExecutor jk = (JavascriptExecutor) driver;
	
	// to sendkeys
	jk.executeScript("arguments[0].click()",cl);
	
	WebElement findElement2 = driver.findElement(By.className("slicknav_btn slicknav_collapsed"));
	jk.executeScript("arguments[0].click()", findElement2);
	
	
	WebElement findElement = driver.findElement(By.className("bright-top-bar-email"));
	jk.executeScript("attribute[0].click()",findElement);
	
	
	
	
	
}
}
