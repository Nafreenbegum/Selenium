package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
}
}
