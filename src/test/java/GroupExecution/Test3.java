package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test(groups="Regression")
	public void demo1()
	{
		Reporter.log("Test1-demo1-smoke",true);
	}
	@Test(groups="sanity")
	public void demo2()
	{
		Reporter.log("Test1-demo2-sanity",true);
	}@Test(groups={"Regression","sanity"})
	public void demo3()
	{
		Reporter.log("Test1-demo3-Regressionand sanity",true);
	}

}
