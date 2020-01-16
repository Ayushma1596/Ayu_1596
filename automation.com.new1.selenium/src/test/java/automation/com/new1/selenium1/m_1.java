package automation.com.new1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class m_1 {
	WebDriver driver;
	@Test
	public void g1()
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  
		driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("123");

}
}
