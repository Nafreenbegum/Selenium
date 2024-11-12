package assertions;

import org.testng.annotations.Test;

public class WhyNotIfELse {
	@Test
	public void demo() {
		String s1="Hello";
		String s2="Hii";
		if(s1.equals(s2))
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
