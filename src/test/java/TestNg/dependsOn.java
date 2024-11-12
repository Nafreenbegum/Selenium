package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOn {
	@Test
	public void RegistrationTest() {
		Reporter.log("Register to App",true);
		//Assert.fail();
	}
		@Test(dependsOnMethods="RegistrationTest")
		public void LoginTest()
		{
			Reporter.log("Login to App",true);
		}
		@Test(dependsOnMethods="LoginTest")
		public void updateProfileTest()
		{
			Reporter.log("updatetheprofile",true);
		}
	

}
