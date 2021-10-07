package test.Sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampletesting {

	static WebDriver driver;

	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterClass
	private void afterClass() {
		driver.quit();
	}

	@Test(priority = -8)
	private void username() {
		driver.findElement(By.id("email")).sendKeys("Raman");
	}

	@Test
	private void password() {
		driver.findElement(By.id("pass")).sendKeys("Raman123");
	}

	@Test(priority = 8)
	private void btnLogin() {
		driver.findElement(By.name("login")).click();

	}

}
