package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exerc1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simpleAlert.click();
		
		Thread.sleep(3000);
		
		// to handle the simple alert
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Confirm Alert Box']"));
		confirmAlert.click();
		
		Thread.sleep(3000);
		
		// to handle confirm alert
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
		Thread.sleep(3000);
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
		promptAlert.click();
		
		Thread.sleep(3000);
		
		// to handle the promptAlert
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("java");
		alert2.accept();
		
		
		
		
		
		
		
		
	}

}
