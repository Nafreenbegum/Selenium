package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginBTN=driver.findElement(By.cssSelector("button[type='submit']"));
		if(loginBTN.isEnabled())
			loginBTN.click();
		else
			System.out.println("disabled");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("jdufsjnf");
		driver.findElement(By.name("password")).sendKeys("phehwwn");
		if(loginBTN.isEnabled())
			loginBTN.click();
		else
			System.out.println("displayed");
	Thread.sleep(3000);
	driver.quit();
		
		
	}

}
