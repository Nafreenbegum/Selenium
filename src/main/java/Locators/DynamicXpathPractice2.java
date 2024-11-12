package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("( //a[normalize-space(text())='Category'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //a[normalize-space(text())='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("selenium6");
		driver.findElement(By.name("add")).click();
		Thread.sleep(3000);
		List<WebElement> cateogeories = driver.findElements(By.className("sorting_1"));
		for (WebElement cateogery : cateogeories) {
			if(cateogery.getText().equals("selenium6"))
			{
				driver.findElement(By.xpath("//td[text()='"+cateogery.getText()+"']/following::td/button[text()=' Delete']")).click();
				Thread.sleep(3000);
				driver.findElement(By.name(" Delete")).click();
				break;
				
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
}

		
	


