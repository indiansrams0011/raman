package test.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	
	@BeforeSuite
	private void beforeSuite() {
System.out.println("before suit");
	}
	@AfterSuite
	private void afterSuite() {
System.out.println("after suit");
	}
	@BeforeTest
	private void beforeTest() {
System.out.println("before test");
	}
	@AfterTest
	private void afterTest() {
System.out.println("after test");
	}
	@BeforeClass
	private void beforeClass() {
System.out.println("before class");
	}
	@AfterClass
	private void afterClass() {
System.out.println("after class");
	}
	@BeforeMethod
	private void beforeMethod() {
System.out.println("before method");
	}
	@AfterMethod
	private void afterMethod() {
System.out.println("after method");
	}
	@Test
	private void test() {
System.out.println("test");
	}
	@Test
	private void Test1() {
System.out.println("test1");
	}
}
