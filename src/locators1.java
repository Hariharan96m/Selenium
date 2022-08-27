import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver  driver    = new ChromeDriver();
		
		driver.get("https://www.shopify.in/");
		
		driver.manage().window().maximize();
		
		//WebElement findElement = driver.findElement(By.id("email"));
		//findElement.sendKeys("haran032.hh@gmail.com");
		
		//WebElement Username = driver.findElement(By.id("no-cookies"));
	//	Username.sendKeys("hariharan");
		
		//WebElement Pass = driver.findElement(By.name(" av-password"));
		//Pass.sendKeys("52437393");
		
		WebElement emm = driver.findElement(By.className("marketing-input-button-pair__input marketing-input marketing-input--floating"));
		emm.sendKeys("hariharan@gmail.com");
		
		
		
		
	}

}
