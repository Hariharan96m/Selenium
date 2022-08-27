package ScreenShotPics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPageScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// to take fullpagescreenshot
		Screenshot pics = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(pics.getImage(),"PNG", new File("D:\\Fullpagescreenshots.png"));

		// to take particular screenshot
		/*
		 * Screenshot takeScreenshot = new
		 * AShot().takeScreenshot(driver,driver.findElement(By.name("btnK")));
		 * ImageIO.write(takeScreenshot.getImage(), "PNG",new
		 * File("E:\\particularscreenshots.png") );
		 */
	}
}
