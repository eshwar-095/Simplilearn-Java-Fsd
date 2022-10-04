package com.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
		driver.findElement(By.name("login")).submit();
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Eshwar\\Testing\\chromedriver_win32\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
	
}
