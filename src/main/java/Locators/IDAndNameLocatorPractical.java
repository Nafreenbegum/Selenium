package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocatorPractical {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement userNameTF = driver.findElement(By.id("email"));
		 userNameTF.sendKeys("tdtdtenbdhd");
		 WebElement passTF = driver.findElement(By.id("pass"));
		 passTF.sendKeys("ksgbbb");
		 WebElement loginBTN = driver.findElement(By.name("login"));
		 loginBTN.click();
		 Thread.sleep(4000);
		 driver.quit();
	}

}
