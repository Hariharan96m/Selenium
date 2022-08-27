package ScreenShotPics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbscreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		
		//type casting
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		//to take the particular screenshot
		WebElement l = driver.findElement(By.className("_9vtf"));
		File sourcelocation3 = l.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("E:\\particular.jpg");
		FileUtils.copyFile(sourcelocation3, destination3);
		 
		// to take the screen shot on username
		driver.findElement(By.id("email")).sendKeys("8807759932");
		File sourcelocation = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\user.jpg");
		FileUtils.copyFile(sourcelocation, destination);
		
		// to take the screen shot on password
		driver.findElement(By.id("pass")).sendKeys("9688870675");
		File loc = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\\\password.jpg");
		FileUtils.copyFile(loc, des);
		
		// to take the screen shot on after click button
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(5000);
		File loc1 = tk.getScreenshotAs(OutputType.FILE);
		File des1 = new File("E:\\\\\\clickaft");
		FileUtils.copyFile(loc1, des1);
		
		driver.findElement(By.className("_6luv _52jv"));
		File loc2 = tk.getScreenshotAs(OutputType.FILE);
		File des2 = new File("E:\\\\particularpic.jpg");
		FileUtils.copyFile(loc2, des2);
		
		
		
	}

}
