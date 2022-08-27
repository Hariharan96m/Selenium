package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingRoom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("swetha99");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("dinesh");
		driver.findElement(By.id("login")).click();
		WebElement locate = driver.findElement(By.name("location"));
		Select s = new Select(locate);
		s.selectByValue("Sydney");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Double");
		WebElement Noroom = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(Noroom);
		s3.selectByIndex(2);
		WebElement datein = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(datein);
		s4.selectByVisibleText("2 - Two");
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("3");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("archana");
		driver.findElement(By.id("last_name")).sendKeys("bala");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("3456778900899900");
		WebElement findElement1 = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(findElement1);
		s6.selectByValue("VISA");
		WebElement findElement2 = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(findElement2);
		s7.selectByValue("3");
		WebElement findElement3 = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(findElement3);
		s8.selectByValue("2014");
		driver.findElement(By.name("cc_cvv")).sendKeys("455");
		Thread.sleep(3000);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
	}


