package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatinganAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();

		

		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.click();
		findElement.sendKeys("iphone");

		WebElement findElement2 = driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']"));
		findElement2.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
