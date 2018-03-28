package com.Enola;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Holmes {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		


System.setProperty("webdriver.gecko.driver","\\home\\prakash\\Downloads\\geckodriver-v0.20.0-linux32");
		 
		driver = new FirefoxDriver();
	}
	@Test
	public void Login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	}
	@AfterSuite
	public void Teardown() {
		
		driver.close();
	}

}
