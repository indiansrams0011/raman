package test.Sample;

import org.testng.annotations.Test;

public class Multiple {

	@Test(priority=-9)
	private void userName() {
		System.out.println("user name");
	}

	@Test
	private void password() {
		System.out.println("password");
	}

	@Test(priority=0)
	private void lastName() {
		System.out.println("user name"); //-value,0,+value , not mention any one it take default value is zero//
	}

	@Test(priority=10)
	private void firstName() {
		System.out.println("user name");

	}

	{

	}
}