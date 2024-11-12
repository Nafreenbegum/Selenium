package WebDriverMEthods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandleGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.bookmyshow.com/");
		System.out.println("Current window address is:"+driver.getWindowHandle());
		Set<String> adresses=driver.getWindowHandles();
		for (String s: adresses) {
			System.out.println(s);
		}
		driver.quit();
	}

}
