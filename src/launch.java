import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {

		// configure the Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to launch the Browser
		driver.navigate().to("https://www.flipkart.com/");

		// to maximize the windows

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement findElement = driver.findElement(By.xpath("//*[@class='_3704LK']"));
		findElement.sendKeys("mobiles");
		driver.findElement(By.xpath("(//*[name()= 'svg'])[1]")).click();

	}

}
