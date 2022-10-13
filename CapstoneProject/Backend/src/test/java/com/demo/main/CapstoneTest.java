package com.demo.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CapstoneTest {
  
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eshwar\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver=null;		
	}
	
	@Test
	public void loginTest() throws Exception {
		  System.out.println(driver.getTitle());
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/app-root/app-login/form/div[2]/input[1]")).sendKeys("8595746785");
		  driver.findElement(By.cssSelector("body > app-root > app-login > form > div:nth-child(2) > input:nth-child(4)")).sendKeys("MSd*7");
		  driver.findElement(By.cssSelector("body > app-root > app-login > form > div:nth-child(2) > button")).click();
				
}
	@Test
	public void registerTest() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div[3]/button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Thea");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("T67");
		driver.findElement(By.xpath("//*[@id=\"emailid\"]")).sendKeys("thea12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("6-8-2000");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("No:01,New York");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("F");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("8585969647");
		driver.findElement(By.cssSelector("body > app-root > app-register > div > div > form > button")).click();
	}
	
	@Test
	public void admin() throws Exception {
		  System.out.println(driver.getTitle());
		  Thread.sleep(3000);
		  driver.findElement(By.cssSelector("body > app-root > app-login > form > div:nth-child(4) > button")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/app-root/app-adminlogin/form/div[2]/input[1]")).sendKeys("Admin12");
		  driver.findElement(By.cssSelector("body > app-root > app-adminlogin > form > div.container > input:nth-child(4)")).sendKeys("admin@45");
		  driver.findElement(By.cssSelector("body > app-root > app-adminlogin > form > div.container > button")).click();
				
}
	
	
}
