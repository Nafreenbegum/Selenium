package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@ggmai.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abc143");
		driver.findElement(By.cssSelector("button.selected")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
