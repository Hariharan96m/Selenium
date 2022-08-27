package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTk1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();
		// to inspect the table
		WebElement tab = driver.findElement(By.xpath("/html/body/center/table"));
		/// to inspect the rows
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int size = row.size();
		System.out.println("rows size :" + size);
		for (int i = 0; i < row.size(); i++) {
			WebElement Row1 = row.get(i);
			String text = Row1.getText();
			if (i == 0) {
				System.out.println(text);
			}
		}
		WebElement er = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]"));
		String text2 = er.getText();
		System.out.println(text2);

	}
}
