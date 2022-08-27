package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintParticularRows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.className("dataTable"));
		List<WebElement> headings = table.findElements(By.tagName("th"));
		List<WebElement> tDatas = driver.findElements(By.tagName("td"));
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));

		// to print particular rows
		for (int i = 0; i < tRows.size(); i++) {
			WebElement row = tRows.get(i);
			String text = row.getText();
			if (i == 3) {
			}
			System.out.println(text);
		}
	}
}
