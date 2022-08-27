package robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MobilesusingRobots {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	

	
	WebElement Textuser = driver.findElement(By.id("twotabsearchtextbox"));
	Textuser.sendKeys("iphone 12");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Actions act = new Actions(driver);
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DELETE);
	
	 
	
	
//	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
