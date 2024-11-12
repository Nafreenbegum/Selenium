package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clearsubmitpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchTxt=driver.findElement(By.id("twotabsearchtextbox"));
		SearchTxt.sendKeys("toys");
		Thread.sleep(2000);
		SearchTxt.clear();
		Thread.sleep(2000);
		SearchTxt.sendKeys("tv");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
