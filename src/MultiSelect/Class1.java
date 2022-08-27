package MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();

		WebElement whole = driver.findElement(By.id("fruits"));
		Select s = new Select(whole);

		// to perform multiselect
		s.selectByIndex(2);
		s.selectByValue("orange");
		s.selectByVisibleText("Apple");
		s.selectByIndex(0);

		// to check whether selection is selected or not
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		// to print all the webelements (dropdown)
		List<WebElement> options = s.getOptions();

		System.out.println("**for**");
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement1 = options.get(i);
			String text = webElement1.getText();
			System.out.println(text);
		}
		System.out.println("**********foreach***********");
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}
		// to print all selected options
		List<WebElement> allSelectedOptions1 = s.getAllSelectedOptions();
		for (WebElement webElement2 : allSelectedOptions1) {
			String text = webElement2.getText();
			System.out.println(text);
		}
		System.out.println("++++++++++++++++++++++++++++++");

		// to print first selected options in dropdown
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text1 = firstSelectedOption.getText();
		System.out.println(text1);

		// to perform the selectAll

		// s.deselectByIndex(1);
		// s.deselectByValue("banana");
		// s.deselectByVisibleText("orange");

		// to deselect all
		s.deselectAll();
	}
}
