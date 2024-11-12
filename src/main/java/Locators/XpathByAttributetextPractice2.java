package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributetextPractice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/hyderabad/delivery");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Pizza Hut']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Food Menu menu']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
