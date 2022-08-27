package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exes4 {
	public static void main(String[] args) {
	 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.paypal.com/");
			driver.manage().window().maximize();
			
			WebElement cl = driver.findElement(By.xpath("//a[text()='Login']"));
			
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			//to insert values w/o Sendkeys
			jk.executeScript("argument[0].click()",cl);
			
	}
	

}
