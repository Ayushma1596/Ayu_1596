package G_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	WebDriver driver;
	 @BeforeTest(groups= {"Smoke"})
	 public void test()
	 {

		 System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	     driver.get("https://www.flipkart.com/");
	 }
		
	  @Test(groups= {"Smoke"})
	  
	  public void Log() {
		 
			
			//driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();
			driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8390797320");
			driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Ayu@1596");;
			driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
	  }
	  @Test(groups= {"Smoke"})
	  
	  public void buy()
	  {
		  
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
	      driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("x'mas gift");
	      driver.findElement(By.xpath("//button[@class='vh79eN']")).click();


	  }
	}






