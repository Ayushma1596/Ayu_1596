package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Url1
{
	WebDriver driver;
			
@BeforeTest

public void Test() {
	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\gecodriver.exe");
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
}
@Test
		public void Home()

		{
			 driver.findElement(By.id("email")).sendKeys("Ayushmapadole18@gmail.com");
			 driver.findElement(By.id("pass")).sendKeys("Akash@91");
			 driver.findElement(By.id("u_0_4")).click();
			 
		 
		}
}


