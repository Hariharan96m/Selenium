import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login.php/");
		 
		 driver.manage().window().maximize();
		 
		 // to inspect the username Webelement
		 
		 WebElement textUser = driver.findElement(By.id("email"));
		 
		 // to send the values to Username Webelement
		 textUser.sendKeys("haran6357@gmail.com");
		 
		 // to inspect the Password Webelement
		WebElement textPass = driver.findElement(By.id("pass"));
		
		// to send the values to Password Webelement
		textPass.sendKeys("7568987");
		
		// to inspect the login button webelement
		WebElement login = driver.findElement(By.name("login"));
		
		// to click the login button
		login.click();
	}

}
