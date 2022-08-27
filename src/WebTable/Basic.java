package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));

		// to get table headings
		System.out.println("********TABLE HEADINGS******");
		List<WebElement> headings = table.findElements(By.tagName("th"));
		for (int i = 0; i < headings.size(); i++) {
			WebElement text = headings.get(i);
			String text2 = text.getText();
			System.out.println(text2);
		}
		// to copy all rows
		System.out.println("**********ALL ROWS*****");
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		for (WebElement x : tRows) {
			String text = x.getText();
			System.out.println(text);
		}
		// to get all datas
		System.out.println("*******ALL DATAS*****");
		List<WebElement> tDatas = table.findElements(By.tagName("td"));
		for (WebElement y : tDatas) {
			String text1 = y.getText();
			System.out.println(text1);
		}
		// TO GET PARTICULAR DATA
		System.out.println("********PARTICULAR DATAS******");
		List<WebElement> tParticular = table.findElements(By.tagName("td"));
		for (int i = 0; i < tParticular.size(); i++) {
			WebElement text34 = tParticular.get(i);
			String text44 = text34.getText();
			if (text44.contains("Helen")) {
				System.out.println(text44);
			}

		}
	}
}
