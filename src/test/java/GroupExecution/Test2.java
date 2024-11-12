package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(groups="smoke")
	public void demo1()
	{
		Reporter.log("Test1-demo1-smoke",true);
	}
	@Test(groups="Regression")
	public void demo2()
	{
		Reporter.log("Test1-demo2-Regression",true);
	}@Test(groups={"smoke","Regression"})
	public void demo3()
	{
		Reporter.log("Test1-demo3-smoke and Regression",true);
	}

}
