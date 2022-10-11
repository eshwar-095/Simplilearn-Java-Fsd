package com.demo;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	WebDriver driver1;
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eshwar\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}
	
	@AfterMethod
	public void afterMethod() {
		driver=null;
		driver1=null;
		
	}
	@Test
	public void chromeTest() throws Exception {
		  
		  System.out.println(driver.getTitle());
		  
		  Thread.sleep(5000);
		  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("8695029266");
		  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("Eshwar*2000");
		  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button")).click();
			
		  Thread.sleep(4000);
		  driver.findElement(By.name("q")).sendKeys("iphone13");
		  driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button")).submit();
			
		  Thread.sleep(4000);
	      WebElement element= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	      System.out.println(element.getText());
	      
	      Thread.sleep(4000);
	      ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	      System.out.println("Reached At bottom of the page");
		
	      Thread.sleep(4000);
	      WebElement img = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img"));
	      Boolean load = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", img);
	      if (load) {
		         System.out.println("Images are loaded");
		      } else {
		         System.out.println("Images are not loaded ");
		      }
		}	
	
	@Test
	public void operaTest() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Eshwar\\Testing\\chromedriver_win32\\geckodriver.exe");
		driver1= new FirefoxDriver();
		driver1.get("https://www.flipkart.com/");
		driver1.manage().window().maximize();
		System.out.println(driver1.getTitle());
		  
		  Thread.sleep(5000);
		  driver1.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("8695029266");
		  driver1.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("Eshwar*2000");
		  driver1.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button")).click();
		  
		  Thread.sleep(4000);
		  driver1.findElement(By.name("q")).sendKeys("iphone13");
		  driver1.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button")).submit();
	}
	
}
