package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttriburesTextpractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("handbags");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[text()='Get It Today']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Textured Tote bag']")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
