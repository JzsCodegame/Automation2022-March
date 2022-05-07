package Sprint1;

import org.testng.annotations.Test;

public class Day6 {


	@Test(priority = 6, dependsOnMethods = {"signin"})
	public void Createaccount() {
		//next class
	}
}
