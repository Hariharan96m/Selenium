package JavaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllinOne {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','moto')", findElement);
		WebElement findElement2 = driver.findElement(By.id("nav-search-submit-button"));
		j.executeScript("arguments[0].click()", findElement2);

		Robot r = new Robot();
		driver.findElement(By.id("twotabsearchtextbox")).click();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		 driver.findElement(By.id("twotabsearchtextbox")).click();
		 r.keyPress(KeyEvent.VK_P);
		 r.keyPress(KeyEvent.VK_A);
		 r.keyPress(KeyEvent.VK_N);
		 
			WebElement findElement4 = driver.findElement(By.id("nav-search-submit-button"));
			j.executeScript("arguments[0].click()", findElement4);


		 
//		j.executeScript("arguments[0].setAttribute('value','panasonic')",findElement3);
		// findElement3);

	}

}
