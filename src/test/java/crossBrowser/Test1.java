package crossBrowser;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	@Test
	public void googleTest()
	{
		driver.get("https://www.google.co.in/");
	}
}
