package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
		button.click();
		String parId = driver.getWindowHandle();
		WebElement clickk = driver.findElement(By.xpath("//button[text()='click']"));
		clickk.click();
		driver.manage().window().maximize();

		Set<String> allIds = driver.getWindowHandles();

		for (String ids : allIds) {
			if (!parId.equals(ids)) {
				driver.switchTo().window(ids);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	}
}
