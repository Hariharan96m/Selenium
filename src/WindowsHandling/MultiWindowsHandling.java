package WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

		String parId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();

		List<String> li = new ArrayList();
		li.addAll(allIds);

		// to go to 1st child class
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		// to go to 2nd child class
		driver.switchTo().window(li.get(2));
		driver.findElement(By.id("email")).sendKeys("hari");

		// to go to home (parId)
		driver.switchTo().window(parId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
	}
}
