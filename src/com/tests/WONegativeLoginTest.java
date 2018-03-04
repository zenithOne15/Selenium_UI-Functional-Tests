package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BrowserUtils;

public class WONegativeLoginTest {

	WebDriver driver;
	String chromePath ="C:\\Users\\Janara\\Documents\\Selenium\\selenium dependencies\\drivers\\chromedriver.exe";
			
	@BeforeClass
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void wrongUserName() throws InterruptedException {
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		BrowserUtils brow = new BrowserUtils();
		String title1 = driver.getTitle();
		String title2 = "Web Orders Login";
		brow.verifyTitleMatches(driver, title1, title2);
		
		String url1= driver.getCurrentUrl();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Test");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
			
		String webTitle = driver.getTitle();
		brow.verifyTitleMatches(driver, webTitle , "Web Orders Login");
		
		String url = driver.getCurrentUrl();
		brow.verifyURLMatches(driver, url, url1);
		}

	@Test
	public void wrongPassword() throws InterruptedException {
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		BrowserUtils brow = new BrowserUtils();
		String title1 = driver.getTitle();
		String title2 = "Web Orders Login";
		brow.verifyTitleMatches(driver, title1, title2);
		
		String url1= driver.getCurrentUrl();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
			
		String webTitle = driver.getTitle();
		brow.verifyTitleMatches(driver, webTitle , "Web Orders Login");
		
		String url = driver.getCurrentUrl();
		brow.verifyURLMatches(driver, url, url1);
		}
	
	@Test
	public void blankUserName() throws InterruptedException {
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		BrowserUtils brow = new BrowserUtils();
		String title1 = driver.getTitle();
		String title2 = "Web Orders Login";
		brow.verifyTitleMatches(driver, title1, title2);
		
		String url1= driver.getCurrentUrl();
		
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
			
		String webTitle = driver.getTitle();
		brow.verifyTitleMatches(driver, webTitle , "Web Orders Login");
		
		String url = driver.getCurrentUrl();
		brow.verifyURLMatches(driver, url, url1);
		}

	@Test
	public void blankPassword() throws InterruptedException {
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		BrowserUtils brow = new BrowserUtils();
		String title1 = driver.getTitle();
		String title2 = "Web Orders Login";
		brow.verifyTitleMatches(driver, title1, title2);
		
		String url1= driver.getCurrentUrl();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
			
		String webTitle = driver.getTitle();
		brow.verifyTitleMatches(driver, webTitle , "Web Orders Login");
		
		String url = driver.getCurrentUrl();
		brow.verifyURLMatches(driver, url, url1);
		}

		

	
	
	
	
}
