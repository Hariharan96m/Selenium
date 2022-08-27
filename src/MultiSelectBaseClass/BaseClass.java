package MultiSelectBaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.xpath.text;

public class BaseClass {
	private static final String value = null;
	public static WebDriver driver;

	public static void getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static WebElement idlocate(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	public static WebElement namelocate(String name) {
		WebElement findElement2 = driver.findElement(By.className(name));
		return findElement2;
	}

	public static void texty(WebElement find, String text) {
		find.sendKeys(text);
	}

	public static WebElement xpathlocatehd(String hd) {
		WebElement findElement3 = driver.findElement(By.xpath(hd));
		return findElement3;
	}

	public static WebElement selectlocate(WebElement name) {
		Select s = new Select(name);
		s.selectByValue(null);
		return name;

	}

	// ACTIONS
	// static Actions a = new Actions(driver);

	public static void Actions(WebElement loc, WebElement target1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(loc, target1).perform();
	}

	// public static void Actions1(WebElement name) {
	//// Actions a1 = new Actions(driver);
	// a.doubleClick(name).perform();

	public static void ScreenShot(String scname) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\" + scname + ".png");
		FileUtils.copyFile(screenshotAs, destination);
	}
}
