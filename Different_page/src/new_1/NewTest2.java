package new_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void home() 
  {
	  
	 
			driver.navigate().to("https://www.flipkart.com/"); 
	  
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("x'mas gift");
            driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
  

}
}
