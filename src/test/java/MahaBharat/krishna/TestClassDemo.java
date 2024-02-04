package MahaBharat.krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */

public class TestClassDemo {
	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void testApp() {
		driver.get("https://www.google.com");
		driver.getTitle();
		System.out.println("CI Pipe");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("CLosed Test Cases");
	}

}
