package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oddAndEvenPrint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.name("country"));
		Select s = new Select(country);
		List<WebElement> country1 = s.getOptions();
		int options = country1.size();
		System.out.println("****even countries***");
		for (int i = 0; i < country1.size(); i++) {
			if (i % 2 == 0) {
				WebElement web = country1.get(i);
				String text = web.getText();
				System.out.println(text);
			}}
		// to print odd countries
		System.out.println("****odd countries***");
		for (int i = 0; i < country1.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(country1.get(i).getText());
			}}
		System.out.println("***first five***");
		for (int i = 0; i < country1.size(); i++) {
			if (i <= 4) {
				System.out.println(country1.get(i).getText());
			}
		}
		System.out.println("***last five****");

		for (int i = (options - 5); i < options; i++) {
			System.out.println(country1.get(i).getText());
		}
	}
}
