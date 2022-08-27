package Waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllThreeWaits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();

		/*
		 * // implicitly wait - it can be used only in findElement and findElements
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); WebElement
		 * rad = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 * rad.click();
		 */

		/*
		 * // explicit waits - it can be used for many locating elements
		 * 
		 * WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		 * WebElement until =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@type='radio'])[2]"))); until.click();
		 */

		// fluent waits
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		WebElement until = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath("//input[@type='radio'])[2]"));
			}
		});
		until.click();

	}

}
