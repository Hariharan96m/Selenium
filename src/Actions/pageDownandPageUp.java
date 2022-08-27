package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pageDownandPageUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			a.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(3000);
		}
		for (int i = 0; i < 4; i++) {
			a.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(3000);

		}

	}
}
