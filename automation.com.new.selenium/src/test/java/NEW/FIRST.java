package NEW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FIRST
	{
		WebDriver driver;
				
	@BeforeTest

	public void Test() {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\gecodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");

}
	}
