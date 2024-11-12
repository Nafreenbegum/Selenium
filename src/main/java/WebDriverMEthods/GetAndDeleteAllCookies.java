package WebDriverMEthods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndDeleteAllCookies {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("************Getting All Cookies **************");
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(((Cookie) cookies).getName()+"\t"+cookie.getDomain()+"\t"+cookie.getExpiry());
			
		}
		Thread.sleep(3000);
		System.out.println("********Deleting All Cookies***********");
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName()+"\t"+cookie.getDomain()+"\t"+cookie.getExpiry());
			
		}
		driver.quit();
		
	}

}
