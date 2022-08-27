package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exer2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement alerT1 = driver.findElement(By.xpath("//button[text()='Click me']"));
	alerT1.click();
	
	Thread.sleep(3000);
	
	// to handle the alerT
	Alert alert2 = driver.switchTo().alert();
	alert2.accept();
	
	//WebElement alert3 = driver.findElement(By.id("timerAlertButton"));
	//alert3.click();
	
	//Thread.sleep(1000);
	
	// to handle this 
	//Alert alert4 = driver.switchTo().alert();
	//alert4.dismiss();
	
	WebElement alert5 = driver.findElement(By.id("confirmButton"));
	alert5.click();
	
	Thread.sleep(3000);
	
	Alert alert6 = driver.switchTo().alert();
	alert6.accept();
	
	
	WebElement alert7 = driver.findElement(By.id("promtButton"));
	alert7.click();
	
	Thread.sleep(3000);
	
	Alert alert8 = driver.switchTo().alert();
	alert8.sendKeys("hari");
	alert8.accept();
	
	
	
	}

}
