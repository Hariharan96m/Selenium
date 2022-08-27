package Alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDownRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", findElement);
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Robot r = new Robot();
		
		WebElement findElement2 = driver.findElement(By.cssSelector("a.analystic"));
		jk.executeScript("arguments[0].click()", findElement2);
		
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		
		
		
		
		
		
		

	}

}
