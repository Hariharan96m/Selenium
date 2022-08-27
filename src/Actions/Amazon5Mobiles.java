package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon5Mobiles {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox"));	
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("panasonic");
		driver.findElement(By.id("nav-search-submit-button")).click();

		
		
		
		
	}

}
