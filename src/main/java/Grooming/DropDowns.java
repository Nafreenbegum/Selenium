package Grooming;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement allDropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(allDropdown);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(2000);
		s.selectByVisibleText("Computers & Accessories");
		Thread.sleep(2000);
		List<WebElement> options = s.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());	
		}
		System.out.println("-----------------------------------------------------");
		if(s.isMultiple())
			System.out.println("Multiple dropdown");
		else
			System.out.println("single dropdown");
		driver.quit();
				
	}

}
