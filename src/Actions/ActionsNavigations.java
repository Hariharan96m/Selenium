package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsNavigations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.get("https://www.myntra.com/");
		
		driver.navigate().refresh();
		
		
	
	
	
	}

}
