package WebDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTitleGetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		String title=driver.getCurrentUrl();
		String url=driver.getTitle();
		System.out.println(title);
		System.out.println(url);
	}

}
