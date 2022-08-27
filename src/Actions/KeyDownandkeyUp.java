package Actions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownandkeyUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.click();
		Actions a = new Actions(driver);

		// to write in UpperCase
		a.keyDown(Keys.SHIFT);
		a.sendKeys("haran");
		a.keyUp(Keys.SHIFT);
		a.perform();
		Thread.sleep(2000);

		// to copy
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.perform();
		Thread.sleep(2000);

		// to cut
		a.keyDown(Keys.CONTROL);
		a.sendKeys("x");
		a.keyUp(Keys.CONTROL);
		a.perform();
		Thread.sleep(2000);

		// to go to next line we have to press TAB
		a.sendKeys(Keys.TAB);

		// to paste in in password
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();
		Thread.sleep(2000);

		// to click login
		WebElement findElement2 = driver.findElement(By.name("login"));
		findElement2.click();

	}

}
