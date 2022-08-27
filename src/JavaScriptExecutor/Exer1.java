package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exer1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.name("email"));
		
		// type casting javascriptexecutor
		
		JavascriptExecutor jk =  (JavascriptExecutor)driver;
		
		//to insert the values without keys
		jk.executeScript("arguments[0].value='8807759932'", user);
		
		// to get attribute value based on javaScript
		Object executeScript = jk.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(executeScript);
		
		// to get password
		WebElement findElement1 = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','9688870675')", findElement1);
		
		// to get login
		WebElement log = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()",log);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
