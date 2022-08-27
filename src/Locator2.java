import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Keep;

public class Locator2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.name("username"));
		findElement.sendKeys("8807759932");
		
		WebElement log = driver.findElement(By.id("commonView"));
		log.sendKeys(Keys.RETURN);
		
	}

}
