package MultiSelectBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import com.xpath.getcurrentURL;

public class TestClass extends BaseClass {
	public static void main(String[] args) throws IOException {
		getDriver("https://www.facebook.com/");
		ScreenShot("fbpage");
		WebElement idlocate = idlocate("email");
		texty(idlocate, "8807759932");
		ScreenShot("usersc");
		WebElement idlocate2 = idlocate("pass");
		texty(idlocate2, "9688870675");
		ScreenShot("passsc");
		getDriver("https://demo.guru99.com/test/drag_drop.html");
		WebElement loc1 = namelocate("button button-orange");
		WebElement idlocate3 = idlocate("bank");
		Actions(loc1, idlocate3);

	}

}
